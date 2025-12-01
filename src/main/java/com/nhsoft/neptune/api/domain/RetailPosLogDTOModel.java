package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RetailPosLogDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RetailPosLogDTOModel extends ApiCloudObject {

    @ApiCloudField(value="主键", example="207201203221070021")
    private String retailPosLogId;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="日志生成日期", example="20230311")
    private String retailPosLogBizday;
    @ApiCloudField(value="操作人", example="管理员")
    private String retailPosLogOperator;
    @ApiCloudField(value="日志生成时间")
    private String retailPosLogTime;
    @ApiCloudField(value="日志类型", example="整单取消")
    private String retailPosLogType;
    @ApiCloudField(value="商品编码", example="207200855")
    private Integer retailPosLogItemNum;
    @ApiCloudField(value="商品名称", example="测试商品660")
    private String retailPosLogItemName;
    @ApiCloudField(value="备注", example="测试")
    private String retailPosLogMemo;
    @ApiCloudField(value="授权人", example="管理员")
    private String retailPosLogAuthorize;
    @ApiCloudField(value="单据金额", example="6.77")
    private BigDecimal retailPosLogMoney;
    @ApiCloudField(value="班次号", example="664001")
    private Integer retailPosLogShiftNum;
    @ApiCloudField(value="机器号", example="00-DB-D0-B7-D7-9C")
    private String retailPosLogMachine;
    @ApiCloudField(value="单据号", example="207201230696640012")
    private String retailPosLogOrderNo;
    @ApiCloudField(value="是否上传", example="false")
    private Boolean retailPosLogUpload;
    @ApiCloudField(value="商户编号", example="0")
    private Integer merchantNum;
    @ApiCloudField(value="档口编号", example="0")
    private Integer stallNum;
    @ApiCloudField(value="标准价", example="3.79")
    private BigDecimal retailPosLogStdPrice;
    @ApiCloudField(value="单价", example="3.79")
    private BigDecimal retailPosLogPrice;
    @ApiCloudField(value="商品售价2", example="3.79")
    private BigDecimal retailPosLogPrice2;
    @ApiCloudField(value="数量", example="2.856")
    private BigDecimal retailPosLogAmount;
}
