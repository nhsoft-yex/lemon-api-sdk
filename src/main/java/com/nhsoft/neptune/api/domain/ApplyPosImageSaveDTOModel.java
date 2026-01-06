package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ApplyPosImageSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplyPosImageSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="新品申请单编号", example="4344990000226", required=true)
    private String applyPositemFid;
    @ApiCloudField(value="商品图片资源（字节流）", example="[B@3c01cfa1", required=true)
    private String applyPosImageResources;
}
