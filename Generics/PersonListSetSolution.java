package Generics;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class PersonListSetSolution {
    public static void main(String[] args) {
        PersonList donDraper = new PersonList("Don Draper", 89);
        PersonList peggyOlson = new PersonList("Peggy Olson", 69);
        Set<PersonList> madMen = new HashSet<PersonList>();
        Set<PersonList> madMen2 = new HashSet<>(); // same as abovbe much more intuitive
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        System.out.println(madMen);
        madMen.add(new PersonList("Bert Cooper",100));
        System.out.println(madMen);
        madMen.add(new Object()); //will throw error
        final Iterator<PersonList> iterator = madMen.iterator();
        while (iterator.hasNext())
        {
            final PersonList person = iterator.next();
            System.out.println(person);
        }
        for (PersonList person : madMen))
        {
            System.out.println(person);
        }
        System.out.println(madMen.contains(donDraper));
        System.out.println(madMen2.contains(donDraper));
    }


}
