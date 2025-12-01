package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUnBindReqDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUnBindReqDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="2055", required=true)
    private Integer cardUserNum;
}
