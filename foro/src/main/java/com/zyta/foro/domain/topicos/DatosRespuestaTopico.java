package com.zyta.foro.domain.topicos;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        Estado status,
        String autorx,
        String nombreCurso,
        LocalDateTime fecha
) {
}
