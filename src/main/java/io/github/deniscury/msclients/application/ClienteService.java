package io.github.deniscury.msclients.application;

import io.github.deniscury.msclients.domain.Cliente;
import io.github.deniscury.msclients.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository repository;

    @Transactional
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    public Optional<Cliente> getByCPF(String cpf) {
        return repository.findByCPF(cpf);
    }
}
