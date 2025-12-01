package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ShiftTableVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShiftTableVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="班次编码", example="20003")
    private Integer shiftTableNum;
    @ApiCloudField(value="营业日", example="20201028")
    private String shiftTableBizday;
    @ApiCloudField(value="用户编码", example="103790002")
    private Integer shiftTableUserNum;
    @ApiCloudField(value="用户名称", example="001")
    private String shiftTableUserName;
    @ApiCloudField(value="班次是否结束", example="true")
    private Boolean shiftTableClosed;
    @ApiCloudField(value="现金交班实收", example="101.0")
    private BigDecimal shiftTableActualMoney;
    @ApiCloudField(value="银联卡交班实收", example="100.0")
    private BigDecimal shiftTableActualBankMoney;
    @ApiCloudField(value="状态（0 未审核，1 审核，2 待审核）", example="0")
    private Integer shiftTableStatus;
    @ApiCloudField(value="备注", example="自动创建班次")
    private String shiftTableMemo;
    @ApiCloudField(value="开班时间", example="2022-12-14 01:05:20")
    private String shiftTableStart;
    @ApiCloudField(value="交班时间", example="2022-12-14 20:15:20")
    private String shiftTableEnd;
    @ApiCloudField(value="最后修改时间", example="2022-12-14 11:05:20")
    private String shiftTableLastEditTime;
}
