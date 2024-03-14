package com.mainms.products;

import com.mainms.categories.CategoryModel;
import com.mainms.global.models.LocalizedLanguages;
import com.mainms.global.models.ProductInventory;
import com.mainms.tags.TagModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class ProductModel {

    @Id
    private String id;

    private String name;

    private LocalizedLanguages description;

    private double price;

    @DBRef
    private CategoryModel category;

    @DBRef
    private TagModel[] tags;

    private String[] images;

    private ProductInventory inventory;
}
