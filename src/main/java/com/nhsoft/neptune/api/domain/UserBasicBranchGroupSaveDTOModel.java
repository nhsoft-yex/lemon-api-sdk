package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicBranchGroupSaveDTO模型
 * 用户中心门店分组保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicBranchGroupSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店分组名称", example="区域1", required=true)
    private String name;
    @ApiCloudField(value="备注", example="备注信息")
    private String memo;
    @ApiCloudField(value="门店ID列表", example="[1]")
    private List<Integer> branchIds;
    @ApiCloudField(value="门店区域ID列表", example="[1]")
    private List<Integer> branchRegionIds;
}
