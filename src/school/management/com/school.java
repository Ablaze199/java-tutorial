package school.management.com;

import java.util.List;

/*
the school can have many teachers, many students,
implement teachers and student using an ArrayList <List>
 */
public class school {
    private List<Teachers> Teachers;
    private List<students>  Students;
    private static  int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     *
     * @param teacher list of teachers in the school
     * @param student list of teacher in the school
     */

    public school(List<Teachers> teacher, List<students> student) {
        this.Teachers = teacher;
        this.Students = student;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /*
    returns the list of teachers in the school
     */
    public List<Teachers> getTeachers() {
        return Teachers;
    }
    /*t
    adds a teacher  to the school
     */

    public void addTeacher(Teachers teacher) {
        Teachers.add(teacher);
    }

    public List<students> getStudents() {
        return Students;
    }

    /**
     * add a students to the school
     * @param students the students to be added
     */
    public void addStudents(students students) {
        Students.add (students);
    }


    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * addds the total money by the school
     * @param MoneyEarned
     */

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the total money that is spent by the school which iis the salary
     * giving by the school to its teachers
     * @param totalMoneySpent
     */
    public  static void updateTotalMoneySpent(int moneySpent) {
       totalMoneySpent-=moneySpent;
    }
}
