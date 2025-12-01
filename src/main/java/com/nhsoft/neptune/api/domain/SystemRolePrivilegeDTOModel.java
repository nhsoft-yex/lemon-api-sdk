package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemRolePrivilegeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemRolePrivilegeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="资源主键", required=true)
    private Integer privilegeResourceKey;
    @ApiCloudField(value="查询", example="false")
    private Boolean roleQuery;
    @ApiCloudField(value="编辑", example="false")
    private Boolean roleEdit;
    @ApiCloudField(value="删除", example="false")
    private Boolean roleDelete;
    @ApiCloudField(value="审核", example="false")
    private Boolean roleAudit;
    @ApiCloudField(value="作废", example="false")
    private Boolean roleInvalid;
    @ApiCloudField(value="反审核", example="false")
    private Boolean roleReAudit;
    @ApiCloudField(value="打印", example="false")
    private Boolean rolePrint;
    @ApiCloudField(value="导出", example="false")
    private Boolean roleExport;
    @ApiCloudField(value="冲红", example="false")
    private Boolean roleAnti;
}
