//* CRIADO POR: Gustavo .P */
//* 30/08/2025 - 18:52:55 */

package org.projetoent;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "venda")
public class Venda extends PanacheEntityBase {
    
    @Id
    @Column(name = "codigo")
    public String codigo;
    
    @Column(name = "horario", nullable = false)
    public LocalDateTime horario;
    
    @Column(name = "valor_total", nullable = false)
    public double valorTotal;
    
    @Column(name = "quantidade_total", nullable = false)
    public int quantidadeTotal;
    
    @ManyToOne
    @JoinColumn(name = "cliente_codigo", nullable = false)
    public Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name = "funcionario_codigo", nullable = false)
    public Funcionario funcionario;

    public Venda() {}

    public Venda(String codigo, LocalDateTime horario, double valorTotal, int quantidadeTotal, Cliente cliente, Funcionario funcionario) {
        this.codigo = codigo;
        this.horario = horario;
        this.valorTotal = valorTotal;
        this.quantidadeTotal = quantidadeTotal;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }
}
