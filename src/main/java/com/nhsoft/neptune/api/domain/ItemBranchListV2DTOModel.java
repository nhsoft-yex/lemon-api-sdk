package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemBranchListV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemBranchListV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="last_download_time", required=true)
    private String lastDownloadTime;
    @ApiCloudField(value="page_no")
    private Integer pageNo;
    @ApiCloudField(value="page_size")
    private Integer pageSize;
    @ApiCloudField(value="item_nums")
    private String itemNums;
    @ApiCloudField(value="branch_num", required=true)
    private Integer branchNum;
}
