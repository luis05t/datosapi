package com.example.facturasapi.controller

import com.example.facturasapi.model.Client
import com.example.facturasapi.service.ClientService
import org.springframework.web.bind.annotation.*

@RestController // Cambiado a RestController para devolver JSON automáticamente
@RequestMapping("/client")
class ClientController(
    private val clientService: ClientService
) {

    @GetMapping
    fun list(): List<Client> {
        // Devuelve una lista de clientes
        return clientService.list()
    }

    @PostMapping
    fun save(@RequestBody client: Client): Client {
        // Guarda un nuevo cliente y devuelve el cliente guardado
        return clientService.save(client)
    }
}
