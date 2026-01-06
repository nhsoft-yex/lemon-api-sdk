package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleBookUpdateDTO模型
 * 批发订单更新参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleBookUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发订单号", example="WB2030990000004", required=true)
    private String wholesaleBookFid;
    @ApiCloudField(value="仓库编码", example="203000002")
    private Integer storehouseNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String wholesaleBookOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String wholesaleBookMemo;
    @ApiCloudField(value="批发预订单号")
    private String wholesaleBookBillNo;
    @ApiCloudField(value="外部流水号(最大长度50)", example="A0001")
    private String wholesaleBookOutBillNo;
    @ApiCloudField(value="销售员", example="管理员")
    private String wholesaleBookSeller;
    @ApiCloudField(value="订购日期 格式：yyyy-MM-dd", example="2021-01-18", required=true)
    private String wholesaleBookDate;
    @ApiCloudField(value="交货期限 格式：yyyy-MM-dd", example="2021-01-18", required=true)
    private String wholesaleBookDeadline;
    @ApiCloudField(value="期望送达时间 格式：yyyy-MM-dd", example="2021-01-18")
    private String wholesaleBookExpectTime;
    @ApiCloudField(value="运费", example="2.0")
    private BigDecimal wholesaleBookPostFee;
    @ApiCloudField(value="订单明细", required=true)
    private List<WholesaleBookDetailSaveDTOModel> wholesaleBookDetails;
    @ApiCloudField(value="配送方式")
    private String wholesaleBookTransferType;
    @ApiCloudField(value="address_id", example="0060099990007553-1")
    private String addressId;
}
