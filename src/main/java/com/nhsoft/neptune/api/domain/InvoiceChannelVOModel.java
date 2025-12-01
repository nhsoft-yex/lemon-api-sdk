package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InvoiceChannelVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InvoiceChannelVOModel extends ApiCloudObject {

    @ApiCloudField(value="渠道(YONGYOU,NUONUO,BAIWANG,LEQI,HUIFU,VIETTEL,MERCHANT)", example="YONGYOU", required=true)
    private String channel;
}
