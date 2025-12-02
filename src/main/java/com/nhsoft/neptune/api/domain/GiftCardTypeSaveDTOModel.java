package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardTypeSaveDTO模型
 * 礼品卡类型保存参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardTypeSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="分组id", example="1", required=true)
    private Integer categoryId;
    @ApiCloudField(value="类型名称", example="团购", required=true)
    private String typeName;
    @ApiCloudField(value="是否启用", example="true", required=true)
    private Boolean enable;
    @ApiCloudField(value="背景图片", example="", required=true)
    private List<GiftCardBackgroundDTOModel> cardFaceBackgrounds;
    @ApiCloudField(value="面值id列表", example="[1]")
    private List<Integer> valueIds;
}
