package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemCategoryVO模型
 * 商品分类
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemCategoryVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品分类编号", example="2855")
    private Long posItemCategoryNum;
    @ApiCloudField(value="商品父类分类编号", example="830")
    private Long parentCategoryNum;
    @ApiCloudField(value="类别代码", example="012")
    private String posItemCategoryCode;
    @ApiCloudField(value="类别名称", example="标品4")
    private String posItemCategoryName;
    @ApiCloudField(value="有效天数", example="1")
    private Integer validDate;
    @ApiCloudField(value="std_transfer_flag")
    private Boolean stdTransferFlag;
    @ApiCloudField(value="开启“不同生产日期”分开回传上游", example="true")
    private Boolean productionDateSynUpstream;
    @ApiCloudField(value="开启“不同批次号”分开回传上游", example="true")
    private Boolean lotNumSynUpstream;
    @ApiCloudField(value="出库单客户配货开启“不同单位”分开回传上游", example="true")
    private Boolean sameLotDiffUnitSynUpstream;
    @ApiCloudField(value="收货生产日期提醒(允许|提醒|禁止)", example="允许")
    private String receiveLowProductionDateTip;
    @ApiCloudField(value="1-早于库内最早；2-早于库内最新", example="1")
    private Integer receiveLowProductionJudgeType;
    @ApiCloudField(value="仓库编码", example="996580134")
    private Integer storehouseNum;
    @ApiCloudField(value="storehouse")
    private WmsStorehouseVOModel storehouse;
}
