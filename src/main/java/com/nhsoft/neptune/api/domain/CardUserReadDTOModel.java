package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUserReadDTO模型
 * 会员卡读取DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUserReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡ID", example="1")
    private Integer cardUserNum;
    @ApiCloudField(value="query_revoke_card")
    private Boolean queryRevokeCard;
    @ApiCloudField(value="query_deadline_card")
    private Boolean queryDeadlineCard;
    @ApiCloudField(value="储值卡付款码", example="571622992112")
    private String payCode;
    @ApiCloudField(value="储值卡表面卡号", example="98520")
    private String cardPrintNum;
}
