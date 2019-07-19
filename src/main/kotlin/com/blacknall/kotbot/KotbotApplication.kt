package com.blacknall.kotbot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotbotApplication

fun main(args: Array<String>) {
	runApplication<KotbotApplication>(*args)
}
