# Proyecto de Modelos Genéricos usando Protocol Buffers para Gestión Coordinada Diferentes Tech Stack

Este proyecto utiliza Protocol Buffers (protobuf) para definir modelos genéricos y poder generar el código correspondiente en varios lenguajes: Java, Kotlin, JavaScript y TypeScript.

# Configuración del Proyecto

## Descargar proyecto
```shell
$ git clone https://github.com/davisusanibar/protobuf-kotlin-js-swift.git
```

## Dependencias/Software:

### Dependencia necesitada por los diferentes lenaguajes

```shell
brew install protobuf
```

### Dependencia para Generar Modelos para Java & Kotlin

```shell
brew install protobuf
```

### Dependencia para Generar Modelos para Swift

```shell
brew install swift-protobuf
```

### Dependencia para Generar Modelos para TypeScript

```shell
npm install -g ts-protoc-gen
```

### Dependencia para Generar Modelos para JavaScript

```shell
npm install -g protoc-gen-js
```

## Generar modelos para los diferentes stack tecnológicos
```shell
$ mvn clean install
$ tree target/generated-sources/protobuf/                                                                                      ✔  at 01:01:03 AM  
├── java
│   └── analytics
│       └── Analytics.java
├── js
│   └── analytics_pb.js
├── kotlin
│   └── analytics
│       ├── AnalyticsEventKt.kt
│       └── AnalyticsKt.kt
├── swift
│   └── analytics.pb.swift
└── ts
    └── analytics_pb.d.ts
```

# Uso del modelo .proto desde diferentes Stack Tecnológico

## Cliente Java

### Linter Codigo
```bash
$ cd protobuf-kotlin-js-swift/java-client
$ mvn spotless:check
$ mvn spotless:apply
...
[INFO] Spotless.Java is keeping 2 files clean - 0 were changed to be clean, 1 were already clean, 1 were skipped because caching determined they were already clean
...
```

### Ejemplo:

```java
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
        System.out.println("Creando modelo generico en Java");
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

        System.out.println("com.google.protobuf.GeneratedMessage: \n" + analyticsEvent);
        System.out.println("----------------------");
        // serializar a json
        System.out.println("JSON format: \n" + JsonFormat.printer().print(analyticsEvent));
        // serializar a binario
        System.out.println("Protobuf format: \n" + analyticsEvent.toByteArray());
    }
}

Salida:

com.google.protobuf.GeneratedMessage:
event_type: "tipo-evento-001"
user_id: "user-id-001"
timestamp: "2024-09-01T05:55:36.289177Z"
attributes {
    key: "key-a"
    value: "value-a"
}
attributes {
    key: "key-b"
    value: "value-b"
}

----------------------

JSON format:
        {
        "eventType": "tipo-evento-001",
        "userId": "user-id-001",
        "timestamp": "2024-09-01T05:55:36.289177Z",
        "attributes": {
        "key-a": "value-a",
        "key-b": "value-b"
        }
        }

----------------------

Protobuf format:
        [B@587e5365
```

## Cliente Kotlin
```kotlin

```

## Cliente JavaScript
```javascript

```
## Cliente TypeScript
```typescript

```

## Cliente Swift
```java

```
