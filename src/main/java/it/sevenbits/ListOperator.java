package it.sevenbits;

import java.util.List;

public class ListOperator {

    public <E extends Comparable<E>> E max(List<E> list, int startIndex, int stopIndex) {
        E maxElement = list.get(startIndex++);
        for (int i = startIndex; i <= stopIndex && i < list.size(); i++) {
            E tmp = list.get(i);
            if (tmp.compareTo(maxElement) > 0) {
                maxElement = tmp;
            }
        }
        return maxElement;
    }

    public <E extends Comparable<E>> boolean changeElementsPosition(List<E> list, int firstIndex, int secondIndex) {
        if(!(firstIndex < list.size() &&  secondIndex< list.size())){
            return false;
        }
        E firstElement = list.get(firstIndex);
        E secondElement = list.get(secondIndex);
        list.remove(firstElement);
        list.remove(secondElement);
        list.add(firstIndex, secondElement);
        list.add(secondIndex, firstElement);
        return true;
    }
}
