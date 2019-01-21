package it.sevenbits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        LinkedList<Account> accounts = new LinkedList<>(Arrays.asList(
                new Account(-100), new Account(200), new Account(300)));
        ListOperator listOperator= new ListOperator();
        System.out.println(listOperator.max(numbers, 0, 9));
        System.out.println(listOperator.max(accounts, 0, 1));
        listOperator.changeElementsPosition(numbers, 0, 9);
        listOperator.changeElementsPosition(accounts, 0, 2);
        System.out.println(numbers.toString());
        System.out.println(accounts.toString());
        ThreadExecutor threadExecutor = new ThreadExecutor();
        threadExecutor.showAccountFilling(1000);
    }
}
