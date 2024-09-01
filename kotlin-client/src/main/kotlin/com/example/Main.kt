package com.example

import analytics.Analytics
import com.google.protobuf.util.JsonFormat

fun main() {
    println("Consumiendo modelo generico en Java")

    val analyticsEvent = Analytics.AnalyticsEvent.newBuilder()
        .setEventType("tipo-evento-001")
        .setUserId("user-id-001")
        .setTimestamp("2023-10-23T10:15:30Z")
        .putAllAttributes(mapOf("key-a" to "value-a", "key-b" to "value-b"))
        .build()

    // proto message
    println("AnalyticsEvent Message: \n" + analyticsEvent);
    // serializar a json
    println("AnalyticsEvent JSON: \n" + JsonFormat.printer().print(analyticsEvent));
    // serializar a binario
    println("AnalyticsEvent Binario: \n" + analyticsEvent.toByteArray())
}