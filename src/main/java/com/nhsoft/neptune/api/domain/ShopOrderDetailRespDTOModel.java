package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ShopOrderDetailRespDTO模型
 * 商城订单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShopOrderDetailRespDTOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer orderDetailId;
    @ApiCloudField(value="商品ID", example="676916")
    private Integer productId;
    @ApiCloudField(value="商品名称", example="苹果")
    private String productName;
    @ApiCloudField(value="单价", example="1.0")
    private BigDecimal price;
    @ApiCloudField(value="商品数量", example="1.0")
    private BigDecimal quantity;
    @ApiCloudField(value="基本数量单位", example="1.0")
    private BigDecimal baseUnitNum;
    @ApiCloudField(value="实付金额", example="1.0")
    private BigDecimal readMoney;
    @ApiCloudField(value="合计金额", example="1.0")
    private BigDecimal totalMoney;
    @ApiCloudField(value="商品编码", example="207301564")
    private String skuCode;
    @ApiCloudField(value="商品图片", example="http://nhsoft-mercury.oss-cn-hangzhou.aliyuncs.com/public/system/mercury/asset2s/attachments/001/318/860/original/bx.jpg")
    private String imageUrl;
}
