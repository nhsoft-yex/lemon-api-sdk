package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PartnerGroupUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PartnerGroupUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="合作伙伴分组名称(模糊查询)", example="分组1", required=true)
    private String name;
    @ApiCloudField(value="合作伙伴ID列表", example="[1]")
    private List<Long> partnerIds;
    @ApiCloudField(value="合作伙伴类型(SUPPLIER|WHOLESALER|DISTRIBUTOR)", example="SUPPLIER", required=true)
    private String type;
    @ApiCloudField(value="备注(模糊查询)", example="备注")
    private String memo;
    @ApiCloudField(value="合作伙伴分组ID", example="1", required=true)
    private Integer id;
}
