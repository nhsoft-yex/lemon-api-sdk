package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemParamV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemParamV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="是否开启自动生成商品代码", example="true")
    private Boolean autoCode;
    @ApiCloudField(value="是否开启自动生成商品条码", example="true")
    private Boolean autoBarCode;
    @ApiCloudField(value="是否开启商品Matrix", example="true")
    private Boolean supportMatrix;
    @ApiCloudField(value="新品周期", example="10")
    private Integer itemNewBoundDay;
    @ApiCloudField(value="商品拓展属性1", example="商品拓展属性1")
    private String itemExtend1Name;
    @ApiCloudField(value="商品拓展属性2", example="商品拓展属性2")
    private String itemExtend2Name;
    @ApiCloudField(value="商品拓展属性3", example="商品拓展属性3")
    private String itemExtend3Name;
    @ApiCloudField(value="商品拓展属性4", example="商品拓展属性4")
    private String itemExtend4Name;
    @ApiCloudField(value="商品拓展属性5", example="商品拓展属性5")
    private String itemExtend5Name;
    @ApiCloudField(value="商品拓展属性6", example="商品拓展属性6")
    private String itemExtend6Name;
    @ApiCloudField(value="商品拓展属7", example="商品拓展属性7")
    private String itemExtend7Name;
    @ApiCloudField(value="商品拓展属性8", example="商品拓展属性8")
    private String itemExtend8Name;
    @ApiCloudField(value="商品拓展属性9", example="商品拓展属性9")
    private String itemExtend9Name;
    @ApiCloudField(value="商品拓展属性10", example="商品拓展属性10")
    private String itemExtend10Name;
    @ApiCloudField(value="商品拓展属性1-类型", example="参数")
    private String itemExtend1Type;
    @ApiCloudField(value="商品拓展属性2-类型", example="参数")
    private String itemExtend2Type;
    @ApiCloudField(value="商品拓展属性3-类型", example="参数")
    private String itemExtend3Type;
    @ApiCloudField(value="商品拓展属性4-类型", example="参数")
    private String itemExtend4Type;
    @ApiCloudField(value="商品拓展属性5-类型", example="参数")
    private String itemExtend5Type;
    @ApiCloudField(value="商品拓展属性6-类型", example="参数")
    private String itemExtend6Type;
    @ApiCloudField(value="商品拓展属性7-类型", example="参数")
    private String itemExtend7Type;
    @ApiCloudField(value="商品拓展属性8-类型", example="参数")
    private String itemExtend8Type;
    @ApiCloudField(value="商品拓展属性9-类型", example="参数")
    private String itemExtend9Type;
    @ApiCloudField(value="商品拓展属性10-类型", example="参数")
    private String itemExtend10Type;
    @ApiCloudField(value="商品拓展属性1-值", example="")
    private List<String> itemExtend1Values;
    @ApiCloudField(value="商品拓展属性2-值", example="")
    private List<String> itemExtend2Values;
    @ApiCloudField(value="商品拓展属性3-值", example="")
    private List<String> itemExtend3Values;
    @ApiCloudField(value="商品拓展属性4-值", example="")
    private List<String> itemExtend4Values;
    @ApiCloudField(value="商品拓展属性5-值", example="")
    private List<String> itemExtend5Values;
    @ApiCloudField(value="商品拓展属性6-值", example="")
    private List<String> itemExtend6Values;
    @ApiCloudField(value="商品拓展属性7-值", example="")
    private List<String> itemExtend7Values;
    @ApiCloudField(value="商品拓展属性8-值", example="")
    private List<String> itemExtend8Values;
    @ApiCloudField(value="商品拓展属性9-值", example="")
    private List<String> itemExtend9Values;
    @ApiCloudField(value="商品拓展属性10-值", example="")
    private List<String> itemExtend10Values;
    @ApiCloudField(value="门店拓展属性1", example="门店拓展属性1")
    private String branchExtend1Name;
    @ApiCloudField(value="门店拓展属性2", example="门店拓展属性2")
    private String branchExtend2Name;
    @ApiCloudField(value="门店拓展属性3", example="门店拓展属性3")
    private String branchExtend3Name;
    @ApiCloudField(value="门店拓展属性4", example="门店拓展属性4")
    private String branchExtend4Name;
    @ApiCloudField(value="门店拓展属性5", example="门店拓展属性5")
    private String branchExtend5Name;
    @ApiCloudField(value="门店拓展属性6", example="门店拓展属性6")
    private String branchExtend6Name;
    @ApiCloudField(value="门店拓展属性7", example="门店拓展属性7")
    private String branchExtend7Name;
    @ApiCloudField(value="门店拓展属性8", example="门店拓展属性8")
    private String branchExtend8Name;
    @ApiCloudField(value="门店拓展属性9", example="门店拓展属性9")
    private String branchExtend9Name;
    @ApiCloudField(value="门店拓展属性10", example="门店拓展属性10")
    private String branchExtend10Name;
    @ApiCloudField(value="门店拓展属性1-类型", example="参数")
    private String branchExtend1Type;
    @ApiCloudField(value="门店拓展属性2-类型", example="参数")
    private String branchExtend2Type;
    @ApiCloudField(value="门店拓展属性3-类型", example="参数")
    private String branchExtend3Type;
    @ApiCloudField(value="门店拓展属性4-类型", example="参数")
    private String branchExtend4Type;
    @ApiCloudField(value="门店拓展属性5-类型", example="参数")
    private String branchExtend5Type;
    @ApiCloudField(value="门店拓展属性6-类型", example="参数")
    private String branchExtend6Type;
    @ApiCloudField(value="门店拓展属性7-类型", example="参数")
    private String branchExtend7Type;
    @ApiCloudField(value="门店拓展属性8-类型", example="参数")
    private String branchExtend8Type;
    @ApiCloudField(value="门店拓展属性9-类型", example="参数")
    private String branchExtend9Type;
    @ApiCloudField(value="门店拓展属性10-类型", example="参数")
    private String branchExtend10Type;
    @ApiCloudField(value="门店拓展属性1-值", example="")
    private List<String> branchExtend1Values;
    @ApiCloudField(value="门店拓展属性2-值", example="")
    private List<String> branchExtend2Values;
    @ApiCloudField(value="门店拓展属性3-值", example="")
    private List<String> branchExtend3Values;
    @ApiCloudField(value="门店拓展属性4-值", example="")
    private List<String> branchExtend4Values;
    @ApiCloudField(value="门店拓展属性5-值", example="")
    private List<String> branchExtend5Values;
    @ApiCloudField(value="门店拓展属性6-值", example="")
    private List<String> branchExtend6Values;
    @ApiCloudField(value="门店拓展属性7-值", example="")
    private List<String> branchExtend7Values;
    @ApiCloudField(value="门店拓展属性8-值", example="")
    private List<String> branchExtend8Values;
    @ApiCloudField(value="门店拓展属性9-值", example="")
    private List<String> branchExtend9Values;
    @ApiCloudField(value="门店拓展属性10-值", example="")
    private List<String> branchExtend10Values;
    @ApiCloudField(value="启用辅助单位替代常用单位", example="false")
    private Boolean enableAssistUnitAsUseUnit;
}
