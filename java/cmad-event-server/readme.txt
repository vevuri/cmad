0. Build the application
1. Setup MySQL server and update the application.properties accordingly, if needed
2. Create a database by name 'events' in the MySQL

3. Start the application
java -jar event-service.jar

3. Use a REST client like postman or CURL and make POST requests with body that looks like
{"date":"2019-07-10T01:28:20.209Z", "level":4, "description":"aldksflasdkfj", "ip":"192.04.93.122"}
to http://localhost:8080/event

4. User a REST client or CURL and make a GET request to http://localhost:8080/events to view all the events