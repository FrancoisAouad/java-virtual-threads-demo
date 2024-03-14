package com.mainms.global.models;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductInventory {

    private boolean inStock;

    private int quantity;
}
