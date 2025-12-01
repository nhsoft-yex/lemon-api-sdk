package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUserNumListDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUserNumListDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码列表", example="[1,2]", required=true)
    private List<Integer> cardUserNums;
}
