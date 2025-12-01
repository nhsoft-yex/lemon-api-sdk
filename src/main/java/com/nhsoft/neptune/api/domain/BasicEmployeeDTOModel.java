package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicEmployeeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicEmployeeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="人员编号", example="434400013")
    private Integer employeeNum;
    @ApiCloudField(value="人员代码", example="08")
    private String employeeCode;
    @ApiCloudField(value="人员姓名", example="杜一凡")
    private String employeeName;
    @ApiCloudField(value="人员类别", example="销售员")
    private String employeeKind;
    @ApiCloudField(value="联系电话", example="18058533300")
    private String employeeLinktel;
    @ApiCloudField(value="是否启用（true:启用， false:未启用）", example="false")
    private Boolean employeeActived;
    @ApiCloudField(value="备注", example="备注信息")
    private String employeeMemo;
    @ApiCloudField(value="是否删除（true:删除， false:未删除）", example="false")
    private Boolean employeeDelTag;
}
