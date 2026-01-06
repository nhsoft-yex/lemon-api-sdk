package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutBookSaveDTO模型
 * WMS出库订单保存
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutBookSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="211300001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="客户编码", example="5597", required=true)
    private String clientNum;
    @ApiCloudField(value="关联要货单号", example="YH2113132404220001")
    private String requestOrderFid;
    @ApiCloudField(value="外部单号")
    private String outOrderFid;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="备注", example="测试")
    private String outWarehouseBookOrderMemo;
    @ApiCloudField(value="配送日期", example="Mon Apr 01 08:00:00 CST 2024")
    private String outWarehouseBookOrderDeliveryDate;
    @ApiCloudField(value="有效日期", example="Mon Apr 01 08:00:00 CST 2024")
    private String outWarehouseBookOrderDeadline;
    @ApiCloudField(value="订单渠道类型")
    private String orderChannelsType;
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
    @ApiCloudField(value="买家留言")
    private String receiveMemo;
    @ApiCloudField(value="收件人联系电话")
    private String receivePhone;
    @ApiCloudField(value="收件人省")
    private String receiveProvince;
    @ApiCloudField(value="收件人市")
    private String receiveCity;
    @ApiCloudField(value="收件人区")
    private String receiveArea;
    @ApiCloudField(value="收件人街道")
    private String receiveTown;
    @ApiCloudField(value="收件人地址")
    private String receiveAddr;
    @ApiCloudField(value="收件人")
    private String receiver;
    @ApiCloudField(value="总金额", example="20.0")
    private BigDecimal totalMoney;
    @ApiCloudField(value="创建时间(不传，则默认当前系统时间)")
    private String createTime;
    @ApiCloudField(value="审核时间(不传，则默认当前系统时间)")
    private String auditTime;
    @ApiCloudField(value="更新时间(不传，则默认当前系统时间)")
    private String updateTime;
    @ApiCloudField(value="出库明细", required=true)
    private List<WmsOutBookSaveDetailDTOModel> details;
}
