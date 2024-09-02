//
//  ProtobufTest.swift
//  swift-client
//
//  Created by System Administrator on 9/2/24.
//

import Foundation

class ProtobufTest {
    
    func usarModeloGenerico() {
        var analyticsEvent = Analytics_AnalyticsEvent()
        analyticsEvent.eventType = "tipo-evento-001"
        analyticsEvent.userID = "user-id-001"
        print("Consumiendo modelo generico en Java")
        // proto message
        print("AnalyticsEvent Message: \(analyticsEvent)")
        do {
            let jsonString = try analyticsEvent.jsonString()
            let serializedData = try analyticsEvent.serializedData()
            // serializar a json
            print("AnalyticsEvent JSON: \(jsonString)");
            // serializar a binario
            print("AnalyticsEvent Binario: \(serializedData)");
        } catch {
            print("Error conversion: \(error)")
        }
    }
}



