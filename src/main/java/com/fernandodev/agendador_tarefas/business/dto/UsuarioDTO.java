package com.fernandodev.agendador_tarefas.business.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UsuarioDTO {

    private String email;
    private String senha;

