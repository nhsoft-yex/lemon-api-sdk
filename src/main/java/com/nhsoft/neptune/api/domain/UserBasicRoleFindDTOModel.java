package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicRoleFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicRoleFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="合作伙伴类型（SUPPLIER|WHOLESALER|DISTRIBUTOR", example="SUPPLIER")
    private String partnerType;
}
