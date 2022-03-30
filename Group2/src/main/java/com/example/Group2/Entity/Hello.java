package com.example.Group2.Entity;

import javax.persistence.*;

@Entity
@Table(
        name = "Hello"
)
public class Hello
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serialno;
    @Column(
            name = "sentence",
            nullable = false
    )
    private String Hello;

    public Hello(){}

    public Hello(Long serialno,String Hello)
    {
        this.serialno=serialno;
        this.Hello=Hello;
    }

    public Long getSerialno() {
        return serialno;
    }

    public void setSerialno(Long serialno) {
        this.serialno = serialno;
    }

    public String getHello() {
        return Hello;
    }

    public void setHello(String hello) {
        Hello = hello;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "serialno=" + serialno +
                ", Hello='" + Hello + '\'' +
                '}';
    }
}
