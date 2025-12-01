package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ServerCheckDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ServerCheckDTOModel extends ApiCloudObject {

    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="url")
    private String url;
    @ApiCloudField(value="status")
    private Boolean status;
}
