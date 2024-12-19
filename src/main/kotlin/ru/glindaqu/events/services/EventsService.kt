package ru.glindaqu.events.services

import org.springframework.stereotype.Service
import ru.glindaqu.events.domain.Event
import ru.glindaqu.events.repo.EventRepo

@Service
class EventsService(private val eventsRepo: EventRepo) {
    fun getEvents(): List<Event> {
        return eventsRepo.findAll()
    }
    fun insertEvent(event: Event) {
        eventsRepo.save(event)
    }
}