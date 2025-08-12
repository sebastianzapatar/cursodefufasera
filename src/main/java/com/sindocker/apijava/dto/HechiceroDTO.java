package com.sindocker.apijava.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record HechiceroDTO(
        @NotBlank
        String nombre,
        @NotBlank
        @Size(min=2, max=20)
        String elemento
) {
}
