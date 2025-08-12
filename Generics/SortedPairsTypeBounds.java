package Generics;

public class SortedPairsTypeBounds <T extends Comparable<T>>{ //meaning T class extends comparable it is an example of type bound
    /*
    That is sortedPairsTypeBounds can have objects of class comparable and its subclasses and gives error on other objects
    It can be multi[le bound i.e. extends A & B
    Sometimes we don’t want the whole class to be parameterized. In that case, we can create a Java generics method.
    Since the constructor is a special kind of method, we can use generics type in constructors too.
    Suppose we want to restrict the type of objects that can be used in the parameterized type.
    For example, in a method that compares two objects and we want to make sure that the accepted objects are Comparables.
    The invocation of these methods is similar to the unbounded method except that if we will try to use any class that is not Comparable, it will throw compile time error.
    <T extends Comparable> can cause issue in the compare to fucntion call if we use a mismatch of data types there to mitigate this, we use Comparable<T> to make sure a T when extends
    comaprable still gets compared among themselves

     */
    private final T first;
    private final T second;
    public SortedPairsTypeBounds(T left, T right){
        if (left.compareTo(right) < 0) //left is smaller than right
        {
            first = left;
            second = right;
        }
        else
        {
            first = right;
            second = left;
        }

    }
    public T getSecond() { return second;}
    public T getFirst() { return first;}
}
