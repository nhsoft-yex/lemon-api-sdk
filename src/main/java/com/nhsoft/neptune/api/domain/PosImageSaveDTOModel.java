package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosImageSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosImageSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="102200551", required=true)
    private Integer itemNum;
    @ApiCloudField(value="商品图片(最多支持五张)", example="", required=true)
    private List<PosImageDetailSaveDTOModel> posImages;
    @ApiCloudField(value="enable_delete")
    private Boolean enableDelete;
}
