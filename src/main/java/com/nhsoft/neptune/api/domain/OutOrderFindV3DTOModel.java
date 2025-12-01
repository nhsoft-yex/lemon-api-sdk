package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutOrderFindV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutOrderFindV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调入门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="调出门店编码（时间类型为最后修改时间允许为空）", example="1")
    private Integer outBranchNum;
    @ApiCloudField(value="起始时间（yyyy-MM-dd）", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间（yyyy-MM-dd（时间限制5天之内））", example="2021-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="时间类型:制单时间、审核时间、最后修改时间、签收时间、调出日期", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="单据状态代码(1:制单 3:制单|审核)", example="[1,3]")
    private List<Integer> stateCodes;
    @ApiCloudField(value="仓库编码", example="1")
    private Integer storehouseNum;
    @ApiCloudField(value="关联要货单号", example="YH4344010004756")
    private String requestOrderFid;
    @ApiCloudField(value="开始时间(HH:mm:ss)", example="13:00:00")
    private String timeFrom;
    @ApiCloudField(value="结束时间(HH:mm:ss)", example="14:00:00")
    private String timeTo;
    @ApiCloudField(value="查询未配货的单据", example="true")
    private Boolean queryUnPick;
    @ApiCloudField(value="查询未发货的单据", example="true")
    private Boolean queryUnSend;
    @ApiCloudField(value="调出单调入状态(0:未调入|1:部分调入|2:全部调入)", example="0")
    private Integer outInState;
    @ApiCloudField(value="request_order_fids")
    private List<String> requestOrderFids;
}
