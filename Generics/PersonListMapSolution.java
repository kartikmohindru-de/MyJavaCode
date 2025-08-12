package Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;


public class PersonListMapSolution {
    public static void main(String[] args) {
        PersonList donDraper = new PersonList("Don Draper", 89);
        PersonList peggyOlson = new PersonList("Peggy Olson", 69);
        Map<String,PersonList> madMen = new HashMap<String,PersonList>();
        Map<String,PersonList> madMen2 = new HashMap<>(); // same as abovbe much more intuitive
        madMen.put(donDraper.getName(),donDraper);
        madMen.put(peggyOlson.getName(),peggyOlson);
        System.out.println(madMen);
        System.out.println(madMen.get("Don Drapper"));
        madMen.put("Bert Cooper",new PersonList("Bert Cooper",100));
        System.out.println(madMen);
        final Iterator<PersonList> iterator = madMen.iterator();
        while (iterator.hasNext())
        {
            final PersonList person = iterator.next();
            System.out.println(person);
        }
        for (String name : madMen.keySet()))
        {
            System.out.println(name);
        }
        for (String value : madMen.values())
        {
            System.out.println(value);
        }
        for (Map.Entry<String, PersonList> entry : madMen.entrySet())
        {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }
        System.out.println(madMen.contains(donDraper));
        System.out.println(madMen2.contains(donDraper));
    }


}
