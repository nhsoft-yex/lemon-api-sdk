package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SaleSumFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SaleSumFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店列表（门店列表范围不能超过10个）", example="[99,1]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="营业日开始时间(yyyy-mm-dd)", example="2021-01-19", required=true)
    private String dateStart;
    @ApiCloudField(value="营业日结束时间(yyyy-mm-dd)（时间范围不能超过31天）", example="2021-01-19", required=true)
    private String dateEnd;
    @ApiCloudField(value="单据来源", example="[来源1,来源2]")
    private List<String> orderSources;
    @ApiCloudField(value="单据渠道", example="渠道")
    private String orderCanal;
    @ApiCloudField(value="排序字段（返回字段名称）", example="item_category_name")
    private String sortField;
    @ApiCloudField(value="排序类型（desc,asc）", example="desc")
    private String sortType;
}
