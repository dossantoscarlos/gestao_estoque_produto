package com.dossantoscarlos.auth.modules.products.DTO;


import jakarta.validation.Valid;

public record UserCreateDTO(
        @Valid String name,
        @Valid String description) {
}
