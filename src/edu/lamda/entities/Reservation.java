/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lamda.entities;

/**
 *
 * @author arfaoui
 */
public class Reservation {
    private int id;
    private int event;
    private int client;
    
    
    public Reservation(){}

    public Reservation(int id, int event, int client) {
        this.id = id;
        this.event = event;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", event=" + event + ", client=" + client + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservation other = (Reservation) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.event != other.event) {
            return false;
        }
        if (this.client != other.client) {
            return false;
        }
        return true;
    }
    
    
    
}
