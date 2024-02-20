public class Manager extends Employe{
    private double bounce;
    public Manager(String name, double salary, double bounce) {
        super(name, salary);
        this.bounce = bounce;
    }

    public void manage(){
        System.out.println("manager: " + super.getName());
    }

    public double getAnnual(){
        return super.getAnnual() + this.bounce;
    }
}
