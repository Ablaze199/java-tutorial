package school.management.com;

/*
this class is responsible for keeping the track of teachers id,salary and name.
 */
public class Teachers {
    private int id;
    private String name;
    private int salary;
    private  int salaryEarned;

    /**
     * creates a new teacher object
     * @param id id of the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teachers(int id, String name, int salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * adds total salary earned
     * removes from the total money earned to the school
     * @param salary
     */
  public void receiveSalary(int salary) {
        salaryEarned+=salary;
        school.updateTotalMoneySpent(salary);
  }

    @Override
    public String toString()
        return "students of the teacher" + name
    +"to"
    }
}
