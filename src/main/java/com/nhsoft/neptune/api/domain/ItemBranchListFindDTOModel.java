package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemBranchListFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemBranchListFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="最后修改时间（yyyy-MM-dd HH:mm:ss）", required=true)
    private String lastDownloadTime;
    @ApiCloudField(value="商品系统编号列表", example="")
    private List<Integer> itemNums;
    @ApiCloudField(value="门店编码", required=true)
    private Integer branchNum;
}
