package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiptOrderFindDTO模型
 * 收款单查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiptOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="目标单位ID", example="R00001000909")
    private String dstUnitId;
    @ApiCloudField(value="源单位ID", example="R00001000909")
    private String srcUnitId;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="2021-01-21", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="2021-01-21", required=true)
    private String dateTo;
    @ApiCloudField(value="开始时间(HH:mm:ss)，如果按照业务日期查询，该字段需要为空", example="00:00:00")
    private String timeFrom;
    @ApiCloudField(value="结束时间(HH:mm:ss)，如果按照业务日期查询，该字段需要为空", example="23:59:59")
    private String timeTo;
    @ApiCloudField(value="时间类型(业务日期/制单时间/审核时间),不传为业务日期", example="审核时间")
    private String dateType;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="分页大小", example="100", required=true)
    private Integer pageSize;
    @ApiCloudField(value="状态（CREATED|AUDITED|CANCELED|CONFIRMED|VERIFYING|VERIFIED）", example="AUDITED")
    private String state;
}
