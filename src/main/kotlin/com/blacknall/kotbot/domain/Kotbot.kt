package com.blacknall.kotbot.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "kotbots")
data class Kotbot (@Id val serial:UUID= UUID.randomUUID(), val manufacturer:String,
              val model: String, val sizeClass:SizeClass, var sell:Boolean)

enum class SizeClass{
    A,B,C
}