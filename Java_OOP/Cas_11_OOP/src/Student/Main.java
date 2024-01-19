package Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> ocene = new ArrayList<>();
        ocene.add(5);
        ocene.add(4);
        ocene.add(3);
        ocene.add(5);

        Student student1 = new Student("Kristina", ocene);
        System.out.println(student1.prosek());
        System.out.println(student1.najvecaOcena());
        student1.uspeh();
    }
}
