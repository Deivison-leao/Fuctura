package com.deivison.serviceCar.service;

import com.deivison.serviceCar.dto.ClienteDto;
import com.deivison.serviceCar.model.Cliente;
import com.deivison.serviceCar.repository.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(Integer id){
        Optional<Cliente> cli = clienteRepository.findById(id);
        return clienteRepository.findById(id);
    }

    public Cliente save(ClienteDto clienteDto){
        return clienteRepository.save(modelMapper.map(clienteDto, Cliente.class ));
    }

    public Cliente  update(ClienteDto clienteDto){
        findById(clienteDto.getId());
        return clienteRepository.save(modelMapper.map(clienteDto, Cliente.class));
    }

    public void delete(Integer id){
        findById(id);
        clienteRepository.deleteById(id);
    }

    public List<Cliente> findByName(String name){
        return clienteRepository.findByNomeContainig(name);

    }

    private void findByEmail(ClienteDto clienteDto) {
        Optional<Cliente> cli = clienteRepository.findByEmail(clienteDto.getEmail());
    }
}
