package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemExpirationSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemExpirationSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码列表", example="[1]", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="临期提醒天数", example="1")
    private Integer itemRemindDay;
    @ApiCloudField(value="添加时间", required=true)
    private String itemAddTime;
}
