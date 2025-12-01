package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosImageDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosImageDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品图片资源（字节流）", example="[B@40317ba2", required=true)
    private String posImageResource;
    @ApiCloudField(value="是否默认图片", example="true", required=true)
    private Boolean posImageDefault;
}
