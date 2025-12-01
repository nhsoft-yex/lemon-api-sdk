package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerOrderFindDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerOrderFindDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编码", example="110050001")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="000000000041")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="商品单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="商品单价（小数点4位）", example="1.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="申请数量（小数点3位）", example="5.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="批复数量", example="5.0")
    private BigDecimal itemApproveQty;
    @ApiCloudField(value="金额（小数点2位）", example="1.0")
    private BigDecimal itemMoney;
    @ApiCloudField(value="换算率", example="0.1")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="辅助单位", example="斤")
    private String itemAssistUnit;
    @ApiCloudField(value="辅助数量", example="1.0")
    private BigDecimal itemAssistQty;
    @ApiCloudField(value="商品备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="商品批复备注", example="备注信息")
    private String itemApproveMemo;
    @ApiCloudField(value="批复金额", example="10.0")
    private BigDecimal itemReplyMoney;
    @ApiCloudField(value="批次号", example="20230108")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期", example="2025-01-01")
    private String itemProducingDate;
    @ApiCloudField(value="调入仓库", example="9967500001")
    private Integer inStorehouseNum;
}
