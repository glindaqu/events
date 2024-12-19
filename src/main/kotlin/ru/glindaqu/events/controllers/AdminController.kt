package ru.glindaqu.events.controllers

import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import ru.glindaqu.events.domain.Event
import ru.glindaqu.events.services.EventsService

@Component
@Controller
@RequestMapping("/admin")
class AdminController(private val eventsService: EventsService) {
    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("events", eventsService.getEvents())
        return "admin"
    }

    @GetMapping("/addEvent")
    fun addEvent(): String {
        return "add_event.html"
    }

    @RequestMapping("/saveEvent")
    fun saveEvent(
        redirectAttributes: RedirectAttributes,
        @RequestParam("title") title: String,
        @RequestParam("description") description: String,
        @RequestParam("organizer") organizer: String,
        @RequestParam("ticket_price") ticketPrice: Int,
        @RequestParam("color") color: String,
        @RequestParam("place") place: String,
    ): String {
        eventsService.insertEvent(
            event = Event(
                title = title,
                description = description,
                place = place,
                organizer = organizer,
                ticketPrice = ticketPrice,
                color = color
            )
        )
        return "redirect:/admin/"
    }
}