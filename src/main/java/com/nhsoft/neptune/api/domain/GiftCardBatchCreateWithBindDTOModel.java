package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardBatchCreateWithBindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardBatchCreateWithBindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="列表信息", required=true)
    private List<GiftCardCreateWithBindDTOModel> list;
}
