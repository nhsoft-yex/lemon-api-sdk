package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="code")
    private String code;
    @ApiCloudField(value="msg")
    private String msg;
    @ApiCloudField(value="constants")
    private String constants;
}
