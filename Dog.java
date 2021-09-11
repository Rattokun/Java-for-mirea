package pr1.first.task.pr1;

public class Dog {
    private String name;
    private int age;
    private boolean hunger;
    public Dog(String n, int a, boolean h)
    {
        name = n;
        age = a;
        hunger = h;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }

    public void setName(String Name)
    {
        this.name = name;
    }
    public String getName(String name)
    {
        return name;
    }

    public void feed(boolean h)
    {
        this.hunger = h;
    }
    public boolean checkHunger()
    {
        return hunger;
    }

    public String Bark()
    {
        return (this.name+" say 'Bork'");
    }

    public String toString()
    {
        if (hunger == true) {
            return this.name + " is hungry he is" + this.age + " years old, and i guess i'm in danger";
        }
        else
            return this.name+" is very quiet, he's age is"+this.age;
    }

}
