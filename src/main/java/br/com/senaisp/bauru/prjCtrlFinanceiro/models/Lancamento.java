package br.com.senaisp.bauru.prjCtrlFinanceiro.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lancamento")
public class Lancamento {

private BigDecimal valor;
    //Indicará no banco de dados que a coluna vai se chamar data_lancamento
    @Column(name = "data_lancamento")
    private LocalDate dataLancamento;

    private String observacao;
    //Indicará no banco de dados que a coluna vai se chamar categoria_id e irá relacionar-se com a tabela de categorias
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    //Indicará no banco de dados que a coluna vai se chamar usuario_id e irá relacionar-se com a tabela de usuarios
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
