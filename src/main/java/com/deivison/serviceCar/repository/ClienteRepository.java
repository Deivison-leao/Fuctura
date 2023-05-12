package com.deivison.serviceCar.repository;

import com.deivison.serviceCar.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    // método para validações
    Optional<Cliente> findByEmail(String email);

    List<Cliente> findByNomeContainig(String nome);
}
