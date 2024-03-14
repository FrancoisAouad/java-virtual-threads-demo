package com.mainms.global.models;

import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class LocalizedLanguages {
    @Max(300)
    public String en;

    @Max(300)
    public String ar;

}
