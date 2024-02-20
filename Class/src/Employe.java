public class Employe {
    private String name;
    private double salary;

     public Employe(String name, double salary){
         this.name = name;
         this.salary = salary;
     }

     public double getAnnual(){
         return 12 * salary;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
