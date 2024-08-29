package Servicio;

import Modelo.Cliente;
import Repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public void save(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public Cliente findById(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public void deleteById(Integer id) {
        clienteRepository.deleteById(id);
    }
}