public class Main {
    public static void main(String[] args) {
        Manager joker = new Manager("Joker", 2000, 200);
        Worker jack = new Worker("Jack", 200);
        Main main = new Main();
        main.showEmployeeAnnual(jack);
        main.showEmployeeAnnual(joker);
        main.testWork(jack);
        main.testWork(joker);
        joker.equals(jack);
    }

    public void showEmployeeAnnual(Employe e){
        System.out.println( e.getAnnual());
    }

    public void testWork(Employe e){
        if(e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof Manager){
            ((Manager) e).manage();
        }
    }
}