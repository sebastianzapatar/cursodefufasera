package com.sindocker.apijava.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record VirgenesDTO(
        @NotBlank(message="No soy puta soy versátil")
        @Size(min=2)
        String nombre,
        @Size(min=10)
        String descripcion,
        @Min(value = 14,message = "No seas puta tan rapido 😢")
        Long edad,
        @Email(message = "No seas taparo email valido")
        String correo) {
}
