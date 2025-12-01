package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestBatchUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestBatchUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="模板名称", example="", required=true)
    private String name;
    @ApiCloudField(value="是否启用", example="false")
    private Boolean enableRequestBatch;
    @ApiCloudField(value="应用门店", example="")
    private List<Integer> branchNums;
    @ApiCloudField(value="发货门店")
    private Integer sendBranchNum;
    @ApiCloudField(value="要货周期类型(0：线下要货周期|1：线上要货周期|2：直销要货周期)", example="0", required=true)
    private Integer requestBatchType;
    @ApiCloudField(value="角色类型编号列表", example="")
    private List<Integer> roleIds;
    @ApiCloudField(value="用户编号列表", example="")
    private List<Integer> appUserNums;
    @ApiCloudField(value="仓库编码")
    private Integer storehouseNum;
    @ApiCloudField(value="最低订购样数")
    private Integer requestBatchMinCount;
    @ApiCloudField(value="订货周期(按天|按星期|按日期)", example="按天")
    private String requestBatch;
    @ApiCloudField(value="订货日期(天)")
    private Integer requestBatchDay;
    @ApiCloudField(value="订货周期(周) (7位数字代表周一到周日，1：当天订货；0：当天不定货)", example="1100000")
    private String requestBatchWeek;
    @ApiCloudField(value="订货周期(按日期)，数字逗号隔开", example="1,2,31")
    private String requestBatchDate;
    @ApiCloudField(value="配送周期(周) (7位数字，每一位数字代表周一到周日中其中一天)", example="1234567")
    private String transferBatchWeek;
    @ApiCloudField(value="配送日期(当天|一天后|两天后|三天后|四天后|五天后|六天后|七天后)", example="当天")
    private String transferDay;
    @ApiCloudField(value="最高订购件数")
    private BigDecimal requestBatchMaxUseQty;
    @ApiCloudField(value="最低订购件数")
    private BigDecimal requestBatchMinUseQty;
    @ApiCloudField(value="每日最高订购金额")
    private BigDecimal requestBatchMaxMoney;
    @ApiCloudField(value="开始日期")
    private String requestBatchDateFrom;
    @ApiCloudField(value="结束日期")
    private String requestBatchDateTo;
    @ApiCloudField(value="开始时间", example="00:00", required=true)
    private String startTime;
    @ApiCloudField(value="截止时间", example="20:00", required=true)
    private String endTime;
    @ApiCloudField(value="备注", example="")
    private String requestBatchMemo;
    @ApiCloudField(value="截止后未要货，按建议订量自动生成", example="false")
    private Boolean requestBatchAutoRequest;
    @ApiCloudField(value="是否启用预约配送", example="false")
    private Boolean requestBatchBookingDelivery;
    @ApiCloudField(value="是否启用短信提醒", example="false")
    private Boolean requestBatchSmsReminder;
    @ApiCloudField(value="类别", example="")
    private List<RequestBatchCategorySaveDetailDTOModel> categoryDetails;
    @ApiCloudField(value="商品部门", example="")
    private List<String> requestBatchItemDepartmentCodes;
    @ApiCloudField(value="全部商品", example="false")
    private Boolean requestBatchItemAll;
    @ApiCloudField(value="明细", example="")
    private List<RequestBatchSaveDetailDTOModel> requestBatchDetails;
    @ApiCloudField(value="要货间隔天数")
    private Integer requestBatchIntervalDay;
    @ApiCloudField(value="配送日期(按日期)")
    private Integer transferBatchDate;
    @ApiCloudField(value="是否线上要货周期", example="false")
    private Boolean requestBatchOnlineFlag;
    @ApiCloudField(value="类别等级(0-8;0为全部类别)", example="0")
    private Integer requestBatchCategoryLevel;
    @ApiCloudField(value="操作人", example="")
    private String operator;
    @ApiCloudField(value="要货周期起订金额")
    private BigDecimal requestBatchMinMoney;
    @ApiCloudField(value="主键")
    private Long id;
}
