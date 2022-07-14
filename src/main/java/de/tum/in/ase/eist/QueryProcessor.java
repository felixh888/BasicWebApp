package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "lemon";
        } else if (query.contains("largest")) {
            String ex = query.substring(48,63);
            String[] array = ex.split(", ");
            int max = Integer.MIN_VALUE, maxIndex = 0;

            for (int i = 0; i < array.length; i++) {
                if (Integer.parseInt(array[i]) > max) {
                    max = Integer.parseInt(array[i]);
                    maxIndex = i;
                }
            }
            return Integer.toString(maxIndex);
        } /*else if (query.contains("plus")) {
            String[] array = query.split(" plus ");
            int no1 = Arrays.stream(array).sorted();*/
        } else { // TODO extend the programm here
            return "";
        }
    }
}
