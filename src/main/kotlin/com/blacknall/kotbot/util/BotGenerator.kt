package com.blacknall.kotbot.util

import com.blacknall.kotbot.domain.Kotbot
import com.blacknall.kotbot.domain.SizeClass
import java.util.*

object BotGenerator {

    private val rockco = listOf("Lead 200", "Granite 450", "Graphite 300")
    private val realSteel = listOf("Iron 9", "Coal 4", "Coal 5", "Coal 6")
    private val wolverine = listOf("Gulo 45", "Bear 44", "Bear 45")
    private val silico = listOf("Fransisco 85", "Diego 80", "Berkley 90")
    private val active = listOf("Runner 3", "Jumper 4", "Swimmer 1", "Vaulter 8", "Bender")

    private val mans = mapOf("Rock Co" to rockco, "Real Steele" to realSteel, "Wolverine" to wolverine,
            "Sili Co" to silico, "Active Bots" to active)

    fun generateKotBots(count:Int =1): List<Kotbot>{
        assert(count > 0)
     val bots:MutableList<Kotbot> = mutableListOf()
        for (i in 1..count) {
            val man = mans.keys.random()
            bots.add( Kotbot( manufacturer = man,model = (mans.get(man)?.random())
                    ?: "zoobs",sizeClass =  SizeClass.values().random(),sell =  (Random().nextInt() % 2) == 0))
        }
        return bots
    }
}