package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsReturnOrderSaveDTO模型
 * WMS销退订单保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsReturnOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="211300001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="客户编码", example="5597", required=true)
    private String clientNum;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="外部单号")
    private String outOrderFid;
    @ApiCloudField(value="店铺名称", example="测试店铺")
    private String shopName;
    @ApiCloudField(value="承运商", example="OTHER")
    private String carrierNo;
    @ApiCloudField(value="订单来源", example="旺店通")
    private String orderSource;
    @ApiCloudField(value="扩展字段1")
    private String extend1;
    @ApiCloudField(value="扩展字段2")
    private String extend2;
    @ApiCloudField(value="扩展字段3")
    private String extend3;
    @ApiCloudField(value="总金额", example="20.0")
    private BigDecimal totalMoney;
    @ApiCloudField(value="创建时间(不传，则默认当前系统时间)")
    private String createTime;
    @ApiCloudField(value="审核时间(不传，则默认当前系统时间)")
    private String auditTime;
    @ApiCloudField(value="更新时间(不传，则默认当前系统时间)")
    private String updateTime;
    @ApiCloudField(value="退货明细", required=true)
    private List<WmsReturnOrderSaveDetailDTOModel> details;
}
