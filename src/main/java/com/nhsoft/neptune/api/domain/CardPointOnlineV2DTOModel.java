package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardPointOnlineV2DTO模型
 * 会员卡线上积分V2DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardPointOnlineV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="会员ID", example="2072992036300012")
    private Long customerId;
    @ApiCloudField(value="会员卡编码", example="150200002")
    private String cardUserNum;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="门店名称", example="管理中心")
    private String branchName;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="积分", example="1", required=true)
    private Integer pointValue;
    @ApiCloudField(value="外部单号(该字段要求唯一性，若单号重复，则积分新增扣减不会生效)", example="207201200590170003", required=true)
    private String refBillNo;
    @ApiCloudField(value="备注", example="备注信息")
    private String memo;
    @ApiCloudField(value="操作类型(POS消费|积分兑换|卡存款|积分转存储|老会员转卡|线上消费|线上积分兑换|积分清除|人工调整|积分抵现|商家赠送)", example="积分兑换")
    private String operateType;
}
