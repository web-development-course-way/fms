package com.teamc.fms.service.impl;

import com.teamc.fms.dto.SendEmailFromTemplateDto;
import com.teamc.fms.enums.KafkaTopics;
import com.teamc.fms.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailServiceImpl implements EmailService {

    private final KafkaTemplate<String, SendEmailFromTemplateDto> kafkaEmailProducerTemplate;


    @Override
    public void sendEmailFromTemplate(SendEmailFromTemplateDto sendEmailDto) {
        log.info("Push to Kafka 'email' topic to send email from Template '{}' to {}",
                sendEmailDto.getTemplate(), sendEmailDto.getTo());
        kafkaEmailProducerTemplate.send(KafkaTopics.EMAIL.getName(), sendEmailDto);
        log.info("Pushed to Kafka");
    }

}
