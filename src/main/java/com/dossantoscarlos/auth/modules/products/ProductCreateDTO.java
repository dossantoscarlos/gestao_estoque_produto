package com.dossantoscarlos.auth.modules.products;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


public record ProductCreateDTO (
    @NotNull
    @Min(5)
    String produto,
    
    @NotBlank
    @NotEmpty
    @NotNull
    String description
) {}

