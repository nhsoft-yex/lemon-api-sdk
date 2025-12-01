package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiptOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiptOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据编号", example="RC0000820211102000001", required=true)
    private String id;
}
