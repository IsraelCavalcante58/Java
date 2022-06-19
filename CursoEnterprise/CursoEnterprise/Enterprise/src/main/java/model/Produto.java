package model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name="tb_produto")
public class Produto {
    @Id
    @SequenceGenerator(name="produto", sequenceName = "sq_tb_produto", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
    @Column(name="cd_produto")
    private Long id;

    @Column(name="nm_produto", length = 100)
    private String nome;

    @Column(name="vl_preco")
    private double preco;

    @Temporal(TemporalType.DATE)
    @Column(name="dt_validade")
    private Date dataValidade;

    @Enumerated(EnumType.STRING)
    private Estado estado;


    @Temporal(TemporalType.TIMESTAMP)
    @Column (name="dt_cadastro", updatable = false)
    private Date dataCriacao;
    @PrePersist
    public void dataCadastro(){
        dataCriacao = Date.from(ZonedDateTime.now(ZoneId.of("America/Sao_Paulo")).toInstant());
        dataModificacao = dataCriacao;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column (name="dt_modificacao", updatable = true)
    private Date dataModificacao;

    @PreUpdate
    public void dataModificacao(){
        dataModificacao = Date.from(ZonedDateTime.now(ZoneId.of("America/Sao_Paulo")).toInstant());
    }

    @Formula("vl_preco*0.9")
    private double precoDesconto;

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Timestamp dataCadastro) {
        this.dataCriacao = dataCadastro;
    }

    public Date getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Timestamp dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public double getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto(double precoDesconto) {
        this.precoDesconto = precoDesconto;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.estado = estado;
        this.dataCriacao = dataCriacao;
        this.dataModificacao = dataModificacao;
        this.precoDesconto = precoDesconto;
    }

    public Produto(){

    }
}
