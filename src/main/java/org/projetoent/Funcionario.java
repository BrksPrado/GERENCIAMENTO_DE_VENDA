//* CRIADO POR: Gustavo .P */
//* 30/08/2025 - 19:01:15 */

package org.projetoent;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario extends PanacheEntityBase {
    
    @Id
    @Column(name = "codigo")
    public String codigo;
    
    @Column(name = "nome", nullable = false)
    public String nome;
    
    @Column(name = "cpf", unique = true, nullable = false)
    public String cpf;

    public Funcionario() {}

    public Funcionario(String codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }
}
