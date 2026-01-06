package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardBackgroundDTO模型
 * 礼品卡背景图片
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardBackgroundDTOModel extends ApiCloudObject {

    @ApiCloudField(value="背景图片url", required=true)
    private String url;
}
