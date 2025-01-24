package com.forohub.forohub.domain.topico.dto;

import com.forohub.forohub.domain.topico.Estado;

public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
) {
}
