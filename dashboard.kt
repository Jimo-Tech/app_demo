class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("Hello world!")
             Text("Hello world!") // second time
              Text("Hello world!") // second time
        }
    }
}

@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name!")
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard("Android")
}
  
