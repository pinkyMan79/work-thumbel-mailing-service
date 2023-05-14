package one.terenin.rabbitlistener;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
@RequiredArgsConstructor
public class RabbitLister {

    @RabbitListener(containerFactory = "simpleRabbitListenerContainerFactory",
            queues = "gmail_queue", ackMode = "AUTO")
    public void gmailListener(){

    }

    @RabbitListener(containerFactory = "simpleRabbitListenerContainerFactory",
            queues = "yandex_queue", ackMode = "AUTO")
    public void yandexListener(){

    }

    @RabbitListener(containerFactory = "simpleRabbitListenerContainerFactory",
            queues = "mail_queue", ackMode = "AUTO")
    public void mailListener(){

    }

}
