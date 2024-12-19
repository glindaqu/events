package ru.glindaqu.events.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.glindaqu.events.domain.Event

interface EventRepo : JpaRepository<Event, Long>