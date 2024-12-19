package ru.glindaqu.events.controllers

import org.springframework.stereotype.Component
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import ru.glindaqu.events.services.EventsService

@Component
@RequestMapping("/")
class IndexController(private val eventsService: EventsService) {
    @GetMapping("/")
    fun index(model: Model): String {
        return "index"
    }
}