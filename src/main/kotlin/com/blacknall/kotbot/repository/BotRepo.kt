package com.blacknall.kotbot.repository

import com.blacknall.kotbot.domain.Kotbot
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BotRepo :MongoRepository<Kotbot,UUID>{

}