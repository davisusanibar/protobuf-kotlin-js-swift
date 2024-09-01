/* (C)2024 */
package org.example;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.JsonFormat;
import com.google.protobuf.util.Timestamps;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import org.example.analytics.Analytics;

public class App {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        System.out.println("Consumiendo modelo generico en Java");
        final Analytics.AnalyticsEvent.Builder builder = Analytics.AnalyticsEvent.newBuilder();
        final Instant now = Instant.now();
        final Timestamp timestamp =
                Timestamp.newBuilder()
                        .setSeconds(now.getEpochSecond())
                        .setNanos(now.getNano())
                        .build();
        Map attributes = new HashMap();
        attributes.put("key-a", "value-a");
        attributes.put("key-b", "value-b");
        builder.setEventType("tipo-evento-001")
                .setUserId("user-id-001")
                .setTimestamp(Timestamps.toString(timestamp))
                .putAllAttributes(attributes);

        final Analytics.AnalyticsEvent analyticsEvent = builder.build();

        // proto message
        System.out.println("AnalyticsEvent Message: \n" + analyticsEvent);
        // serializar a json
        System.out.println("AnalyticsEvent JSON: \n" + JsonFormat.printer().print(analyticsEvent));
        // serializar a binario
        System.out.println("AnalyticsEvent Binario: \n" + analyticsEvent.toByteArray());
    }
}
