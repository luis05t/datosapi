package com.example.facturasapi.repository

import com.example.facturasapi.model.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Repository interface for Client entity.
 * It extends JpaRepository to provide CRUD operations.
 */
@Repository
interface ClientRepository : JpaRepository<Client, Long> {

    // Puedes agregar métodos personalizados aquí, si es necesario.

    // Ejemplo:
    // fun findByNui(nui: String): Client?
}
