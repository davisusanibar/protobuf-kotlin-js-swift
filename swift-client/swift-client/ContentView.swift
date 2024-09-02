//
//  ContentView.swift
//  swift-client
//
//  Created by David Susanibar Arce on 1/09/24.
//

import SwiftUI

struct ContentView: View {
    let protoBufTest = ProtobufTest()
    var body: some View {
        VStack {
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundStyle(.tint)
            Text("Hello, world!").onAppear{
                protoBufTest.usarModeloGenerico()
            }
        }
        .padding()
    }
}

#Preview {
    ContentView()
}
