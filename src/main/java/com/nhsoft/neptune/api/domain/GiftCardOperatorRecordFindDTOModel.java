package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardOperatorRecordFindDTO模型
 * 礼品卡操作记录查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardOperatorRecordFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为100)", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="礼品卡id(与礼品卡卡号二选一必填)", example="1")
    private Long cardId;
    @ApiCloudField(value="礼品卡卡号(与礼品卡id二选一必填)", example="1")
    private String cardPrintedNum;
    @ApiCloudField(value="操作类型(PURCHASE|PRESENT|DEPOSIT_CARD|INVALID|BATCH|BIND|WRITE_OFF|UPDATE|CONSUME|LOCK|UNLOCK)", example="[PURCHASE,BATCH]")
    private List<String> actionTypes;
}
