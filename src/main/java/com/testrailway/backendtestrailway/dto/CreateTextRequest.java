package com.testrailway.backendtestrailway.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateTextRequest {

    @NotBlank(message = "El texto no puede estar vacío")
    @Size(max = 1000, message = "El texto no puede exceder 1000 caracteres")
    private String text;

    public CreateTextRequest() {}

    public CreateTextRequest(String text) { this.text = text; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}
