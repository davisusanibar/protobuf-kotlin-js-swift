import * as analytics from './analytics_pb';

class ExtendedAnalyticsEvent extends analytics.AnalyticsEvent {
    toJSON() {
        const attributesMap = this.getAttributesMap();
        const attributesObject: { [key: string]: string } = {};
        attributesMap.forEach((value, key) => {
            attributesObject[key] = value;
        });

        return {
            eventType: this.getEventType(),
            userId: this.getUserId(),
            timestamp: this.getTimestamp(),
            attributes: attributesObject
        };
    }
}

console.log("Consumiendo modelo generico en TypeScript");

const analyticsEvent = new ExtendedAnalyticsEvent();
analyticsEvent.setEventType("tipo-evento-001");
analyticsEvent.setUserId("user-id-001");
const attributesMap = analyticsEvent.getAttributesMap();
attributesMap.set("key-a", "value-a");
attributesMap.set("key-b", "value-b");

// proto message
console.log("AnalyticsEvent Message: " + analyticsEvent);
// serializar a json
console.log("AnalyticsEvent JSON: " + JSON.stringify(analyticsEvent, null, 2));
// serializar a binario
console.log("AnalyticsEvent Binario: " + analyticsEvent.serializeBinary());

