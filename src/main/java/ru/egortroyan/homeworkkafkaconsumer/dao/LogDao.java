package ru.egortroyan.homeworkkafkaconsumer.dao;

import lombok.*;
import ru.egortroyan.homeworkkafkaconsumer.service.LogLevel;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class LogDao {
    private LocalDateTime timeStamp;
    private LogLevel level;
    private String message;
}
