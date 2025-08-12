package Generics;
import java.util.Comparator

public class ReverseComparator<T> implements Comparator<T> {
    private final Comparator<T> delegateComparator;

    public ReverseComparator(final Comparator<T> delegateComparator){
        this.delegateComparator = delegateComparator; // with this we can now create reverse order or comparisson of any comparator
    }
    @Override
    public int compare(T left, T right) {
        return -1*delegateComparator.compare(left,right);
    }
}
