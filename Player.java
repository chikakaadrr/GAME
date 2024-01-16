
package game;


public class Player {
    String name;
    int speed;
    int healthPoin;
    int armor;
    int damage;
    
     void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
     }
        
     boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
     }
     void defance(){
         System.out.println(name +"is armor...");
         System.out.println("aarmor: "+ armor);
     }
     void attack(String a){
         System.out.println(name +"is attack... ");
         System.out.println("damage: "+ damage);
     }
}
