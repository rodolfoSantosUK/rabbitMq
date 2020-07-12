
* Installing rabbitMQ:


    docker pull rabbitmq:3-management
    docker run -d -p 15672:15672 -p 5672:5672 --name rabbit-test-for-medium rabbitmq:3-management

    Acessar: http://localhost:15672/

* Removendo Container

    docker container ls -a
    docker container rm 64c2b9787c47

 spring:
    rabbitmq:
        host: localhost
        port: 15672
        username: guest
        password: guest

*