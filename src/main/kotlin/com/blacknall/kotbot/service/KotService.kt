package com.blacknall.kotbot.service

import com.blacknall.kotbot.repository.BotRepo
import com.blacknall.kotbot.util.BotGenerator
import org.springframework.stereotype.Service

@Service
class KotService(val botRepo: BotRepo) {
   fun getAllBots() = botRepo.findAll()

   fun createBots(count: Int) = botRepo.saveAll( BotGenerator.generateKotBots(count))
}