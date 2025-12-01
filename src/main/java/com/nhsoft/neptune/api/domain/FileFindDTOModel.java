package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * FileFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FileFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="业务类型(会员卡结算|供应商协议|供应商商品调价|供应商商品调价单|供应商管理|内部申请单|加盟店费用|售后申请|商品档案|商品调价|客户申请|客户费用|客户预收|库存盘点单|批发退货|批发销售|收货单|新品申请|盘点单|调入单|调出单|调整单|退货单|邮件通知|采购订单|门店客户费用|门店补货|预盘单)", example="供应商结算", required=true)
    private String bizType;
    @ApiCloudField(value="业务单据号", example="CP123123123131", required=true)
    private String bizFid;
}
