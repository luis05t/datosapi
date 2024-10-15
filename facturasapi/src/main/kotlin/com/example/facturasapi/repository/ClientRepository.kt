package com.example.facturasapi.repository

import com.example.facturasapi.model.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : JpaRepository<Client, Long> {
    // Método personalizado para encontrar un cliente por NUI
    fun findByNui(nui: String): Client?
}
