package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberLevelFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberLevelFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="会员等级编号", example="207200000019")
    private List<String> levelIds;
}
