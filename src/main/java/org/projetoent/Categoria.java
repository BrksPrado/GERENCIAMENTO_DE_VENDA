//* CRIADO POR: Gustavo .P */
//* 30/08/2025 - 18:49:10 */

package org.projetoent;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria extends PanacheEntityBase {
    
    @Id
    @Column(name = "codigo")
    public String codigo;
    
    @Column(name = "nome", nullable = false)
    public String nome;

    public Categoria() {}

    public Categoria(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
