package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardSettlementFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardSettlementFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="制单门店编号", required=true)
    private Integer branchNum;
    @ApiCloudField(value="单据状态代码（1：制单3：制单|审核）")
    private Integer stateCode;
    @ApiCloudField(value="时间类型（制单时间|审核时间|操作时间|最后修改时间）", example="", required=true)
    private String dateType;
    @ApiCloudField(value="审核开始时间(yyyy-mm-dd HH:MM:SS)", example="", required=true)
    private String dateFrom;
    @ApiCloudField(value="审核结束时间(yyyy-mm-dd HH:MM:SS)", example="", required=true)
    private String dateTo;
    @ApiCloudField(value="结算门店编号")
    private Integer toBranchNum;
    @ApiCloudField(value="结算状态 （1:未结算 2:部分结算 3:全部结算）")
    private Integer settlementState;
    @ApiCloudField(value="查询分页页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大50)", example="50", required=true)
    private Integer pageSize;
}
