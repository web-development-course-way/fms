package com.teamc.fms.dto;

import com.teamc.fms.enums.EmailTemplate;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class SendEmailFromTemplateDto {

    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private String subject;
    private EmailTemplate template;
    private Map<String, Object> variables;

}
