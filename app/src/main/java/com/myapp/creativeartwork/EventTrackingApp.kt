package com.myapp.creativeartwork

data class Event(
    val eventTitle: String,
    val eventDescription: String? = null,
    val eventDayPart: EventDayPart,
    val eventDuration: Int
)

enum class EventDayPart {
    Morning, Afternoon, Evening
}

val events = mutableListOf<Event>(
    Event(
        "Study Kotlin",
        "Commit to studying Kotlin at least 15 minutes per day.",
        EventDayPart.Evening,
        15
    ),
    Event("Wake Up", "Time to get up", EventDayPart.Morning, 10),
    Event("Eat Food", null, EventDayPart.Afternoon, 20),
    Event("Pratice Compose", null, EventDayPart.Evening, 60)
)
val Event.durationOfEvent: String
    get() = if (this.eventDuration < 60) {
        "short Event"
    } else {
        "Long Event"
    }

fun main() {
    val shortEvents = events.filter { it.eventDuration < 60 }
    println("Event Less then 60 min")
    shortEvents.forEach {
        println("The Tiltle of event is:${it.eventTitle},The event Time:${it.eventDayPart} and event duration ${it.eventDuration}")
        println("Duration of event ${it.durationOfEvent}")
    }
    println()
    println("-----------------")
    val eventSummary = events.groupBy { it.eventDayPart }
    eventSummary.forEach { (EventDayPart, event) -> println("$EventDayPart:${event.size} events") }
    println()
    println("--------------------")
    println("The Last event : ${events[events.size - 1].eventTitle}")

    println("Duration of last event ${events.last().durationOfEvent}")


}