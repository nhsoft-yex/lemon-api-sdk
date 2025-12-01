package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicFeeItemSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicFeeItemSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="费用项目代码", example="01", required=true)
    private String feeItemCode;
    @ApiCloudField(value="费用项目名称", example="运输费", required=true)
    private String feeItemName;
    @ApiCloudField(value="收支方向(true:应收 false:应付)", example="true", required=true)
    private Boolean feeItemInOutFlg;
    @ApiCloudField(value="是否启用", example="false")
    private Boolean feeItemEnable;
    @ApiCloudField(value="应用范围", example="[\"客户费用单\",\"门店费用单\"]")
    private List<String> feeItemType;
}
