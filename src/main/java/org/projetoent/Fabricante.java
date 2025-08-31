package org.projetoent;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fabricante")
public class Fabricante extends PanacheEntityBase {
    
    @Id
    @Column(name = "codigo")
    public String codigo;
    
    @Column(name = "nome", nullable = false)
    public String nome;

    public Fabricante() {}

    public Fabricante(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
