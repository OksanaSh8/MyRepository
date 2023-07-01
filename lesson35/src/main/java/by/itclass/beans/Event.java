package by.itclass.beans;

public class Event {
    private int id;
    private String event;
    private String time;

    public Event() {
    }

    public Event(int id, String event, String time) {
        this.id = id;
        this.event = event;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", event='" + event + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
