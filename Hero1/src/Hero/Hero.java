package Hero;
import java.lang.Thread;

public class Hero {
    private String name;
    private int hitPoints;


    public Hero(String name){
        this.name = name;
        this.hitPoints = 100;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }
    public void duel(Hero hero1) throws InterruptedException {
        double random = Math.random();
        int hero1Life = hero1.getHitPoints();
        if (random >= 0.5) {
            hero1.setHitPoints(hero1Life-10);
        }else{
            this.hitPoints -= 10;
        }
        System.out.println(toString());
        System.out.println(hero1.toString());
        System.out.println();
        Thread.sleep(1000);
    }
    public void duelToTheDeath(Hero hero) throws InterruptedException {
        while(this.hitPoints > 0 && hero.getHitPoints() > 0){
            duel(hero);
        }
    }
    public String phoenixDown(Hero hero) throws InterruptedException {
        duelToTheDeath(hero);
        if (hero.getHitPoints() == 0) {
            hero.setHitPoints(100);
            return hero.getName();
        }else{
            this.hitPoints = 100;
            return this.name;
        }
    }
    public String nFightToTheDeath(Hero hero, int n) throws InterruptedException {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (phoenixDown(hero) == hero.getName()) {
                count2++;
            }else{
                count1++;
            }
        }
        return this.name + ": " + count1 + " wins" + "\n" +
                hero.getName() + ": " + count2 + " wins";
    }


    @Override
    public String toString() {
        return name + ": " + hitPoints + " hp";
    }
}


