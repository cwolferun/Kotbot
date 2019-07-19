package com.blacknall.kotbot.controller

import com.blacknall.kotbot.domain.Kotbot
import com.blacknall.kotbot.service.KotService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BlankController(val kotService: KotService) {

    @GetMapping("/all")
    fun getAll() = kotService.getAllBots()

    @GetMapping("make/{count}")
    fun generate(@PathVariable count: Int):List<Kotbot> = kotService.createBots(count)
}