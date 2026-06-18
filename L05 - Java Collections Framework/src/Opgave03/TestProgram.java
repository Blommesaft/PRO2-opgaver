package Opgave03;

import java.util.TreeSet;

public class TestProgram {
    public static void main(String[] args) {

        TreeSet<Studerende> studerende1 = new TreeSet<>();
        studerende1.add(new Studerende(1,"1"));
        studerende1.add(new Studerende(3,"3"));
        studerende1.add(new Studerende(2,"2"));

        System.out.println(studerende1);


        TreeSet<Studerende> studerende2 = new TreeSet<>(new StuderendeComparator());
        studerende2.add(new Studerende(1,"3"));
        studerende2.add(new Studerende(3,"1"));
        studerende2.add(new Studerende(2,"2"));

        System.out.println(studerende2);

    }
}
