package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutBookCheckJobFinishedResultVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutBookCheckJobFinishedResultVOModel extends ApiCloudObject {

    @ApiCloudField(value="要货单号", example="YH996750000001")
    private String requestOrderFid;
    @ApiCloudField(value="是否完成作业", example="true")
    private Boolean finishFlag;
    @ApiCloudField(value="失败原因", example="要货单作业未结束")
    private String failMessage;
}
