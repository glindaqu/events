package ru.glindaqu.events

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EventsApplication

fun main(args: Array<String>) {
	runApplication<EventsApplication>(*args)
}
