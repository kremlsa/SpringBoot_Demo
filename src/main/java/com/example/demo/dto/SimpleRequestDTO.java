package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import javax.validation.constraints.NotEmpty;

public class SimpleRequestDTO {
    @NotEmpty
    public String name;

    public SimpleRequestDTO() {
    }

    public SimpleRequestDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
