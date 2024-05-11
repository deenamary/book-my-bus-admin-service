package com.example.bookmybusadminservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "busroutes")
public class BusRoute {

    @Id
    @Column(name = "busid", length = 500)
    private String busId;

    @Column(name = "source", length = 20)
    private String source;

    @Column(name = "destination", length = 20)
    private String destination;

    @Column(name = "price")
    private Integer price;

    @Column(name = "totalseats")
    private Integer totalSeats;

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }
}
