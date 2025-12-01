package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberPointFindDTO模型
 * 会员积分查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberPointFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小（最大200）", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="卡编码", example="150200002")
    private String cardUserNum;
    @ApiCloudField(value="会员ID", example="207200000037")
    private String customerId;
    @ApiCloudField(value="会员手机号或名称 精确查找", example="18058533800")
    private String customerKeyword;
    @ApiCloudField(value="开始时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-10 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="是否查询用户信息 true：查询 false：不查询", example="true")
    private Boolean queryCustomer;
    @ApiCloudField(value="查询积分类型 true：积分增加记录 false：积分减少记录", example="true")
    private Boolean pointAdd;
    @ApiCloudField(value="关联订单号", example="S9381511495222723")
    private String refBillNo;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="积分操作类型(POINT_POS(POS消费)|POINT_CHANGE(积分兑换)|POINT_DEPOSIT(卡存款)|POINT_TO_DEPOSIT(积分转储值)|POINT_ORI(老会员转卡)|POINT_ONLINE(线上消费)|POINT_ONLINE_CHANGE(线上积分兑换)|POINT_DELETE(积分清除)|MANUAL(人工调整)|DEDUCT(积分抵现)|PRESENT(商家赠送)|POINT_ONLINE_PRESENT(线上积分赠送))", example="POINT_POS")
    private String operateType;
}
