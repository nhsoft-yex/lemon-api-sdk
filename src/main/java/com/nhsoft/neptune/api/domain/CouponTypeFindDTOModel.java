package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponTypeFindDTO模型
 * 消费券类型查询参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponTypeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券应用分类(购物抵用券，消费折扣券，会员卡储值券，商品券，指定门槛券)", example="购物抵用券")
    private String ticketCategory;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为500)", example="10", required=true)
    private Integer pageSize;
}
