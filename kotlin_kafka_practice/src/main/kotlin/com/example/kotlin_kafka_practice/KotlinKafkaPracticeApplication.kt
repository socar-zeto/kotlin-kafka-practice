package com.example.kotlin_kafka_practice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.kafka.annotation.KafkaListener


class KotlinKafkaPracticeApplication

@SpringBootApplication
class Application {

    @KafkaListener(id = "myId", topics = ["test"])
    fun listen(value: String?) {
        println(value)
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
