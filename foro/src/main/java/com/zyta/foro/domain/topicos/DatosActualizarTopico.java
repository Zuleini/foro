package com.zyta.foro.domain.topicos;

public record DatosActualizarTopico(
        Long id,
        String titulo,
        String mensaje,
        String nombreCurso
) {
}
