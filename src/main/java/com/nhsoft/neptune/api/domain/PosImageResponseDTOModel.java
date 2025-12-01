package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosImageResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosImageResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品图片编号", example="434401000312")
    private String posImageId;
    @ApiCloudField(value="商品编码", example="102200551")
    private Integer itemNum;
    @ApiCloudField(value="是否默认图片", example="true")
    private Boolean posImageDefault;
    @ApiCloudField(value="商品图片创建日期 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-27 00:00:00")
    private String posImageCreationDate;
    @ApiCloudField(value="商品图片地址", example="")
    private String posImageUrl;
}
