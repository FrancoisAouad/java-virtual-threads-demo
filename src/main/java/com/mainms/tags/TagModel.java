package com.mainms.tags;

import com.mainms.global.models.LocalizedLanguages;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tags")
public class TagModel {

    @Id
    private String id;

    private String name;

    private LocalizedLanguages description;
}
