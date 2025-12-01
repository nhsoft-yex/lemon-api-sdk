package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SmsBasicMessageVO模型
 * 短信基础消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsBasicMessageVOModel extends ApiCloudObject {

    @ApiCloudField(value="电话", example="18888312333")
    private String mobile;
    @ApiCloudField(value="状态(SENDING=处理中，SUCCESS=处理完成，FAIL=处理失败)", example="SENDING")
    private String status;
    @ApiCloudField(value="类型(mkt=推广短信，notice=短信通知，verify_code=验证码)", example="verify_code")
    private String type;
    @ApiCloudField(value="短信内容", example="9999：您的会员卡(尾号1115)于2021年01月26日 14:49:24完成一笔存款，金额200.00元。")
    private String content;
    @ApiCloudField(value="创建时间", example="2021-01-21 00:00:00")
    private String createdAt;
}
