package Generics;
import java.util.*;

public class PersonListListSolution {
    public static void main(String[] args) {
        PersonList donDraper = new PersonList("Don Draper", 89);
        PersonList peggyOlson = new PersonList("Peggy Olson", 69);

        List<PersonList> madMen = new ArrayList<PersonList>();
        List<PersonList> madMen2 = new ArrayList<>(); // same as abovbe much more intuitive
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        System.out.println(madMen);
        madMen.add(new PersonList("Bert Cooper",100));
        System.out.println(madMen);
        //madMen.add(new Object()); //will throw error
        System.out.println(madMen.size());
        System.out.println(madMen.get(2));
        final PersonList person = madMen.get(2);
        System.out.println(person);
        final Iterator<PersonList> iterator = madMen.iterator();
        for (int i = 0; i<madMen.size();i++){
            final PersonList personsss = madMen.get(2);
            System.out.println(personsss);
        }
        while (iterator.hasNext())
        {
            final PersonList personss = iterator.next();
            System.out.println(personss);
        }
        for (PersonList persons : madMen)
        {
            System.out.println(persons);
        }
        Collections.sort(madMen, new AgeComparator()); //makes it type safe
        System.out.println(madMen);
        //annonymus class example can be used if the code needs to be used at one palce
        Collections.sort(madMen, new Comparator<PersonList>(){
            @Override
            public int compare(PersonList left, PersonList right) {
                return Integer.compare(left.getAge(),right.getAge());
            }
        }); //makes it type safe
        //creating comparators on the fly
        Comparator Ex =  new Comparator<PersonList>(){
            @Override
            public int compare(PersonList left, PersonList right) {
                return Integer.compare(left.getAge(),right.getAge());
            }
        };
        Collections.sort(madMen, new ReverseComparator<PersonList>(new AgeComparator()));
        System.out.println(madMen);
        madMen.sort(Comparator.comparing(PersonList::getName));
        System.out.println(madMen);
        madMen.sort(new ReverseComparator<PersonList>(Comparator.comparing(PersonList::getName)));
        System.out.println(madMen);
        SortedPairsTypeBounds<Integer> pair = new SortedPairsTypeBounds<>(1,2);
        System.out.print(pair.getFirst()); //1
        System.out.print(pair.getSecond()); //2

        //final PersonList youngestCastMem =(PersonList) min(madMen, new AgeComparator()); no need to cast since generic is mentioned  so it will take the type
        final PersonList youngestCastMem = min(madMen, new AgeComparator());
        /*
        Throw run time error because of type mismatch as we have implemented generics

        final PersonList youngestCastMem1 = min(madMen, new Comparator(){
            public int compare(final PersonList o1, final PersonList o2){
                return 0;
            }

        });
            */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(min(numbers,Integer::compare));// as it is having same signature type as comparator






    }
    public static <T> T min(List<T> values , Comparator<T> comparator){ //generic in methods
        if (values.isEmpty()) {
            throw  new IllegalArgumentException("List is Empty");
        }
        T lowestElement = values.get(0);
        for (int i = 1 ; i < values.size(); i++){
            final T element = values.get(i);
            if (comparator.compare(element,lowestElement)<0){
                lowestElement = element;
            }
        }
    }

}

