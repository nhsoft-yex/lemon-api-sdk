package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleBookFindV2DTO模型
 * 批发预订查询V2 DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleBookFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码（时间类型为最后修改时间允许为空）", example="99")
    private Integer branchNum;
    @ApiCloudField(value="客户编号", example="0015005990000001")
    private String clientFid;
    @ApiCloudField(value="时间类型:制单时间、审核时间、作废时间、最后修改时间", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", example="2021-01-18", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-18", required=true)
    private String dateTo;
    @ApiCloudField(value="开始时间(HH:mm:ss)", example="13:00:00")
    private String timeFrom;
    @ApiCloudField(value="结束时间(HH:mm:ss)", example="14:00:00")
    private String timeTo;
    @ApiCloudField(value="单据状态代码(1:制单 3:制单|审核 7:制单|审核|中止)", example="[1,3]")
    private List<Integer> stateCodes;
    @ApiCloudField(value="是否仅查询有效期内", example="1")
    private Integer isValid;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
