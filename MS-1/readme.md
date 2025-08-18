Local setup

To run the app in Intellij or any other editor, Run with local profile.
In Intellij Go to Run > Edit Configurations, Add following in Environment Variables.


`spring.profiles.active=local`

Build and Run docker image locally

Build application

`mvn clean install`

Build docker image

`docker build --no-cache -t ms-1:1.0 .`

Run docker with custom network in place to enable service to service communication


`docker run -d -p 8083:8080 --name=ms-1 --network=microservice-network --env MS-2-HOST=http://ms-2:8080 ms-1:1.0`