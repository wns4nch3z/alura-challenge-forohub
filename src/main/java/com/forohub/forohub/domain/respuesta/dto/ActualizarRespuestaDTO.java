package com.forohub.forohub.domain.respuesta.dto;

public record ActualizarRespuestaDTO(
        String mensaje,
        Boolean solucion,
        Boolean borrado
) {
}
