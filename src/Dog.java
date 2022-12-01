public class Dog
{
    private String name;
    private int age;
    private boolean isSleeping;

    public Dog(String dogName, int dogAge)
    {
        name = dogName;
        age = dogAge;
        isSleeping = false;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }



    public boolean getIsSleeping()
    {
        return isSleeping;
    }

    public void setIsSleeping(boolean newValue)
    {
        isSleeping = newValue;
    }

    public String toString()
    {
        return "name = " + name + ", age = " + age + ", isSleeping = " + isSleeping;
    }
}
