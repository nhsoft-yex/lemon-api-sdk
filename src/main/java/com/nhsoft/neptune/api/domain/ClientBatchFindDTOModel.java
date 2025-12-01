package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientBatchFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientBatchFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户id列表", example="[0099675990000001]", required=true)
    private List<String> clientFids;
}
