public class Worker extends Employe{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("worker: " + super.getName());
    }

    public double getAnnual(){
        return super.getAnnual();
    }
}
