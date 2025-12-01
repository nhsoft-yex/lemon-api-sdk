package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemLogFindByLogBillNoDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemLogFindByLogBillNoDTOModel extends ApiCloudObject {

    @ApiCloudField(value="关联单号(各业务单据的单号)", example="PI2072000001", required=true)
    private List<String> posItemLogBillNos;
}
