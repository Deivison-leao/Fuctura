package com.deivison.serviceCar.service;

import com.deivison.serviceCar.model.Cliente;
import com.deivison.serviceCar.model.Tecnico;
import com.deivison.serviceCar.repository.ClienteRepository;
//import com.deivison.serviceCar.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DbService {

    @Autowired
    private ClienteRepository clienteRepository;


    public void instanciaDb(){
        Cliente Cli1 = new Cliente(null, "ATENDIMENTO" ,"Js@gmail.com.br","0001","Jose", "00011122233", "81 911112222");
        Cliente Cli2 = new Cliente(null,"ATENDIMENTO" ,"iG@gmail.com.br","0002","Igor", "00011122232", "81 911112223");
        Cliente CLi3 = new Cliente(null,"FINALIZADO" ,"pd@gmail.com.br","0003","Pedro", "00011122231", "81 911112225");

        clienteRepository.saveAll(Arrays.asList(Cli1,Cli2,CLi3));


    }


}
