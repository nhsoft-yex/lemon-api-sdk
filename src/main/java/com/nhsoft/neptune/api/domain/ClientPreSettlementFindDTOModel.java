package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientPreSettlementFindDTO模型
 * 客户预收结算查询参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientPreSettlementFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="客户编号列表", example="[434400001，434400002]")
    private List<String> clientFids;
    @ApiCloudField(value="时间类型", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateTo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="20", required=true)
    private Integer pageSize;
}
