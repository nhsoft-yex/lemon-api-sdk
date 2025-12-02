package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleBookVO模型
 * 批发订单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleBookVOModel extends ApiCloudObject {

    @ApiCloudField(value="批发订单号", example="WB2030990000004")
    private String wholesaleBookFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="200300004")
    private Integer storehouseNum;
    @ApiCloudField(value="批发客户", example="002072010000002")
    private String clientFid;
    @ApiCloudField(value="创建人", example="管理员")
    private String wholesaleBookCreator;
    @ApiCloudField(value="订购日期", example="Mon Jan 18 08:00:00 CST 2021")
    private String wholesaleBookDate;
    @ApiCloudField(value="备注", example="备注")
    private String wholesaleBookMemo;
    @ApiCloudField(value="外部流水号", example="A0001")
    private String wholesaleBookOutBillNo;
    @ApiCloudField(value="销售员", example="管理员")
    private String wholesaleBookSeller;
    @ApiCloudField(value="创建时间")
    private String wholesaleBookCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String wholesaleBookAuditor;
    @ApiCloudField(value="审核时间")
    private String wholesaleBookAuditTime;
    @ApiCloudField(value="有效日期", example="Mon Jan 18 08:00:00 CST 2021")
    private String wholesaleBookDeadline;
    @ApiCloudField(value="作废人", example="作废人")
    private String wholesaleBookCancelOperator;
    @ApiCloudField(value="作废时间")
    private String wholesaleBookCancelTime;
    @ApiCloudField(value="状态代码", example="1")
    private Integer wholesaleBookStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String wholesaleBookStateName;
    @ApiCloudField(value="订单金额（小数点2位）", example="100.0")
    private BigDecimal wholesaleBookTotalMoney;
    @ApiCloudField(value="期望送达时间", example="Mon Jan 18 08:00:00 CST 2021")
    private String wholesaleBookExpectTime;
    @ApiCloudField(value="运费", example="2.0")
    private BigDecimal wholesaleBookPostFee;
    @ApiCloudField(value="订单明细", example="")
    private List<WholesaleBookDetailDTOModel> wholesaleBookDetails;
    @ApiCloudField(value="付款方式", example="现金")
    private String wholesaleBookPayType;
    @ApiCloudField(value="手工单号", example="202210120002")
    private String wholesaleBookInnerNo;
    @ApiCloudField(value="采配日（交货期限）", example="Wed Jan 18 08:00:00 CST 2023")
    private String wholesaleBookPurchaseDate;
    @ApiCloudField(value="最后修改时间")
    private String wholesaleBookLastEditTime;
    @ApiCloudField(value="付款状态(true为已付款)", example="true")
    private Boolean wholesaleBookEnablePayConfirm;
    @ApiCloudField(value="模板id(read接口返回)")
    private Long clientRequestTimeFoodId;
    @ApiCloudField(value="模板名称(read接口返回)", example="")
    private String clientRequestTimeFoodName;
    @ApiCloudField(value="配送方式", example="")
    private String wholesaleBookTransferType;
    @ApiCloudField(value="付款确认时间")
    private String wholesaleBookPayTime;
    @ApiCloudField(value="发货状态(未发货|拣货中|已过期|部分发货|发货完成)(仅查询、读取接口返回)", example="未发货")
    private String wholesaleBookSaleState;
    @ApiCloudField(value="部门列表", example="[信息部门]")
    private List<String> wholesaleBookDepartments;
    @ApiCloudField(value="address_id", example="0060099990007553-1")
    private String addressId;
    @ApiCloudField(value="收货地址", example="")
    private String clientAddress;
}
