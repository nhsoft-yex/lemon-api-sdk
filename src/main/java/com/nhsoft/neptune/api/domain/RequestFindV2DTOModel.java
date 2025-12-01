package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出门店编码", example="99", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="开始日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期(yyyy-MM-dd)(与date_from时间间隔不能超过5天)", example="2021-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="开始时间(HH:mm:ss),仅当时间类型为制单时间和审核时间有效", example="13:00:00")
    private String timeFrom;
    @ApiCloudField(value="结束时间(HH:mm:ss),仅当时间类型为制单时间和审核时间有效", example="14:00:00")
    private String timeTo;
    @ApiCloudField(value="时间类型:制单时间、审核时间、作废时间、最后修改时间、配送日期、采购日、付款时间", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="单据状态代码(1:制单 3:制单|审核 7:制单|审核|作废)", example="[1,3]")
    private List<Integer> stateCodes;
    @ApiCloudField(value="要货门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="调出单单号", example="MO4344990005689")
    private String outOrderFid;
    @ApiCloudField(value="是否仅查询有效期内(0:否，1：是)", example="0")
    private Integer isValid;
    @ApiCloudField(value="是否已调出(0:否，1：是)", example="0")
    private Integer isOut;
    @ApiCloudField(value="单据类型(0:正常单 1:加单 2:预定单)", example="0")
    private Integer orderType;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="配送方式(0:商家配送;1:门店自提)", example="0")
    private Integer requestOrderSendType;
    @ApiCloudField(value="request_order_fids")
    private List<String> requestOrderFids;
    @ApiCloudField(value="要货周期编号列表", example="")
    private List<Long> requestBatchIds;
    @ApiCloudField(value="总部配送调出状态(0:待处理|1:拣货中|2:已过期|3:部分发货|4:全部发货)", example="[0]")
    private List<Integer> requestOrderTransferStateCodes;
    @ApiCloudField(value="查询调出状态", example="true")
    private Boolean queryTransferOut;
    @ApiCloudField(value="结算状态(1-未付款,2-已付款)", example="2")
    private Integer requestOrderSettlementState;
}
