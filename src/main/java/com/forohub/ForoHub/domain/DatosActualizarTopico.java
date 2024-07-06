package com.forohub.ForoHub.domain;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String curso) {
}
