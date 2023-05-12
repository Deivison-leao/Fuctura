package com.deivison.serviceCar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @Column(name = "CLIENTE_STATUS")
   private String status;
    @Column(name = "CLIENTE_E-mail")
    private String email;
    @Column(name = "CLIENTE_CADASTRO")
    private String cadastro;
    @Column(name = "CLIENTE_NOME")
    private String nome;
    @Column(name = "CLIENTE_CPF")
    private String cpf;
    @Column(name = "CLIENTE_FONE")
    private String fone;



}
