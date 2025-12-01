package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicItemUnitGroupDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicItemUnitGroupDTOModel extends ApiCloudObject {

    @ApiCloudField(value="计量单位组", example="分组1")
    private String groupName;
    @ApiCloudField(value="明细", example="")
    private List<BasicItemUnitGroupDetailDTOModel> itemUnits;
}
