//* CRIADO POR: Gustavo .P */
//* 30/08/2025 - 18:53:41 */

package org.projetoent;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto extends PanacheEntityBase {
    
    @Id
    @Column(name = "codigo")
    public String codigo;
    
    @Column(name = "nome", nullable = false)
    public String nome;
    
    @Column(name = "preco", nullable = false)
    public double preco;
    
    @Column(name = "quantidade", nullable = false)
    public int quantidade;
    
    @Column(name = "validade")
    public LocalDate validade;
    
    @ManyToOne
    @JoinColumn(name = "categoria_codigo", nullable = false)
    public Categoria categoria;
    
    @ManyToOne
    @JoinColumn(name = "fabricante_codigo", nullable = false)
    public Fabricante fabricante;

    public Produto() {}

    public Produto(String codigo, String nome, double preco, int quantidade, LocalDate validade, Categoria categoria, Fabricante fabricante) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
        this.categoria = categoria;
        this.fabricante = fabricante;
    }
}
