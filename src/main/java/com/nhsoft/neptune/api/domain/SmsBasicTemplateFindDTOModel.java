package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SmsBasicTemplateFindDTO模型
 * 短信基础模板查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsBasicTemplateFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="模板内容", example="您正在申请手机${phone}注册，验证码为：${code}，5分钟内有效！")
    private String text;
    @ApiCloudField(value="模板名称", example="零售行业")
    private String title;
    @ApiCloudField(value="状态(可用=0，审核中=1，不可用=2，未知=-1)")
    private Integer status;
    @ApiCloudField(value="备注", example="测试模板")
    private String remark;
    @ApiCloudField(value="模板ID")
    private Integer templateId;
    @ApiCloudField(value="短信类型(验证码=0，短信通知=1，推广短信=2)", example="1")
    private Integer type;
    @ApiCloudField(value="起始时间(yyyy-MM-dd HH:mm:ss)", example="2021-01-21 00:00:00")
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd HH:mm:ss)", example="2021-01-21 00:00:00")
    private String dateTo;
    @ApiCloudField(value="查询分页页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大100)", example="100", required=true)
    private Integer pageSize;
}
