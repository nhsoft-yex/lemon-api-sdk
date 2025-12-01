package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestBatchFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestBatchFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应用门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="是否开启", example="false")
    private Boolean enableRequestBatch;
    @ApiCloudField(value="当前时间（用于过滤是否满足时间）")
    private String dateTime;
}
