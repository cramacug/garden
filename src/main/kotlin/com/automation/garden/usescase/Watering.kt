package com.automation.garden.usescase

import org.springframework.boot.autoconfigure.kafka.KafkaProperties

fun watering() {
    analyse()
}

private fun analyse(): Unit {
    println("Hello World")

    val kafka = KafkaProperties()
    kafka.producer.clientId = "1"
}