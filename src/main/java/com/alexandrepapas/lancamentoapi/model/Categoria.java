package com.alexandrepapas.lancamentoapi.model;

import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long codigo;

        private String nome;
        
        public Long getCodigo() {
            return codigo;
        }

        public void setCodigo(Long codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
}
