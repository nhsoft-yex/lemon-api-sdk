package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SmsBasicTemplateSaveDTO模型
 * 短信基础模板保存
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsBasicTemplateSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="备注", example="测试模板")
    private String remark;
    @ApiCloudField(value="模板内容", example="您正在申请手机注册，验证码为：${code}，5分钟内有效！", required=true)
    private String text;
    @ApiCloudField(value="模板名称", example="零售", required=true)
    private String title;
    @ApiCloudField(value="短信类型(验证码=0，短信通知=1，推广短信=2)(推广短信不支持变量，验证码只支持一个变量，短信通知可支持多个)", example="1", required=true)
    private Integer type;
}
