package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PartnerGroupVO模型
 * 合作伙伴分组VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PartnerGroupVOModel extends ApiCloudObject {

    @ApiCloudField(value="合作伙伴分组ID", example="1")
    private Integer id;
    @ApiCloudField(value="合作伙伴分组名称", example="分组1")
    private String name;
    @ApiCloudField(value="备注", example="备注")
    private String memo;
    @ApiCloudField(value="是否删除", example="false")
    private Boolean deleted;
    @ApiCloudField(value="合作伙伴ID列表", example="[1]")
    private List<Long> partnerIds;
    @ApiCloudField(value="合作伙伴类型(SUPPLIER|WHOLESALER|DISTRIBUTOR)", example="SUPPLIER")
    private String type;
    @ApiCloudField(value="创建时间")
    private String createdAt;
    @ApiCloudField(value="最后更新时间")
    private String updatedAt;
}
