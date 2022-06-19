package model;

import javax.persistence.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table (name="tb_fornecedor")
public class Fornecedor {

    @SequenceGenerator(name="fornecedor", sequenceName = "sq_tb_fornecedor", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fornecedor")
    @Column(name="cd_fornecedor")
    @Id
    private Long id;

    @Column(name="nm_fornecedor", nullable = false, length = 50)
    private String nome;

    @Column(name="dt_cadastro")
    @CreationTimestamp
    private Calendar dataCadastro;

    @Column(name="dt_modificacao")
    @UpdateTimestamp
    private Calendar dataModificacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Calendar getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Calendar dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public Fornecedor(Long id, String nome, Calendar dataCadastro, Calendar dataModificacao) {
        this.id = id;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.dataModificacao = dataModificacao;
    }

    public Fornecedor() {

    }
}

