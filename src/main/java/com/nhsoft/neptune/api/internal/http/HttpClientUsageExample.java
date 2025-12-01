package com.nhsoft.neptune.api.internal.http;

import com.nhsoft.neptune.ApiCloudClientConfig;
import com.nhsoft.neptune.DefaultApiCloudClient;

import java.util.HashMap;
import java.util.Map;

/**
 * HTTP客户端使用示例
 * 展示如何使用自定义HTTP客户端
 */
public class HttpClientUsageExample {
    
    /**
     * 使用默认的OkHttp客户端
     */
    public void useDefaultHttpClient() {
        ApiCloudClientConfig config = new ApiCloudClientConfig();
        config.setAppId("your-app-id");
        config.setSecret("your-secret");
        
        // 使用默认的OkHttp客户端
        DefaultApiCloudClient client = new DefaultApiCloudClient(config);
        
        // 执行API调用...
    }
    
    /**
     * 使用自定义的Apache HttpClient
     */
    public void useApacheHttpClient() {
        ApiCloudClientConfig config = new ApiCloudClientConfig();
        config.setAppId("your-app-id");
        config.setSecret("your-secret");

        // 使用自定义的Apache HttpClient
        HttpClient customHttpClient = new ApacheHttpClientAdapter();
        config.setHttpClient(customHttpClient);

        DefaultApiCloudClient client = new DefaultApiCloudClient(config);

        // 执行API调用...
    }
    
    /**
     * 使用表单POST请求示例
     */
    public void useFormPostExample() throws Exception {
        HttpClient client = new DefaultHttpClient(); // 或者使用ApacheHttpClientAdapter
        
        Map<String, String> formParams = new HashMap<>();
        formParams.put("username", "test");
        formParams.put("password", "123456");
        
        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "ApiCloud SDK");
        
        HttpClient.HttpResponse response = client.postForm("https://example.com/login", formParams, headers);
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody());
    }
}