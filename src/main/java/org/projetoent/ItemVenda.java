//* CRIADO POR: Gustavo .P */
//* 30/08/2025 - 18:51:38 */

package org.projetoent;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_venda")
public class ItemVenda extends PanacheEntityBase {
    
    @Id
    @Column(name = "codigo")
    public String codigo;
    
    @Column(name = "valor_parcial", nullable = false)
    public double valorParcial;
    
    @Column(name = "quantidade_parcial", nullable = false)
    public int quantidadeParcial;
    
    @ManyToOne
    @JoinColumn(name = "produto_codigo", nullable = false)
    public Produto produto;
    
    @ManyToOne
    @JoinColumn(name = "venda_codigo", nullable = false)
    public Venda venda;

    public ItemVenda() {}

    public ItemVenda(String codigo, double valorParcial, int quantidadeParcial, Produto produto, Venda venda) {
        this.codigo = codigo;
        this.valorParcial = valorParcial;
        this.quantidadeParcial = quantidadeParcial;
        this.produto = produto;
        this.venda = venda;
    }
}
