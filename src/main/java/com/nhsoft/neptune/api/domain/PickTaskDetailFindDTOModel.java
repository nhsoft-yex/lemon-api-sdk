package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PickTaskDetailFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PickTaskDetailFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private String branchNum;
    @ApiCloudField(value="时间类型(分拣时间)", example="分拣时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="波次计划单编号", example="BC996589925062000001")
    private String wavePlanFid;
    @ApiCloudField(value="仓库编号列表", example="[996580001]")
    private List<Integer> storehouseNums;
    @ApiCloudField(value="商品编号列表", example="[1]")
    private List<Integer> itemNums;
    @ApiCloudField(value="客户编号列表", example="[5597]")
    private List<String> clientNums;
    @ApiCloudField(value="供应商编号列表", example="[5597]")
    private List<Integer> supplierNums;
    @ApiCloudField(value="拣货员", example="5597")
    private Integer ownerUserNum;
    @ApiCloudField(value="库位编号列表", example="[49590]")
    private List<Long> sourcePositionNums;
    @ApiCloudField(value="拆零标记", example="true")
    private Boolean itemSplitFlag;
    @ApiCloudField(value="商品组编号列表", example="[1]")
    private List<Integer> itemGroupNums;
    @ApiCloudField(value="状态(拣货完成|已集货|已发车|取消)", example="拣货完成")
    private String collectionState;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大值为200)", example="10", required=true)
    private Integer pageSize;
}
