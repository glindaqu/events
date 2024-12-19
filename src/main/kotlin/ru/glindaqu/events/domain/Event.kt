package ru.glindaqu.events.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Event(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int? = null,
    val place: String = "",
    val title: String = "",
    val ticketPrice: Int = -1,
    val organizer: String = "",
    val description: String = ""
)