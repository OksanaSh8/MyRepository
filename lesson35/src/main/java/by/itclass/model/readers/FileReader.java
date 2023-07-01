package by.itclass.model.readers;

import by.itclass.beans.Event;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FileReader {

    public String read(String filename) throws FileNotFoundException {
        StringBuilder stringBuilder=new StringBuilder();
        try (Scanner sc=new Scanner(new FileInputStream(filename))){
            while (sc.hasNextLine()){
                stringBuilder.append(sc.nextLine()+"\n");
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
        return stringBuilder.toString();
    }

    public List<Event> read(InputStream in) {
        final String DELIMETR=";";
        List<Event> list=null;


        try (Scanner sc=new Scanner(in)){
            list=new ArrayList<>();
            Event event=null;
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                String[] value=line.split(DELIMETR);
                int id=Integer.parseInt(value[0]);
                list.add(new Event(id, value[1],value[2] ));

            }

        }
        return list;
    }
}
