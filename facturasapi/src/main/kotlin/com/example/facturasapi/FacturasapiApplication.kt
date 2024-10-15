package com.example.facturasapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Aplicación principal de Spring Boot para la API de facturas.
 */
@SpringBootApplication
class FacturasapiApplication

fun main(args: Array<String>) {
	// Inicia la aplicación Spring Boot
	runApplication<FacturasapiApplication>(*args)
}
