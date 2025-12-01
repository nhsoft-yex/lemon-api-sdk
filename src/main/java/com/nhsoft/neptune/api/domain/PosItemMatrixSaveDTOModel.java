package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemMatrixSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemMatrixSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="207200001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="扩展字段1", example="扩展字段")
    private String itemExtend1;
    @ApiCloudField(value="扩展字段2", example="扩展字段")
    private String itemExtend2;
    @ApiCloudField(value="扩展字段3", example="扩展字段")
    private String itemExtend3;
    @ApiCloudField(value="扩展字段4", example="扩展字段")
    private String itemExtend4;
    @ApiCloudField(value="扩展字段5", example="扩展字段")
    private String itemExtend5;
    @ApiCloudField(value="扩展字段6", example="扩展字段")
    private String itemExtend6;
    @ApiCloudField(value="扩展字段7", example="扩展字段")
    private String itemExtend7;
    @ApiCloudField(value="扩展字段8", example="扩展字段")
    private String itemExtend8;
    @ApiCloudField(value="扩展字段9", example="扩展字段")
    private String itemExtend9;
    @ApiCloudField(value="扩展字段10", example="扩展字段")
    private String itemExtend10;
}
