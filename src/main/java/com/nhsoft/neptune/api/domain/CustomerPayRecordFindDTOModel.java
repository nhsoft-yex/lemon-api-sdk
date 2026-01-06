package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerPayRecordFindDTO模型
 * 客户支付记录查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerPayRecordFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1")
    private Integer branchNum;
    @ApiCloudField(value="开始时间")
    private String start;
    @ApiCloudField(value="结束时间")
    private String end;
    @ApiCloudField(value="是否退款")
    private Boolean refund;
    @ApiCloudField(value="是否线下")
    private Boolean offline;
    @ApiCloudField(value="会员ID")
    private Long customerId;
    @ApiCloudField(value="手机号")
    private String phone;
    @ApiCloudField(value="等级ID")
    private Long levelId;
    @ApiCloudField(value="状态(0:正在生效中|1:未来生效|2:过期|3:禁用|10:待支付|11:关闭)", example="[0,1]")
    private List<Integer> states;
    @ApiCloudField(value="过滤状态(0:正在生效中|1:未来生效|2:过期|3:禁用|10:待支付|11:关闭)")
    private List<Integer> excludeStates;
    @ApiCloudField(value="记录类型(SALE:销售|RENEWAL:续费|REPURCHASE:复购|REFUND:退款)", example="[SALE]")
    private List<String> recordTypes;
    @ApiCloudField(value="页号", required=true)
    private Integer pageNo;
    @ApiCloudField(value="每页条数", required=true)
    private Integer pageSize;
}
