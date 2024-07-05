package com.forohub.ForoHub.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String autor,
        @NotBlank
        String curso,
        @JsonAlias({"fecha_de_creacion", "fechaDeCreacion"}) LocalDate fechaDeCreacion
) {
}
