0. Build the application
1. Setup MongoDB server and update the application.properties accordingly, if needed

2. Start the application
java -jar cmad-user-service.jar

3. Use a REST client like postman or CURL and make POST requests with body that looks like
{"uid":"admin", "devices":["192.04.93.122", "192.165.3.12"]}
to http://localhost:8081/user

Remember the uid and devices.