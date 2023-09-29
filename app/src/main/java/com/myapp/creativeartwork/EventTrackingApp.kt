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
val event = mutableListOf<Event>(
    Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", EventDayPart.Evening, 15),
    Event("Wake Up", "Time to get up", EventDayPart.Morning, 10),
    Event("Eat Food", null, EventDayPart.Afternoon, 20),
    Event("Pratice Compose", null, EventDayPart.Evening, 60)
)


fun main() {
val shortEvent = event.filter { it.eventDuration<60 }
println("Event Less then 60 min")
    shortEvent.forEach { println("The Tiltle of event is:${it.eventTitle},The event Time:${it.eventDayPart} and event duration ${it.eventDuration}") }

}