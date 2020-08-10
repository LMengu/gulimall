package com.atguigu.gulimall.ware.vo;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class PurchaseDoneVo {
    @NotNull
    private Long id;//采购单id

    private List<PurchaseItemDoneVo> items;
}
