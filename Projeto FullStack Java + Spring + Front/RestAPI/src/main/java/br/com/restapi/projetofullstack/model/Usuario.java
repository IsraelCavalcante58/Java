package br.com.restapi.projetofullstack.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome_completo", length = 80, nullable = false)
    private String nome;

    @Column(name = "email", length = 80, nullable = false)
    private String email;

    @Column(name = "senha", length = 80, nullable = false, columnDefinition = "TEXT")
    private String senha;

    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;
}
