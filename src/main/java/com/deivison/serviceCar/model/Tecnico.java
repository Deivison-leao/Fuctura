package com.deivison.serviceCar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tecnico  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @Column(name = "TEC_STATUS")
   private String status;
    @Column(name = "TEC_E-mail")
    private String email;
    @Column(name = "TEC_REGISTRO")
    private String registro;
    @Column(name = "TEC_NOME")
    private String nome;
    @Column(name = "TEC_CPF")
    private String cpf;
    @Column(name = "TEC_FONE")
    private String fone;



}
