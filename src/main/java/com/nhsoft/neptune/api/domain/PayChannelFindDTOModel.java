package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayChannelFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayChannelFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="渠道名称", example="建设银行", required=true)
    private String channelName;
}
