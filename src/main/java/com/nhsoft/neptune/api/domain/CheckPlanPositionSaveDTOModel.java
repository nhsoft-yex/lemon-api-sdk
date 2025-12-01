package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckPlanPositionSaveDTO模型
 * 库位信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckPlanPositionSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="库位名称", example="zfb集货位")
    private String positionName;
    @ApiCloudField(value="库位ID", example="325704")
    private Integer positionNum;
    @ApiCloudField(value="库位类型", example="发货集货")
    private String positionType;
    @ApiCloudField(value="库区名称", example="A区")
    private String storehouseAreaName;
    @ApiCloudField(value="库区ID", example="11617")
    private Integer storehouseAreaNum;
}
