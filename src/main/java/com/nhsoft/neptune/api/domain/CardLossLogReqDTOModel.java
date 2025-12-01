package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardLossLogReqDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardLossLogReqDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="150200002", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="日志查询类型(挂失、解挂)", example="挂失", required=true)
    private String cardLossOperateName;
}
