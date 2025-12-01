package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardStorageChangeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardStorageChangeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="2055", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="储值卡介质(IC卡|电子卡|磁条卡)", example="电子卡", required=true)
    private String cardStorage;
}
