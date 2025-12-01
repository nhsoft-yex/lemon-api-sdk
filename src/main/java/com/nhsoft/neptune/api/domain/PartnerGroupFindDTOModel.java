package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PartnerGroupFindDTO模型
 * 合作伙伴分组查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PartnerGroupFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="合作伙伴分组ID", example="1")
    private Integer id;
    @ApiCloudField(value="合作伙伴分组名称(模糊查询)", example="分组1")
    private String name;
    @ApiCloudField(value="合作伙伴ID列表", example="[1]")
    private List<Long> partnerIds;
    @ApiCloudField(value="合作伙伴类型(SUPPLIER|WHOLESALER|DISTRIBUTOR)", example="SUPPLIER", required=true)
    private String type;
    @ApiCloudField(value="备注(模糊查询)", example="备注")
    private String memo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为200)", example="10", required=true)
    private Integer pageSize;
}
