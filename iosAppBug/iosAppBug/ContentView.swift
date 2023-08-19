import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()

	var body: some View {
        VStack{
            Text(greet)
            Button(action: {
                Greeting().speakCommon(string: "Hello IOs Apps")
            }, label: {
                Text("Speak")
            })
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
