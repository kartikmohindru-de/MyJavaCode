package Generics;

import java.util.Comparator;

public class AgeComparator implements Comparator<PersonList>{
    @Override
    public int compare(final PersonList left, final PersonList right) {
        return Integer.compare(left.getAge(),right.getAge());
    }


}
