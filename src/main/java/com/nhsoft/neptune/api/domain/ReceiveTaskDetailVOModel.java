package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveTaskDetailVO模型
 * 收货任务明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveTaskDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="基本单价", example="10.0")
    private BigDecimal basePrice;
    @ApiCloudField(value="基本数量", example="10.0")
    private BigDecimal baseQty;
    @ApiCloudField(value="营业日", example="20250301")
    private String bizday;
    @ApiCloudField(value="完成时间")
    private String completeTime;
    @ApiCloudField(value="完成人", example="admin")
    private String completeUser;
    @ApiCloudField(value="容器序号", example="1")
    private Integer containerCurrentNum;
    @ApiCloudField(value="容器序列号", example="RQ996582503270003")
    private String containerNumber;
    @ApiCloudField(value="容器数量", example="1")
    private Integer containerQuantity;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemBaseUnit;
    @ApiCloudField(value="商品代码", example="30005")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="ch的标准02")
    private String itemName;
    @ApiCloudField(value="商品系统编码", example="15")
    private Integer itemNum;
    @ApiCloudField(value="赠品基本单位", example="公斤")
    private String itemPresentBaseUnit;
    @ApiCloudField(value="赠品常用单位", example="公斤")
    private String itemPresentUseUnit;
    @ApiCloudField(value="常用单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="批次号", example="20250401")
    private String lotNum;
    @ApiCloudField(value="备注", example="0000")
    private String memo;
    @ApiCloudField(value="库位名称", example="zfb集货位")
    private String positionName;
    @ApiCloudField(value="库位ID", example="325704")
    private Integer positionNum;
    @ApiCloudField(value="赠品基本数量", example="10.0")
    private BigDecimal presentBaseQty;
    @ApiCloudField(value="赠品常用数量", example="10.0")
    private BigDecimal presentUseQty;
    @ApiCloudField(value="赠品换算率", example="1.0")
    private BigDecimal presentUseRate;
    @ApiCloudField(value="生产日期", example="Tue Apr 01 08:00:00 CST 2025")
    private String productionDate;
    @ApiCloudField(value="收货仓库名称", example="仓库A")
    private String receiveStorehouseName;
    @ApiCloudField(value="收货仓库编码", example="996580001")
    private Integer receiveStorehouseNum;
    @ApiCloudField(value="明细编号", example="1")
    private Integer receiveTaskDetailNum;
    @ApiCloudField(value="收货任务编号", example="SR996589925063000001")
    private String receiveTaskFid;
    @ApiCloudField(value="收货时间")
    private String receiveTime;
    @ApiCloudField(value="收货人", example="admin")
    private String receiveUserName;
    @ApiCloudField(value="收货人编号", example="999201")
    private Integer receiveUserNum;
    @ApiCloudField(value="供应商名称", example="WMS供应链一号供应商")
    private String supplierName;
    @ApiCloudField(value="供应商编号", example="996580001")
    private Integer supplierNum;
    @ApiCloudField(value="金额", example="20.0")
    private BigDecimal totalMoney;
    @ApiCloudField(value="单价", example="20.0")
    private BigDecimal usePrice;
    @ApiCloudField(value="数量", example="20.0")
    private BigDecimal useQty;
    @ApiCloudField(value="换算率", example="1.0")
    private BigDecimal useRate;
}
