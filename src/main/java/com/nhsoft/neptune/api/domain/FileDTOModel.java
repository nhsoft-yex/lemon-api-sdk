package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * FileDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FileDTOModel extends ApiCloudObject {

    @ApiCloudField(value="附件名称", example="进销存变动统计_门店-类别汇总")
    private String ossObjectFileName;
    @ApiCloudField(value="附件后缀名称", example=".xls")
    private String ossObjectFileSuppfix;
    @ApiCloudField(value="附件ID", example="9999100991001142")
    private String ossObjectFid;
    @ApiCloudField(value="附件URL", example="http://nhsoft-dev.oss-cn-hangzhou.aliyuncs.com/99991/供应商结算/99/CP99991992310200002/9999100991001142.xls")
    private String ossObjectUrl;
    @ApiCloudField(value="附件大小(KB)", example="64")
    private Integer ossObjectFileSize;
    @ApiCloudField(value="关联商品", example="2948")
    private Integer itemNum;
    @ApiCloudField(value="关联批次", example="1")
    private String itemLotNumber;
}
