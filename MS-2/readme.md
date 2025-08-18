Local setup 

To run the app in Intellij or any other editor, Run with local profile.
In Intellij Go to Run > Edit Configurations, Add following in Environment Variables.


`spring.profiles.active=local`

Build and Run docker image locally

Build application

`mvn clean install`

Build docker image

`docker build -d --no-cache -t ms-2:1.0 .`

Run docker with custom network in place to enable service to service communication

`docker run -d -p 8082:8080 --name=ms-2 --network=microservice-network ms-2:1.0`

Run docker compose up from root directory to avoid manual run of all the containers.

`docker compose-up`