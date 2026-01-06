package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardTypeVO模型
 * 礼品卡类型VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardTypeVOModel extends ApiCloudObject {

    @ApiCloudField(value="类型id", example="17644219987", required=true)
    private Integer typeId;
    @ApiCloudField(value="分组id", example="17644219987", required=true)
    private Integer categoryId;
    @ApiCloudField(value="分组名称", example="17644219987", required=true)
    private String typeName;
    @ApiCloudField(value="是否启用", example="true", required=true)
    private Boolean enable;
    @ApiCloudField(value="背景图片")
    private List<GiftCardBackgroundDTOModel> cardFaceBackgrounds;
}
