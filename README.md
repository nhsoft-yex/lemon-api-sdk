[![](https://jitpack.io/v/nhsoft-yex/lemon-api-sdk.svg)](https://jitpack.io/#nhsoft-yex/lemon-api-sdk)

# lemon-api-sdk
乐檬开放平台sdk for java，用于简化API调用。

## 快速开始

### 添加依赖

在Maven项目的pom.xml中添加以下依赖（暂没有对外maven仓库，需要下载jar包引入本地项目）：

```xml
<dependency>
    <groupId>com.nhsoft.neptune</groupId>
    <artifactId>apicloud-sdk-java</artifactId>
    <version>2025-11-18.BETA</version>
    <scope>system</scope>
    <systemPath>${project.basedir}/src/main/resources/lib/apicloud-sdk-core-202511.1.jar</systemPath>
</dependency>
```

注意：SDK不强制绑定特定版本的HTTP客户端库，您可以选择以下任一方式：

1. 使用默认的OkHttp（需要额外添加OkHttp依赖）
2. 使用自定义的HTTP客户端实现

### 使用默认OkHttp客户端

如果要使用默认的OkHttp客户端，需要额外添加OkHttp依赖：

```xml
<dependency>
    <groupId>com.squareup.okhttp3</groupId>
    <artifactId>okhttp</artifactId>
    <version>4.9.3</version> <!-- 使用您项目中合适的版本 -->
</dependency>
```

### 基本用法

```java
// 配置客户端
ApiCloudClientConfig config = new ApiCloudClientConfig();
config.setAppId("your-app-id");
config.setSecret("your-secret");

// 创建客户端实例（使用默认的OkHttp实现）
DefaultApiCloudClient client = new DefaultApiCloudClient(config);

// 创建请求
AppUserFindDTOModelRequest request = new AppUserFindDTOModelRequest();
AppUserFindDTOModel model = new AppUserFindDTOModel();
model.setPageNo(1);
model.setPageSize(10);
request.setBizModel(model);

// 执行请求
List<AppUserResponseDTOModel> result = client.execute(request, "access-token");
```

## 自定义HTTP客户端

SDK默认使用OkHttp作为HTTP客户端，但您也可以使用自定义的HTTP客户端实现。

### 使用Apache HttpClient

如果要使用使用Apache HttpClient客户端，需要额外添加依赖：

```xml
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpclient</artifactId>
    <version>4.5.14</version>
</dependency>
        <!-- 添加Apache HttpCore依赖 -->
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpcore</artifactId>
    <version>4.4.16</version>
    <scope>provided</scope>
    <optional>true</optional>
</dependency>
        <!-- 添加Apache HttpClient Mime依赖，用于支持multipart/form-data -->
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpmime</artifactId>
    <version>4.5.14</version>
    <scope>provided</scope>
    <optional>true</optional>
</dependency>
```

```java
// 添加Apache HttpClient依赖
ApiCloudClientConfig config = new ApiCloudClientConfig();
config.setAppId("your-app-id");
config.setSecret("your-secret");

// 使用Apache HttpClient
HttpClient customHttpClient = new ApacheHttpClientAdapter();
config.setHttpClient(customHttpClient);

DefaultApiCloudClient client = new DefaultApiCloudClient(config);
```

## 自定义token存储器

SDK默认使用本地加密文件作为token存储器，但您也可以使用自定义的token存储器实现。
注意：默认本地文件存储token的文件路径为：${user.home}/.local/xxxx.token_store，如果您使用的是容器化技术部署服务，需要把该文件暴露出来，以防止丢失。

### 使用自定义token存储器 (下面实现为使用数据库存储器的伪代码)

``` java

public class CustomTokenStorage implements TokenStorage {
    
    private final TokenDao tokenDao;
    
    @Override
    public void store(TokenInfo tokenInfo) {
        tokenDao.save(tokenInfo);
    }

    @Override
    public void remove(String merchantId) {
        tokenDao.remove(merchantId);
    }

    @Override
    public TokenInfo get(String merchantId) {
        return tokenDao.read(merchantId);
    }
}

//使用自定义token存储器

AuthConfig config = new AuthConfig();
config.setAppId("your-app-id");
config.setSecret("your-secret");
CustomTokenStorage tokenStorage = new CustomTokenStorage();
AuthService authService = new AuthService(config);
TokenManager tokenManager = new TokenManager(tokenStorage, authService);
```

## 依赖说明

本SDK使用了以下可选依赖：

- OkHttp: 默认HTTP客户端实现（需要使用者自行添加）
- Apache HttpClient: Apache HttpClient客户端实现（需要使用者自行添加）
- Jackson: JSON序列化/反序列化

其中Jackson是必需依赖，其他为可选依赖。当使用默认功能时，这些依赖会自动生效。如果您选择自定义HTTP客户端，则OkHttp将成为可选依赖。
