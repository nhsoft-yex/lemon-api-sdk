package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosMachineVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosMachineVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="Pos终端编码", example="80")
    private Integer posMachineNum;
    @ApiCloudField(value="Pos终端名称", example="新希望果蔬专卖(ID卡)POS46")
    private String posMachineName;
    @ApiCloudField(value="Pos终端ID", example="00-E0-4B-64-94-0C")
    private String posMachineTerminalId;
    @ApiCloudField(value="Pos终端类型", example="收银终端")
    private String posMachineType;
}
