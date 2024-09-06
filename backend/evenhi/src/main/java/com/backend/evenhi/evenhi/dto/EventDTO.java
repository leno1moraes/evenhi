package com.backend.evenhi.evenhi.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EventDTO {
    private String title;
    private Date data;
    private String typeEvent;
}
