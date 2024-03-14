package com.mainms.categories.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mainms.global.models.LocalizedLanguages;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class CategoryDto {
    @Size(min = 2, max = 20, message = "Name should be between 2 and 20 characters")
    @NotEmpty(message = "Name should not be empty")
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private LocalizedLanguages description;
}
