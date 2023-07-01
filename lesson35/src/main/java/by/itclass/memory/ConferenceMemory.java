package by.itclass.memory;

import by.itclass.beans.Conference;
import by.itclass.beans.Event;

import java.util.HashMap;
import java.util.Map;

public class ConferenceMemory {
    public static Map<String, Conference> conferences;

    static {

        Conference conference1 = new Conference(1, "GCSW", "psychology", "08/09/2022");
        conference1.addEvent(new Event(1, "Arrival", "8:00"));
        conference1.addEvent(new Event(2, "Opening", "10:00"));
        conference1.addEvent(new Event(3, "Plenary session", "10:15"));
        conference1.addEvent(new Event(4, "Party", "18:00"));

        Conference conference2 = new Conference(2, "Algebra readings", "mathematics", "11/09/2022");
        conference2.addEvent(new Event(1, "Arrival", "8:05"));
        conference2.addEvent(new Event(2, "Opening", "11:00"));
        conference2.addEvent(new Event(3, "Plenary session", "10:15"));
        conference2.addEvent(new Event(4, "Party", "18:00"));

        Conference conference3 = new Conference(3, "Vajennaja prosa Bykava", "literature", "19/09/2022");
        conference3.addEvent(new Event(1, "Arrival", "8:10"));
        conference3.addEvent(new Event(2, "Opening", "10:30"));
        conference3.addEvent(new Event(3, "Plenary session", "10:15"));
        conference3.addEvent(new Event(4, "Party", "18:00"));

        conferences = new HashMap<>();
        conferences.put("GCSW", conference1);
        conferences.put("Algebra readings", conference2);
        conferences.put("Vajennaja prosa Bykava", conference3);
    }


    public static Conference getConference(String name) {
        Conference findValue =conferences.get(name);
        return findValue;
    }

}
