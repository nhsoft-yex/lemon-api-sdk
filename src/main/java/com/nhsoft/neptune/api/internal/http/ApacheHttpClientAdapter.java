package com.nhsoft.neptune.api.internal.http;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Apache HttpClient 适配器示例
 * 展示如何使用 Apache HttpClient 替换默认的 OkHttp 实现
 */
public class ApacheHttpClientAdapter implements HttpClient {

    private final CloseableHttpClient httpClient;

    public ApacheHttpClientAdapter() {
        this.httpClient = HttpClients.createDefault();
    }

    public ApacheHttpClientAdapter(CloseableHttpClient httpClient) {
        this.httpClient = httpClient != null ? httpClient : HttpClients.createDefault();
    }

    @Override
    public HttpResponse get(String url, Map<String, String> params, Map<String, String> headers) throws IOException {
        String fullUrl = buildUrlWithParams(url, params);
        HttpGet httpGet = new HttpGet(fullUrl);

        // 添加请求头
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpGet.addHeader(entry.getKey(), entry.getValue());
            }
        }

        try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
            return new HttpResponse(
                    response.getStatusLine().getStatusCode(),
                    entityToString(response.getEntity()),
                    headersToMap(response.getAllHeaders())
            );
        }
    }

    @Override
    public HttpResponse post(String url, String body, Map<String, String> headers) throws IOException {
        HttpPost httpPost = new HttpPost(url);

        // 添加请求头
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpPost.addHeader(entry.getKey(), entry.getValue());
            }
        }

        // 设置请求体
        if (body != null) {
            StringEntity entity = new StringEntity(body, "UTF-8");
            httpPost.setEntity(entity);
        }

        try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
            return new HttpResponse(
                    response.getStatusLine().getStatusCode(),
                    entityToString(response.getEntity()),
                    headersToMap(response.getAllHeaders())
            );
        }
    }

    @Override
    public HttpResponse postForm(String url, Map<String, String> params, Map<String, String> headers) throws IOException {
        HttpPost httpPost = new HttpPost(url);

        // 添加请求头
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpPost.addHeader(entry.getKey(), entry.getValue());
            }
        }

        // 设置表单参数
        if (params != null && !params.isEmpty()) {
            List<NameValuePair> formParams = new ArrayList<>();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(formParams, "UTF-8");
            httpPost.setEntity(formEntity);
        }

        try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
            return new HttpResponse(
                    response.getStatusLine().getStatusCode(),
                    entityToString(response.getEntity()),
                    headersToMap(response.getAllHeaders())
            );
        }
    }

    private String buildUrlWithParams(String url, Map<String, String> params) {
        if (params == null || params.isEmpty()) {
            return url;
        }

        try {
            URIBuilder uriBuilder = new URIBuilder(url);
            for (Map.Entry<String, String> entry : params.entrySet()) {
                uriBuilder.addParameter(entry.getKey(), entry.getValue());
            }
            return uriBuilder.toString();
        } catch (URISyntaxException e) {
            // 如果URI构建失败，回退到简单拼接方式
            StringBuilder sb = new StringBuilder(url);
            sb.append("?");

            boolean first = true;
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (!first) {
                    sb.append("&");
                }
                sb.append(entry.getKey()).append("=").append(entry.getValue());
                first = false;
            }

            return sb.toString();
        }
    }

    private String entityToString(HttpEntity entity) throws IOException {
        if (entity == null) {
            return "";
        }
        return EntityUtils.toString(entity, "UTF-8");
    }

    private Map<String, String> headersToMap(org.apache.http.Header[] headers) {
        Map<String, String> headersMap = new HashMap<>();
        if (headers != null) {
            for (org.apache.http.Header header : headers) {
                headersMap.put(header.getName(), header.getValue());
            }
        }
        return headersMap;
    }

    /**
     * 关闭HttpClient释放资源
     */
    public void close() throws IOException {
        if (httpClient != null) {
            httpClient.close();
        }
    }
}