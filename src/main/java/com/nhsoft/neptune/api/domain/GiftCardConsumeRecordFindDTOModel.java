package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardConsumeRecordFindDTO模型
 * 礼品卡消费记录查询参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardConsumeRecordFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为100)", example="1", required=true)
    private Integer pageSize;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="礼品卡id(与礼品卡卡号二选一必填)", example="1")
    private Long cardId;
    @ApiCloudField(value="礼品卡卡号(与礼品卡id二选一必填)", example="1")
    private String cardPrintedNum;
    @ApiCloudField(value="用户id列表", example="[1]")
    private List<String> customerIds;
}
