package Generics;
import java.util.Arrays;
import java.util.Comparator;

public class PersonListArrayIssue {
    public static void main(String[] args) {
        PersonList donDraper = new PersonList("Don Draper", 89);
        PersonList peggyOlson = new PersonList("Peggy Olson", 69);

        PersonList[] madMen = {donDraper, peggyOlson};
        System.out.println(madMen);// this will not print the elemnets as expected
        System.out.println(Arrays.toString(madMen));//this is the way
        PersonList bertCooper = new PersonList("Bert Cooper",100);
        madMen = add(bertCooper,madMen);
        System.out.println(Arrays.toString(madMen));
        //but there is a lot to do with arrays that is why not so preferred


    }

private static PersonList[] add(final PersonList person, PersonList[] array){
        final int length = array.length;
        array = Arrays.copyOf(array,length+1);
        array[length] = person;
        return array;
    }



}
