# MusicApp

## Description
MusicApp is a web application that allows you to find information on an album, track or artist. It makes use of the massive MusicBrainz database, so you will most likely find the music you are looking for.

## Content
This repository contains an Eureka server, an edge-service and micro-services as back-end. It also contains an Angular front-end. 
The back-end is connected with an ElephantSQL-database and a MongoDB NoSQL-database.

## Installation
First, clone our repository:
```sh
git clone https://github.com/Tijl123/SchoolMusicApp.git
```

Then, simply build and run all projects. The application will be launched under port 4200 while the API runs under port 8080. Other services, such as the microservices or Eureka server, should not be publicly accessible. Swagger API documentation can be found at `http://<host>:8080/swagger-ui.html`.

## Authors
- Dario De Backer
- Tijl Ingelaere
- Tomas Marlein

## Acknowledgements
MusicBrainz and Musixmatch for the free usage of their API.

## Contributing
Since this is a school project, we do not accept contributions. Feel free to
open an issue when you run into any bugs, though!
