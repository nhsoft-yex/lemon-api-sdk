package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemDiffLogFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemDiffLogFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="开始日期", example="Wed Jan 01 08:00:00 CST 2025", required=true)
    private String dateStart;
    @ApiCloudField(value="结束日期", example="Wed Jan 01 08:00:00 CST 2025", required=true)
    private String dateEnd;
    @ApiCloudField(value="门店编码列表", example="[1]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="仓库编码列表", example="[996050001]")
    private List<Integer> storehouseNums;
    @ApiCloudField(value="商品编码列表", example="[15]")
    private List<Integer> itemNums;
}
