package by.itclass.beans;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Conference {
    private int number;
    private String name;
    private String cathedra;
    private String data;
    private List<Event> event;

    public Conference(int number, String name, String cathedra, String data) {
        this.number = number;
        this.name = name;
        this.cathedra = cathedra;
        this.data = data;

    }

    public Conference(int number, String name, String cathedra, String data, List<Event> event) {
        this.number = number;
        this.name = name;
        this.cathedra = cathedra;
        this.data = data;
        this.event = event;
    }



    public void addEvent(Event events)  {
        if(this.event== null)  {
            this.event= new ArrayList<Event>();
        }
        this.event.add(events);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCathedra() {
        return cathedra;
    }

    public void setCathedra(String cathedra) {
        this.cathedra = cathedra;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", cathedra='" + cathedra + '\'' +
                ", data='" + data + '\'' +
                ", event=" + event +
                '}';
    }
}
