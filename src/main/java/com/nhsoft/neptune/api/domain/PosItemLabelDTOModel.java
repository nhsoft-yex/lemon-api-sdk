package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemLabelDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemLabelDTOModel extends ApiCloudObject {

    @ApiCloudField(value="标签编号", example="207201000001")
    private Long itemLabelNum;
    @ApiCloudField(value="标签名称", example="新鲜")
    private String itemLabelName;
    @ApiCloudField(value="标签序号", example="1")
    private Integer sequence;
    @ApiCloudField(value="是否POS类别展示", example="true")
    private Boolean posType;
    @ApiCloudField(value="是否POS类别展示", example="true")
    private Boolean appType;
    @ApiCloudField(value="是否APP批发客户订货类别展示", example="true")
    private Boolean appWholesaleBookType;
    @ApiCloudField(value="是否启用POS角标", example="true")
    private Boolean posCorner;
    @ApiCloudField(value="POS角标", example="")
    private String posCornerContent;
}
