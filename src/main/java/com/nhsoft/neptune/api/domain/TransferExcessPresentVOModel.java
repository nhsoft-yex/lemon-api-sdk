package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferExcessPresentVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferExcessPresentVOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="")
    private String transferExcessPresentFid;
    @ApiCloudField(value="门店编号")
    private Integer branchNum;
    @ApiCloudField(value="配送门店编号")
    private Integer transferBranchNum;
    @ApiCloudField(value="配送门店名称", example="")
    private String transferBranchName;
    @ApiCloudField(value="开始日期")
    private String transferExcessPresentDateFrom;
    @ApiCloudField(value="结束日期")
    private String transferExcessPresentDateTo;
    @ApiCloudField(value="状态编码(1:制单；3:制单|审核；5：制单|审核|作废)", example="1")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String stateName;
    @ApiCloudField(value="创建人", example="")
    private String transferExcessPresentCreator;
    @ApiCloudField(value="审核人", example="")
    private String transferExcessPresentAuditor;
    @ApiCloudField(value="取消人", example="")
    private String transferExcessPresentCancelor;
    @ApiCloudField(value="单据日期")
    private String transferExcessPresentDate;
    @ApiCloudField(value="创建时间")
    private String transferExcessPresentCreateTime;
    @ApiCloudField(value="审核时间")
    private String transferExcessPresentAuditTime;
    @ApiCloudField(value="取消时间")
    private String transferExcessPresentCancelTime;
    @ApiCloudField(value="最后修改时间")
    private String transferExcessPresentLastEditTime;
    @ApiCloudField(value="最后修改人", example="")
    private String transferExcessPresentLastEditor;
    @ApiCloudField(value="备注", example="")
    private String transferExcessPresentMemo;
    @ApiCloudField(value="星期一", example="false")
    private Boolean transferExcessPresentMonActived;
    @ApiCloudField(value="星期二", example="false")
    private Boolean transferExcessPresentTuesActived;
    @ApiCloudField(value="星期三", example="false")
    private Boolean transferExcessPresentWedActived;
    @ApiCloudField(value="星期四", example="false")
    private Boolean transferExcessPresentThursActived;
    @ApiCloudField(value="星期五", example="false")
    private Boolean transferExcessPresentFridayActived;
    @ApiCloudField(value="星期六", example="false")
    private Boolean transferExcessPresentSatActived;
    @ApiCloudField(value="星期日", example="false")
    private Boolean transferExcessPresentSunActived;
    @ApiCloudField(value="超额累加", example="false")
    private Boolean transferExcessPresentAppend;
    @ApiCloudField(value="限量按照每家门店单独计算", example="false")
    private Boolean asPerEveryBranch;
    @ApiCloudField(value="明细", example="")
    private List<TransferExcessPresentDetailVOModel> transferExcessPresentDetails;
    @ApiCloudField(value="买N赠1时的赠送明细", example="")
    private List<TransferExcessPresentGiftVOModel> transferExcessPresentGifts;
    @ApiCloudField(value="赠送类型：null、0按默认买一赠一；1买N赠1")
    private Integer transferExcessPresentType;
    @ApiCloudField(value="买N赠1时的订购数量")
    private BigDecimal transferExcessPresentBuyQty;
    @ApiCloudField(value="应用门店列表", example="[1]")
    private List<Integer> branchNums;
}
