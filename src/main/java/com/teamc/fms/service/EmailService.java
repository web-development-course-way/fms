package com.teamc.fms.service;

import com.teamc.fms.dto.SendEmailFromTemplateDto;

public interface EmailService {

    /**
     * Send an email based on an email template that contains variables to be filled
     *
     * @param sendEmailDto The dto contains the sending email data, such as sender, content, ...
     */
    void sendEmailFromTemplate(SendEmailFromTemplateDto sendEmailDto);

}
