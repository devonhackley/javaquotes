# javaquotes
This application will go to the star wars quote api and grab a single quote to display to the user. It also reads in a JSON file of quotes and adds the newly grabbed quote to the list. If there was an issue, then the application will grab a quote from the JSON file.

## Architecture

#### Main Files
  * [App.java](./src/main/java/javaquotes/App.java)
  * [Quote.java](./src/main/java/javaquotes/Quote.java)
  * [QuoteReader.java](./src/main/java/javaquotes/QuoteReader.java)
  * [Quotes.java](./src/main/java/javaquotes/Quotes.java)
  
#### Test Files
  * [AppTest.java](./src/test/java/javaquotes/App.java)
  * [QuoteTest.java](./src/test/java/javaquotes/QuoteTest.java)
  * [QuoteReaderTest.java](./src/test/java/javaquotes/QuoteReaderTest.java)
  * [QuotesTest.java](./src/test/java/javaquotes/QuotesTest.java)

## Usage
-`git clone repo`
- Open in editor, navigate to: the [build.gradle](./build.gradle) file. 
  - If not already there, add `implementation 'com.google.code.gson:gson:2.8.5'`, to the dependencies object save and close. 
- run in terminal `./gradlew run `
- Should receive one quote



