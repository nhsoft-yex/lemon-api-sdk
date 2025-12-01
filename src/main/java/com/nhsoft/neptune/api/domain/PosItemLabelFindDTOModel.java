package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemLabelFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemLabelFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="标签名称", example="标签")
    private String labelName;
}
