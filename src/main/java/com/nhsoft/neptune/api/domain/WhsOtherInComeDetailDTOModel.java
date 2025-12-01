package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsOtherInComeDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsOtherInComeDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="detail_num")
    private Integer detailNum;
    @ApiCloudField(value="收入项名称", example="运费")
    private String item;
    @ApiCloudField(value="收入金额", example="376.0")
    private BigDecimal money;
    @ApiCloudField(value="备注")
    private String memo;
    @ApiCloudField(value="关联单号", example="WO99679990000195")
    private String ref;
}
