package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SmsBasicTemplateVO模型
 * 短信基础模板VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsBasicTemplateVOModel extends ApiCloudObject {

    @ApiCloudField(value="模板ID", example="2")
    private Integer templateId;
    @ApiCloudField(value="模板内容", example="您正在申请手机${phone}注册，验证码为：${code}，5分钟内有效！")
    private String text;
    @ApiCloudField(value="模板名称", example="零售行业")
    private String title;
    @ApiCloudField(value="状态(可用，审核中，不可用，未知)")
    private String status;
    @ApiCloudField(value="短信类型(验证码，短信通知，推广短信)", example="短信通知")
    private String type;
    @ApiCloudField(value="申请时间(yyyy-MM-dd HH:mm:ss)", example="2021-01-21 00:00:00")
    private String applyTime;
    @ApiCloudField(value="回复时间(yyyy-MM-dd HH:mm:ss)", example="2021-01-21 00:00:00")
    private String replyTime;
    @ApiCloudField(value="备注", example="测试模板")
    private String remark;
    @ApiCloudField(value="起始时间(yyyy-MM-dd HH:mm:ss)", example="2021-01-21 00:00:00")
    private String createTime;
}
