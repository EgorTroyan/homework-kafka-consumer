package ru.egortroyan.homeworkkafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.egortroyan.homeworkkafkaconsumer.config.KafkaConsumerConfig;
import ru.egortroyan.homeworkkafkaconsumer.dao.LogDao;

@Service
public class ConsumerService {

    @KafkaListener(topics = KafkaConsumerConfig.KAFKA_TOPIC)
    public void listener(LogDao log) {
        System.out.println("Receive new log: " + log);
    }
}
