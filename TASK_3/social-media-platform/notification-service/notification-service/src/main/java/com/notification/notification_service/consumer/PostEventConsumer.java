package com.notification.notification_service.consumer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
@Component
public class PostEventConsumer {
    @RabbitListener(queues = "post_created_queue")
    public void receiveMessage(String message) {

        System.out.println("🔔 Notification received: " + message);

    }
}
