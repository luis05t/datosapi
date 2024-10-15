package com.example.facturasapi.controller

import com.example.facturasapi.model.Client
import com.example.facturasapi.service.ClientService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/clients")
class ClientController(private val clientService: ClientService) {

    @GetMapping
    fun getAllClients(): List<Client> {
        return clientService.list()
    }

    @GetMapping("/{id}")
    fun getClient(
        @PathVariable id: Long,
        @RequestParam(required = false) nui: String?,
        @RequestBody(required = false) client: Client?
    ): ResponseEntity<Any> {
        if (nui != null) {
            val clientByNui = clientService.findByNui(nui)
            return if (clientByNui != null) {
                ResponseEntity.ok(clientByNui)
            } else {
                ResponseEntity.notFound().build()
            }
        }

        if (client != null) {
            val savedClient = clientService.save(client)
            return ResponseEntity.ok(savedClient)
        }

        val clientById = clientService.list().find { it.id == id }
        return if (clientById != null) {
            ResponseEntity.ok(clientById)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PostMapping
    fun createClient(@RequestBody client: Client): ResponseEntity<Client> {
        val savedClient = clientService.save(client)
        return ResponseEntity.ok(savedClient)
    }
}
