package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SmsBasicMessageFindDTO模型
 * 短信基础消息查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsBasicMessageFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="电话", example="18888312333")
    private String phone;
    @ApiCloudField(value="状态(SENDING=处理中，SUCCESS=处理完成，FAIL=处理失败)", example="SENDING")
    private String status;
    @ApiCloudField(value="类型(mkt=推广短信，notice=短信通知，verify_code=验证码)", example="verify_code")
    private String types;
    @ApiCloudField(value="起始时间(yyyy-MM-dd)", example="2021-01-21")
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="2021-01-21")
    private String dateTo;
    @ApiCloudField(value="查询分页页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大100)", example="100", required=true)
    private Integer pageSize;
}
