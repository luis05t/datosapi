package com.example.facturasapi.model

import jakarta.persistence.*

@Entity
@Table(name = "client")  // Cambiado a 'client' en singular
class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null,

    @Column(nullable = false, length = 13, unique = true)
    var nui: String? = null,

    @Column(nullable = false, length = 100)
    var fullname: String? = null,

    @Column(length = 50)
    var address: String? = null
)
