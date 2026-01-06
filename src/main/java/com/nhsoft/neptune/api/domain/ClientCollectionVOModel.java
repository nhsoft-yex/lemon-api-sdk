package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientCollectionVO模型
 * 客户收款VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientCollectionVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户收款单号", example="CC99675990000027")
    private String collectionNo;
    @ApiCloudField(value="客户编号", example="002003990000001")
    private String clientFid;
    @ApiCloudField(value="客户名称", example="001")
    private String clientName;
    @ApiCloudField(value="结算门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="收款日期", example="Mon Jan 01 08:00:00 CST 2024")
    private String collectionDate;
    @ApiCloudField(value="收款方式", example="现金")
    private String collectionType;
    @ApiCloudField(value="制单人", example="admin")
    private String collectionCreator;
    @ApiCloudField(value="制单时间")
    private String collectionCreateTime;
    @ApiCloudField(value="审核人", example="admin")
    private String collectionAuditor;
    @ApiCloudField(value="审核时间")
    private String collectionAuditTime;
    @ApiCloudField(value="收款金额", example="500.0")
    private BigDecimal collectionTotalMoney;
    @ApiCloudField(value="现金银行编号", example="43440001")
    private Integer accountBankNum;
    @ApiCloudField(value="最后更新时间")
    private String collectionLastEditTime;
    @ApiCloudField(value="最后编辑人", example="admin")
    private String collectionLastEditor;
    @ApiCloudField(value="预收余额", example="0.0")
    private BigDecimal collectionPreMoney;
    @ApiCloudField(value="应收金额(读取接口返回该值)", example="1100.0")
    private BigDecimal dueMoney;
    @ApiCloudField(value="状态代码", example="1")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String stateName;
    @ApiCloudField(value="结算明细")
    private List<ClientCollectionDetailVOModel> clientCollectionDetails;
}
