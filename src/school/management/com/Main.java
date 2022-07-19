package school.management.com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teachers Lizzy = new Teachers (1, "lizzy", 500);
        Teachers melissa = new Teachers(2, "melissa", 700);
        Teachers Steven = new Teachers(3, "Steven", 600);

        List<Teachers> teachersList = new ArrayList<>();
        teachersList.add(Lizzy);
        teachersList.add(melissa);
        teachersList.add(Steven);



        students king = new students(1, "king", 4);
        students matthew = new students(2, "matthew lords", 12);
        students Faustina = new students(3, "Nancy", 7);
        List<students> studentsList = new ArrayList<>();

        studentsList.add(king);
        studentsList.add(matthew);
        studentsList.add(Faustina);

        school GDSS = new school(teachersList, studentsList);
        king.payFees(5000);
        matthew.payFees(6000);
        System.out.println("GDSS has earned $ " + GDSS.getTotalMoneyEarned());

        System.out.println("------MAKING SCHOOL PAY SALARY-----");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("GDss has spent for salary  to " + Lizzy.getName ()
        + " and now has " + GDSS.getTotalMoneyEarned());

        System.out.println(king);

    }
}