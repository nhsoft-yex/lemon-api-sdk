package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PrivilegeResourceNewV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PrivilegeResourceNewV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="权限编码")
    private Integer privilegeResourceKey;
    @ApiCloudField(value="权限名称", example="")
    private String privilegeResourceName;
    @ApiCloudField(value="权限类别", example="")
    private String privilegeResourceCategory;
    @ApiCloudField(value="权限内容", example="")
    private String privilegeResourceProduct;
    @ApiCloudField(value="是否可查询", example="")
    private Object privilegeResourceQuery;
    @ApiCloudField(value="是否可编辑", example="")
    private Object privilegeResourceEdit;
    @ApiCloudField(value="是否可删除", example="")
    private Object privilegeResourceDelete;
    @ApiCloudField(value="是否可审核", example="")
    private Object privilegeResourceAudit;
    @ApiCloudField(value="是否可失效", example="")
    private Object privilegeResourceInvalid;
    @ApiCloudField(value="是否可反审核", example="")
    private Object privilegeResourceReAudit;
    @ApiCloudField(value="是否可打印", example="")
    private Object privilegeResourcePrint;
    @ApiCloudField(value="是否可导出", example="")
    private Object privilegeResourceExport;
    @ApiCloudField(value="父节点")
    private Integer privilegeResourceParentKey;
}
