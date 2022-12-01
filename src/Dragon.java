public class Dragon {

    private int health;
    private int strength;
    private int level;
    private boolean isDead;
    private int exp;

    public Dragon () {
        health = 100;
        strength = 1;
        level = 1;
        exp = 0;
    }

    public void takeDamage(int damage) {
        if (!isDead) {
            health -= damage;
            if (health <= 0){
                health = 0;
                System.out.println("The dragon takes " + damage + " damage and now has " + health + " health");
                System.out.println("FAA!");
            } else {
                System.out.println("The dragon takes " + damage + " damage and now has " + health + " health");
            }
        } else {
            System.out.println("Stop stop its already dead!");
        }
    }

    public int attack(){
        System.out.println("The dragon attacks for " + (strength * level) + " hitpoints!");
        exp += (strength * level);
        if (exp >= 50) {
            level++;
            System.out.println("\nThe Dragon has reached level " + level + "!");
            exp = 0;
        }
        return (strength * level);
    }

    public void powerUp(int i){
        if (i == 1){
            health *= 2;
            System.out.println("The Dragon's health has increased to " + health + "!");
        } else if (i == 2){
            strength *= 2;
            System.out.println("The Dragon's strength has increased to " + strength + "!");
        }
    }
}
