# spring-producer
Project used to study RabbitMQ

To run the project:

- Install docker

- Download and run RabbitMQ: 
docker run -d -p 15672:15672 -p 5672:5672 --name rabbitmq rabbitmq:3-management

- Access http://localhost:15672/ to see the instalation was successful (username: guest, password: guest)

- Run SpringProducerApplication class

- Send a post request to: localhost:8082/send

```json
{
    "text":"Test message"
}
```

- Access http://localhost:15672/ and checks if exhange and queue was created and the message was sended to the queue 
