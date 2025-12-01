package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientCollectionFindDTO模型
 * 客户收款查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientCollectionFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="结算门店", example="1")
    private Integer branchNum;
    @ApiCloudField(value="日期类型(制单时间|审核时间|收款日期)", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="客户收款单号", example="CC99675990000027")
    private String collectionNo;
    @ApiCloudField(value="状态代码(1：制单；3：审核)", example="1")
    private Integer stateCode;
    @ApiCloudField(value="现金银行编号", example="43440001")
    private Integer accountBankNum;
    @ApiCloudField(value="制单人", example="admin")
    private String collectionCreator;
    @ApiCloudField(value="审核人", example="admin")
    private String collectionAuditor;
    @ApiCloudField(value="收款方式", example="现金")
    private String collectionType;
    @ApiCloudField(value="客户列表", example="1")
    private List<String> clientNums;
    @ApiCloudField(value="明细查询", example="true")
    private Boolean withDetail;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="20", required=true)
    private Integer pageSize;
}
