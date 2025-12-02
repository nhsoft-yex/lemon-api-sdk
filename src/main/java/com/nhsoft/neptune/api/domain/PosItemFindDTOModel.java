package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemFindDTO模型
 * 商品查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="经营范围ID", example="")
    private List<Integer> businessScopeList;
    @ApiCloudField(value="STANDARD:标准商品|COMBINED:组合商品|NONE_INVENTORY:非库存商品|DOC_MAKE_COMBINE:制单组合商品|CUSTOME_COMBINE:自定义组合商品|COMPONENT:成分商品", example="STANDARD")
    private String itemType;
    @ApiCloudField(value="是否淘汰", example="false")
    private Boolean eliminate;
    @ApiCloudField(value="是否休眠", example="false")
    private Boolean dormancy;
    @ApiCloudField(value="是否停购", example="false")
    private Boolean noPurchasing;
    @ApiCloudField(value="是否新品", example="false")
    private Boolean newCrease;
    @ApiCloudField(value="经营方式(购销|联营|代销|直销)", example="购销")
    private String itemMethod;
    @ApiCloudField(value="是否允许负库存销售", example="true")
    private Boolean itemSaleNoStore;
    @ApiCloudField(value="时间类型(CREATE:创建时间|UPDATE:修改时间)", example="CREATE")
    private String dateType;
    @ApiCloudField(value="开始时间")
    private String startTime;
    @ApiCloudField(value="结束时间")
    private String endTime;
    @ApiCloudField(value="价签打印", example="true")
    private Boolean itemPriceTagFlag;
    @ApiCloudField(value="标签打印", example="true")
    private Boolean itemPrintLabelFlag;
    @ApiCloudField(value="成本核算方式（加权平均法|最后进价法|先进先出法|手工指定|中心手工指定）", example="加权平均法")
    private String itemCostMode;
    @ApiCloudField(value="收货需要输入生产日期", example="true")
    private Boolean itemNeedProductDate;
    @ApiCloudField(value="要货不允许超过中心库存", example="true")
    private Boolean requestNotOverCenterStock;
    @ApiCloudField(value="加工商品", example="true")
    private Boolean itemManufactureFlag;
    @ApiCloudField(value="是否允许门店调价(1:否|2:是|3:仅总部可调)", example="1")
    private Integer itemPriceAdj;
    @ApiCloudField(value="是否称重商品", example="true")
    private Boolean itemWeightFlag;
    @ApiCloudField(value="商品类别代码", example="001")
    private String itemCategoryCode;
    @ApiCloudField(value="商品查询模板ID", example="")
    private List<Integer> itemFlagIds;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
