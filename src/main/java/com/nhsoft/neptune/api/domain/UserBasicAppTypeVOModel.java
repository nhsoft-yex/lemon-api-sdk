package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicAppTypeVO模型
 * 基础应用类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicAppTypeVOModel extends ApiCloudObject {

    @ApiCloudField(value="应用ID(账套号)", example="2099bb45665d478095a6536cfc8d4b0c")
    private String appId;
    @ApiCloudField(value="应用类型", example="AMA")
    private String appType;
    @ApiCloudField(value="版", example="零食")
    private String edition;
    @ApiCloudField(value="分组", example="全渠道零售")
    private String group;
}
