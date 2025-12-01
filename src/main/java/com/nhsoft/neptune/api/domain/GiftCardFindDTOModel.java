package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为100)", example="1", required=true)
    private Integer pageSize;
    @ApiCloudField(value="根据手机号查询", example="17644219987", required=true)
    private String customerPhone;
}
