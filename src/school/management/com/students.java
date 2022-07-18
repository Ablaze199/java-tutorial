package school.management.com;


public class students {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    public students(int id, String name,int grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    public void getGrades() {
        this.grade=grade;
    }

    public void updateFeesPaid(int fees) {
        feesPaid+=fees;
    }
      /*
      return id of the students
       */
    public int getId() {
        return id;
    }
           /*
           return name of the students
            */
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

}
