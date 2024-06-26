package com.zyta.foro.domain.topicos.validaciones;

import com.zyta.foro.domain.topicos.DatosCrearTopico;
import com.zyta.foro.domain.topicos.TopicoRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrosDuplicados implements ValidadorDeTopicos{
    @Autowired
    private TopicoRepository topicoRepository;

    public void validar(DatosCrearTopico datos){
        var titulo = datos.titulo();
        var mensaje = datos.mensaje();

        var registroDuplicado = topicoRepository.existsByTituloAndMensaje(titulo, mensaje);

        if(registroDuplicado){
            throw new ValidationException("Mensaje duplicado en este título");
        }
    }

}
