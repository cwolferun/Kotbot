package com.blacknall.kotbot.util

import com.blacknall.kotbot.util.BotGenerator.generateKotBots
import org.junit.jupiter.api.Test

internal class BotGeneratorTest {

    @Test
    fun someTest() {
        for (i in 1 until 15)
            println(generateKotBots())
    }
}