package com.backend.evenhi.evenhi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;

@Entity(name = "event")
@Setter
@Getter
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Date data;
    private String typeEvent;
    private String ownerUser;

}
