package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemGradeSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemGradeSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="分级代码", example="0021")
    private String itemGradeCode;
    @ApiCloudField(value="分级条码", example="23435120001")
    private String itemGradeBarcode;
    @ApiCloudField(value="分级名称", example="一级")
    private String itemGradeName;
    @ApiCloudField(value="速记码", example="YJ")
    private String itemGradePinyin;
    @ApiCloudField(value="分级类型( 1:精品 2:一级 3:二级 4:三级 5:残次)", example="1")
    private Integer itemGradeType;
    @ApiCloudField(value="换算率", example="1")
    private BigDecimal itemGradeRate;
    @ApiCloudField(value="单位", example="公斤")
    private String itemGradeUnit;
    @ApiCloudField(value="标准售价（小数点2位）", example="10.0")
    private BigDecimal itemGradeRegularPrice;
    @ApiCloudField(value="售价2（小数点2位）", example="11.0")
    private BigDecimal itemGradeLevel2Price;
    @ApiCloudField(value="售价3（小数点2位）", example="12.0")
    private BigDecimal itemGradeLevel3Price;
    @ApiCloudField(value="售价4（小数点2位）", example="13.0")
    private BigDecimal itemGradeLevel4Price;
    @ApiCloudField(value="批发价格", example="1.0")
    private BigDecimal itemWholesalePrice;
    @ApiCloudField(value="批发价格2", example="2.0")
    private BigDecimal itemLevel2Wholesale;
    @ApiCloudField(value="批发价格3", example="3.0")
    private BigDecimal itemLevel3Wholesale;
    @ApiCloudField(value="批发价格4", example="4.0")
    private BigDecimal itemLevel4Wholesale;
    @ApiCloudField(value="允许前台折扣", example="1")
    private Integer itemGradeDiscounted;
    @ApiCloudField(value="允许前台议价", example="2")
    private Integer itemGradeChangePriceFlag;
    @ApiCloudField(value="是否称重", example="true")
    private Boolean itemGradeWeightFlag;
    @ApiCloudField(value="是否积分", example="true")
    private Boolean itemGradePointActived;
    @ApiCloudField(value="是否启用包装盒", example="true")
    private Boolean itemGradePackageActived;
    @ApiCloudField(value="允许在线批发", example="true")
    private Boolean itemWholesaleFlag;
    @ApiCloudField(value="停售标记", example="true")
    private Boolean itemGradeSaleCeaseFlag;
}
