package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerReadByOpenidDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerReadByOpenidDTOModel extends ApiCloudObject {

    @ApiCloudField(value="第三方会员标识", example="20111", required=true)
    private String openid;
    @ApiCloudField(value="是否查询会员有效券的数量", example="true")
    private Boolean queryCoupon;
}
