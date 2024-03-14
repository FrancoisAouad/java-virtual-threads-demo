package com.mainms.categories;

import com.mainms.global.models.LocalizedLanguages;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "categories")
public class CategoryModel {

    private String name;

    private LocalizedLanguages description;

}
