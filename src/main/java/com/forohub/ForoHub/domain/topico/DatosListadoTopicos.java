package com.forohub.ForoHub.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopicos(
        Long id,
        String titulo,
        Boolean estatus,
        String curso,
        LocalDateTime fechaDeCreacion
) {
    public DatosListadoTopicos(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.isEstatus(), topico.getCurso(), topico.getFechaDeCreacion());
    }
}
