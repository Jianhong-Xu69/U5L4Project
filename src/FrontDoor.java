public class FrontDoor
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Toby", 10);
        System.out.println(myDog);
        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
        System.out.println(myDog.getIsSleeping());

        myDog.setName("Tobias");
        myDog.setAge(11);
        myDog.setIsSleeping(true);
        System.out.println(myDog);
    }
}
