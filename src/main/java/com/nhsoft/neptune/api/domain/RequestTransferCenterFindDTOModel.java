package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestTransferCenterFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestTransferCenterFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="时间类型:制单时间、审核时间、到期时间、要货时间、采购日", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期(yyyy-MM-dd)", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期(yyyy-MM-dd)(与date_from时间间隔不能超过5天)", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateTo;
    @ApiCloudField(value="time_from")
    private LocalTimeModel timeFrom;
    @ApiCloudField(value="time_to")
    private LocalTimeModel timeTo;
    @ApiCloudField(value="要货门店", example="99")
    private List<Integer> branchNums;
    @ApiCloudField(value="配送中心", example="99")
    private Integer outBranchNum;
    @ApiCloudField(value="valid")
    private Boolean valid;
    @ApiCloudField(value="page")
    private Boolean page;
    @ApiCloudField(value="item_nums")
    private List<Integer> itemNums;
    @ApiCloudField(value="item_departments")
    private List<String> itemDepartments;
    @ApiCloudField(value="item_category_codes")
    private List<String> itemCategoryCodes;
    @ApiCloudField(value="supplier_num")
    private Integer supplierNum;
    @ApiCloudField(value="order_type")
    private Integer orderType;
    @ApiCloudField(value="request_order_fid")
    private String requestOrderFid;
    @ApiCloudField(value="storehouse_num")
    private Integer storehouseNum;
    @ApiCloudField(value="查询页码", example="1")
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10")
    private Integer pageSize;
    @ApiCloudField(value="按拓展属性6过滤", example="")
    private String filterByItemExtend6;
    @ApiCloudField(value="供应商编号", example="")
    private List<Integer> supplierNums;
}
