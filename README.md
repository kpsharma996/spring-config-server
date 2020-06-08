# spring-config-server
Example of using centralized configuration server

Use below step to run project. 

1. Clone the repository
2. Build docker images
    a) Build docker image for config-server (Run this command in config-server project root dir)
        $ docker image build -t config-server .
    b) Build docker image for client-one (Run this command in client-one project root dir)
        $ docker image build -t client-one .
    c) Build docker image for client-two (Run this command in client-two project root dir)
        $ docker image build -t client-two .
3. Check images after build using below command
    $ docker image ls
    The output of this command should be list of all docker images, you should see images named 
      - config-server
      - client-one
      - client-two
4. Create a docker network
    $ docker network create spring-cloud-private-network --driver=bridge 
    Note: Here spring-cloud-private-network is the name of network, this name should match the name of network specified in docker-compose.yml file.
    
5. Run config-server
    $ docker container run --name=config-server --network=27e948a2753a -p 8888:8888 -d config-server
6. Run client one and client two services once config-server up.
    $ docker-compose up -d
    Run above command in the same directory where the compose file is.
    
    
    http://localhost:8080/server/url   (Client one)
    http://localhost:8081/server/url    (Client two)
    http://localhost:8888/client-one/development (Config server)
    
