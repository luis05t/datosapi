package com.example.facturasapi.service

import com.example.facturasapi.model.Client
import com.example.facturasapi.repository.ClientRepository
import org.springframework.stereotype.Service

@Service
class ClientService(private val clientRepository: ClientRepository) {

    fun list(): List<Client> {
        return clientRepository.findAll()
    }

    fun save(client: Client): Client {
        return clientRepository.save(client)
    }

    // Método para encontrar un cliente por NUI
    fun findByNui(nui: String): Client? {
        return clientRepository.findByNui(nui)
    }
}
