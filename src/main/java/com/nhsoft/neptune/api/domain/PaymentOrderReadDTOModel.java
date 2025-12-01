package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PaymentOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据编号", example="PC0000820200617000001")
    private String id;
    @ApiCloudField(value="关联单据编号", example="CW55240926000001")
    private String refBillNo;
}
