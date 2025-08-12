package Generics;

import java.util.Objects;

public class PersonList {
    private final String name;
    private final int age;

    public PersonList(String name, int age)
    {
        Objects.requireNonNull(name);
        this.name = name;
        this.age = age;

    }
    public int getAge(){ return age;}
    public String getName() {return name;}

    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()) return false;
        PersonList person = (PersonList) o;
        return age == person.age && name.equals(person.name);
    }
    public int hashCode()
    {
        int result = name.hashCode();
        result = 31*result+age;
        return result;
    }
    public String toString(){
        return "Person{" + "name='"+name+'\''+", age="+age+'}';
    }
}
