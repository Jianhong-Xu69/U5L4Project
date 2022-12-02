public class FrontDoor
{
    public static void main(String[] args)
    {
        Dragon dragon = new Dragon();
        System.out.println(dragon);
        int attackAmt = dragon.attack();
        dragon.takeDamage(20);
        dragon.powerUp(1);
        dragon.powerUp(2);
        dragon.powerUp(2);
        dragon.powerUp(2);
        int attackAmt2 = dragon.attack();
        System.out.println(dragon);
        dragon.takeDamage(70);
        dragon.powerUp(2);
        int attackAmt3 = dragon.attack();
        dragon.powerUp(2);
        System.out.println(dragon);
        int attackAmt4 = dragon.attack();
        System.out.println(dragon);
        dragon.takeDamage(65);
        dragon.takeDamage(40);
        dragon.takeDamage(10);
        System.out.println(dragon);
    }
}
