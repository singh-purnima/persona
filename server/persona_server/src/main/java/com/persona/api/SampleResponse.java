package com.persona.api;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SampleResponse {

    private String message;

    public SampleResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
