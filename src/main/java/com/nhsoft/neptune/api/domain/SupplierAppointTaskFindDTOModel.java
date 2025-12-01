package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAppointTaskFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAppointTaskFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="状态代码 制单(1)|预约中(2)|预约完成(3)|作废(4)", example="")
    private List<Integer> stateCodes;
    @ApiCloudField(value="是否查询详情", example="false")
    private Boolean withDetail;
    @ApiCloudField(value="创建时间|预约时间|确认时间|修改时间", example="")
    private String dateType;
    @ApiCloudField(value="开始时间")
    private String dateFrom;
    @ApiCloudField(value="结束时间")
    private String dateTo;
    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="查询分页页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大300)", example="300", required=true)
    private Integer pageSize;
}
