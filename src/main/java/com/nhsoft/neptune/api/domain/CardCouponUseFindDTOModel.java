package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardCouponUseFindDTO模型
 * 会员卡消费券使用查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardCouponUseFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券号", example="093118551668")
    private List<String> barcodes;
    @ApiCloudField(value="核销门店编号", example="3")
    private List<Integer> consumeBranchIds;
    @ApiCloudField(value="应用渠道(AMA,IWM,BARB,MER)", example="AAMAA")
    private List<String> channels;
    @ApiCloudField(value="核销渠道(AMA|IWM|BARB|MER)", example="AMA")
    private String consumeChannel;
    @ApiCloudField(value="核销开始时间", example="2021-01-21 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="核销结束时间", example="2021-04-21 12:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="消费券类型(MONEY|ITEM|DEPOSIT|DISCOUNT|FEE)", example="MMONEYY")
    private List<String> typeCategories;
    @ApiCloudField(value="会员卡号编号", example="2055")
    private Integer cardUserNum;
    @ApiCloudField(value="电话号码", example="17644219971")
    private String phone;
    @ApiCloudField(value="会员编号", example="207200031896")
    private String customerId;
    @ApiCloudField(value="consume_at_from")
    private String consumeAtFrom;
    @ApiCloudField(value="consume_at_to")
    private String consumeAtTo;
    @ApiCloudField(value="card_ids")
    private List<String> cardIds;
    @ApiCloudField(value="page")
    private Integer page;
    @ApiCloudField(value="size")
    private Integer size;
    @ApiCloudField(value="customer_ids")
    private List<Long> customerIds;
}
