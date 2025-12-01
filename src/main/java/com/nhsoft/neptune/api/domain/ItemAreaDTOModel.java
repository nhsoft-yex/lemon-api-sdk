package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemAreaDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemAreaDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="20720001")
    private Integer itemNum;
    @ApiCloudField(value="分级明细", example="1")
    private Integer posItemAreaNum;
    @ApiCloudField(value="单位", example="箱")
    private String posItemAreaUnit;
    @ApiCloudField(value="长(单位cm)", example="100")
    private BigDecimal posItemAreaLength;
    @ApiCloudField(value="宽(单位cm)", example="100")
    private BigDecimal posItemAreaWidth;
    @ApiCloudField(value="高(单位cm)", example="100")
    private BigDecimal posItemAreaHigh;
    @ApiCloudField(value="体积(单位cm³)", example="1000000")
    private BigDecimal posItemAreaSize;
    @ApiCloudField(value="重量(单位kg)", example="50")
    private BigDecimal posItemAreaWeight;
    @ApiCloudField(value="皮重(单位kg)", example="49")
    private BigDecimal posItemAreaTare;
    @ApiCloudField(value="TI", example="1")
    private Integer posItemAreaTi;
    @ApiCloudField(value="HI", example="1")
    private Integer posItemAreaHi;
}
