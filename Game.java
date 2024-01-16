
package game;


public class Game {

    
    public static void main(String[] args) {
         Player hero = new Player();
         Player enemy = new Player();
        
        
        hero.name = "zeya ";
        hero.speed = 78;
        hero.healthPoin = 100;
        hero.damage =50 ;
        hero.armor = 39;
        
        
        enemy.name = "nisa";
        enemy.speed = 78;
        enemy.healthPoin = 100;
        enemy.damage= 10;
        enemy.armor= 5;
        
        hero.run();
        hero.attack(enemy.name);

        if(hero.isDead()){
            System.out.println("Game Over!");
        }

    }
    
}
