package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardTypeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardTypeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费卡编号", example="100")
    private String typeCode;
    @ApiCloudField(value="消费卡名称", example="至尊卡")
    private String typeName;
}
