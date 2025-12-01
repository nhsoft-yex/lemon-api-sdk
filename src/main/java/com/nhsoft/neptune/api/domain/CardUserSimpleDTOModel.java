package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUserSimpleDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUserSimpleDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="2057", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="card_state")
    private String cardState;
}
