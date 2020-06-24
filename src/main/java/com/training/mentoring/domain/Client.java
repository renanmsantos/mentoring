package com.training.mentoring.domain;

import com.training.mentoring.resources.ClientRequest;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CLIENT")
public class Client {

    @Id
    @Column(name = "idt_client")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "str_name")
    private String name;

    @Column(name = "num_age")
    private Integer age;

    @Column(name = "dat_creation")
    private LocalDateTime creationDate;

    @Column(name = "dat_last_update")
    private LocalDateTime lastUpdateDate;

    public Client(){ }

    public Client( ClientRequest clientRequest ){
        this.setName(clientRequest.getName());
        this.setAge(clientRequest.getAge());
        this.setCreationDate();
        this.setLastUpdateDate();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCreationDate() {
        this.creationDate = LocalDateTime.now();
    }

    public void setLastUpdateDate(){
        this.lastUpdateDate = LocalDateTime.now();
    }


}
