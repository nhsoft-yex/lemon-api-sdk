package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOtherInoutVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOtherInoutVOModel extends ApiCloudObject {

    @ApiCloudField(value="费用单号", example="OP2072010000016")
    private String otherInoutFid;
    @ApiCloudField(value="门店编码", example="2")
    private Integer branchNum;
    @ApiCloudField(value="营业日", example="20210601")
    private String shiftTableBizday;
    @ApiCloudField(value="班次号", example="22001")
    private Integer shiftTableNum;
    @ApiCloudField(value=" 时间", example="2021-01-27 00:00:00")
    private String otherInoutDate;
    @ApiCloudField(value="收支方向(0-支出,1-收入)", example="1")
    private Integer otherInoutFlag;
    @ApiCloudField(value="费用项目", example="运费")
    private String otherInoutKind;
    @ApiCloudField(value="支付方式", example="现金")
    private String otherInoutPaymentType;
    @ApiCloudField(value="部门", example="食品部")
    private String otherInoutDepartment;
    @ApiCloudField(value="原始单号", example="OP11111")
    private String otherInoutRefBill;
    @ApiCloudField(value="费用金额（小数点2位）", example="1.0")
    private BigDecimal otherInoutMoney;
    @ApiCloudField(value="业务员", example="业务员")
    private String otherInoutOperator;
    @ApiCloudField(value="状态代码", example="1")
    private Integer otherInoutStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String otherInoutStateName;
    @ApiCloudField(value="备注", example="备注信息")
    private String otherInoutMemo;
    @ApiCloudField(value="创建人", example="管理员")
    private String otherInoutCreator;
    @ApiCloudField(value="创建时间 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-27 00:00:00")
    private String otherInoutCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String otherInoutAuditor;
    @ApiCloudField(value="审核时间 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-27 00:00:00")
    private String otherInoutAuditTime;
    @ApiCloudField(value="最后修改时间 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-27 00:00:00")
    private String otherInoutLastEditTime;
}
