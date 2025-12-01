package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TicketTypeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TicketTypeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券应用分类(购物抵用券，消费折扣券，会员卡储值券，商品券)", example="购物抵用券")
    private String ticketCategory;
}
