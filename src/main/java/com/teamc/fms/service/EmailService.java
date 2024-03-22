package com.teamc.fms.service;

import com.teamc.fms.dto.SendEmailFromTemplateDto;

public interface EmailService {

    void sendEmailFromTemplate(SendEmailFromTemplateDto sendEmailDto);

}
