package com.deivison.serviceCar.controller;


import com.deivison.serviceCar.dto.ClienteDto;
import com.deivison.serviceCar.model.Cliente;
import com.deivison.serviceCar.service.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<ClienteDto>> findAll() {
        List<Cliente> cliList = clienteService.findAll();
        return ResponseEntity.ok().body(cliList.stream().map(x -> modelMapper.map(x, ClienteDto.class))
                .collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto> getById(@PathVariable Integer id){
        Optional<Cliente> cli = clienteService.findById(id);
        return ResponseEntity.ok().body(modelMapper.map(cli, ClienteDto.class));
    }
    @PostMapping
    public ResponseEntity<ClienteDto> save(@Validated @RequestBody ClienteDto clienteDto){
        Cliente cli = clienteService.save(clienteDto);
        return ResponseEntity.ok().body(modelMapper.map(cli, ClienteDto.class));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteDto> update(@PathVariable Integer id, @Validated @RequestBody
    ClienteDto clienteDto){
        clienteDto.setId(id);
        return ResponseEntity.ok().body(modelMapper.map(clienteService.update(clienteDto), ClienteDto.class));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        clienteService.delete(id);
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<ClienteDto>> findByNome(@PathVariable String name){
        List<Cliente> cliList = clienteService.findByName(name);
        return ResponseEntity.ok().body(cliList.stream().map(x -> modelMapper.map(x, ClienteDto.class))
                .collect(Collectors.toList()));
    }
}