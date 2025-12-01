package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckPlanSaveDTO模型
 * 盘点计划保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckPlanSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="是否盲盘", example="true")
    private Boolean blindCheckEnable;
    @ApiCloudField(value="盘点日期", required=true)
    private String checkPlanDate;
    @ApiCloudField(value="盘点模式(库位盘点|商品盘点)", example="商品盘点", required=true)
    private String checkPlanMode;
    @ApiCloudField(value="盘点类型", example="计划盘点", required=true)
    private String checkPlanType;
    @ApiCloudField(value="创建人", example="admin", required=true)
    private String creator;
    @ApiCloudField(value="配送中心门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="未盘按0处理", example="true")
    private Boolean dealUncheck;
    @ApiCloudField(value="动态盘点开始时间")
    private String dynamicCheckDateFrom;
    @ApiCloudField(value="动态盘点结束时间")
    private String dynamicCheckDateTo;
    @ApiCloudField(value="启用动态盘点", example="true")
    private Boolean dynamicCheckEnable;
    @ApiCloudField(value="是否开启库存快照", example="true")
    private Boolean snapshotInventoryEnable;
    @ApiCloudField(value="备注", example="备注")
    private String memo;
    @ApiCloudField(value="仓库编码", example="211300001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="库位信息")
    private List<CheckPlanPositionSaveDTOModel> wmsStdCheckPlanPositionList;
    @ApiCloudField(value="商品明细列表", example="[1]")
    private List<Integer> checkPlanItemList;
}
