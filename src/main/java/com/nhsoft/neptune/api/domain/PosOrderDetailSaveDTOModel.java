package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="150050001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果", required=true)
    private String itemName;
    @ApiCloudField(value="商品数量（小数点3位）", example="1.0", required=true)
    private BigDecimal itemQty;
    @ApiCloudField(value="商品标准售价（小数点4位）", example="1.0", required=true)
    private BigDecimal itemStdPrice;
    @ApiCloudField(value="商品实际价格（小数点4位）", example="1.0", required=true)
    private BigDecimal itemPrice;
    @ApiCloudField(value="金额（小数点2位）", example="1.0", required=true)
    private BigDecimal itemMoney;
    @ApiCloudField(value="商品折扣（小数点2位）", example="0.1", required=true)
    private BigDecimal itemDiscount;
    @ApiCloudField(value="实际应收（小数点2位）", example="1.0", required=true)
    private BigDecimal itemPaymentMoney;
    @ApiCloudField(value="商品状态(1:销售,2:囎送,4:退货,8:取消)", example="1", required=true)
    private Integer itemStateCode;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="item_grade_num")
    private Integer itemGradeNum;
    @ApiCloudField(value="online_qty")
    private BigDecimal onlineQty;
}
