package com.forohub.forohub.domain.curso.dto;

import com.forohub.forohub.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo
) {

}
