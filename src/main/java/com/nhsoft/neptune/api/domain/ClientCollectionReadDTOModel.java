package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientCollectionReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientCollectionReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户收款单号", example="CC99675990000027", required=true)
    private String collectionNo;
}
