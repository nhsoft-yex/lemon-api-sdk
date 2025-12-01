package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemSpecSaveVO模型
 * 商品规格
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemSpecSaveVOModel extends ApiCloudObject {

    @ApiCloudField(value="规格编码", example="9954700015738")
    private Long specNum;
    @ApiCloudField(value="规格代码", example="600990016980")
    private String specCode;
    @ApiCloudField(value="规格名称", example="2024050601", required=true)
    private String specName;
    @ApiCloudField(value="速记码", example="2024050601")
    private String specPinyin;
    @ApiCloudField(value="规格单位名称", example="公斤", required=true)
    private String specUnitName;
    @ApiCloudField(value="换算率", example="1", required=true)
    private BigDecimal convertRate;
    @ApiCloudField(value="称重商品", example="true")
    private Boolean weightFlag;
    @ApiCloudField(value="应用范围（ONLINE, OFFLINE, WHOLESALE）", example="一级", required=true)
    private List<String> sceneList;
    @ApiCloudField(value="条码", example="true")
    private String barCode;
    @ApiCloudField(value="标准售价", example="10")
    private BigDecimal itemGradeRegularPrice;
    @ApiCloudField(value="售价2", example="10")
    private BigDecimal itemGradeLevel2Price;
    @ApiCloudField(value="售价3", example="10")
    private BigDecimal itemGradeLevel3Price;
    @ApiCloudField(value="售价4", example="10")
    private BigDecimal itemGradeLevel4Price;
    @ApiCloudField(value="前台议价", example="true")
    private Boolean itemGradeChangePriceFlag;
    @ApiCloudField(value="允许折扣", example="true")
    private Boolean itemGradeDiscounted;
    @ApiCloudField(value="积分", example="true")
    private Boolean itemGradePointActived;
    @ApiCloudField(value="包装盒", example="true")
    private Boolean itemGradeSaleCeaseFlag;
    @ApiCloudField(value="是否启用包装盒", example="true")
    private Boolean itemGradePackageActived;
}
