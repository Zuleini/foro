package com.zyta.foro.domain.topicos;


import java.time.LocalDateTime;

public record DatosDetalleTopico (
        Long id,
        Long idUsuario,
        String titulo,
        String mensaje,
        String nombreCurso,
        LocalDateTime fecha
){
    public DatosDetalleTopico(Topico topico){
        this(topico.getId(), topico.getAutorx().getId(), topico.getTitulo(), topico.getMensaje(), topico.getNombreCurso(),topico.getFecha());
    }
}
