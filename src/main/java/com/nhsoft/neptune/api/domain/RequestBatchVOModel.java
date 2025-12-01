package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestBatchVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestBatchVOModel extends ApiCloudObject {

    @ApiCloudField(value="模板编号", example="434400001")
    private Long id;
    @ApiCloudField(value="模板名称", example="要货周期模板")
    private String name;
    @ApiCloudField(value="截止时间(该字段将被弃用，请使用end_time)", example="2022-08-15 20:00:00")
    private String deadTime;
    @ApiCloudField(value="开始时间", example="00:00")
    private String startTime;
    @ApiCloudField(value="截止时间", example="20:00")
    private String endTime;
    @ApiCloudField(value="开始日期", example="2024-01-01")
    private String requestBatchDateFrom;
    @ApiCloudField(value="结束日期", example="2024-01-01")
    private String requestBatchDateTo;
    @ApiCloudField(value="订货周期(按天|按星期)", example="按天")
    private String requestBatch;
    @ApiCloudField(value="订货天数", example="1")
    private Integer requestBatchDay;
    @ApiCloudField(value="订货星期", example="星期一,星期二")
    private String requestBatchWeek;
    @ApiCloudField(value="配送星期", example="2345671")
    private String transferBatchWeek;
    @ApiCloudField(value="配送日期(当天|一天后|两天后|三天后|四天后|五天后)", example="当天")
    private String transferDay;
    @ApiCloudField(value="备注", example="备注")
    private String requestBatchMemo;
    @ApiCloudField(value="是否启用短信提醒", example="false")
    private Boolean requestBatchSmsReminder;
    @ApiCloudField(value="截止后未要货，按建议订量自动生成", example="true")
    private Boolean requestBatchAutoRequest;
    @ApiCloudField(value="商品范围按部门划分", example="003")
    private List<String> requestBatchItemDepartmentCodes;
    @ApiCloudField(value="发货门店", example="99")
    private Integer sendBranchNum;
    @ApiCloudField(value="商品范围按品类划分", example="78237865")
    private List<String> requestBatchItemCategoryCodes;
    @ApiCloudField(value="商品明细", example="4344001")
    private List<RequestBatchDetailVOModel> requestBatchDetails;
    @ApiCloudField(value="应用门店", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="更新时间", example="2022-08-15 20:00:00")
    private String updateTime;
    @ApiCloudField(value="应用于所有门店", example="true")
    private Boolean applyAllBranch;
    @ApiCloudField(value="商品范围按品类划分", example="78237865")
    private List<String> requestBatchItemCategoryCounts;
    @ApiCloudField(value="订货周期(按日期)，数字逗号隔开", example="1,2,5")
    private String requestBatchDate;
    @ApiCloudField(value="配送日期(按日期)")
    private Integer transferBatchDate;
    @ApiCloudField(value="最高订购件数", example="20")
    private BigDecimal requestBatchMaxUseQty;
    @ApiCloudField(value="最低订购件数", example="1")
    private BigDecimal requestBatchMinUseQty;
    @ApiCloudField(value="每日最高订购金额")
    private BigDecimal requestBatchMaxMoney;
    @ApiCloudField(value="要货周期起订金额")
    private BigDecimal requestBatchMinMoney;
    @ApiCloudField(value="要货周期类型(0:线下要货周期|1:线上要货周期|2:直销要货周期)", example="0")
    private Integer requestBatchType;
    @ApiCloudField(value="仓库编号", example="9967500001")
    private Integer storehouseNum;
    @ApiCloudField(value="角色", example="")
    private List<RequestBatchRoleVOModel> requestBatchRoles;
    @ApiCloudField(value="全部商品", example="true")
    private Boolean requestBatchItemAll;
    @ApiCloudField(value="是否启用", example="false")
    private Boolean enableRequestBatch;
}
