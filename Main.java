import java.io.IOException;
import java.lang.*;
import java.util.Scanner;

//Naveen Dhanwar
//31 oct 2022
/*End module exam of OOPS
31-10-2022*/

class Food
{
    int calories, fat, protein, carb, sugar;
    void getCalories()
    {
        System.out.print("\nCalories " + calories);
    }

    int getFood()
    {
        return (fat + protein + carb);
    }

}

abstract class VegetarianFood extends Food
{
    int iron;

    void getIron()
    {
        System.out.print("\n" + iron);
    }

    abstract void isLeafy();
    abstract void isWatery();

}

class Fruit extends VegetarianFood
{
    String dry, water;
    void isDry()
    {
        System.out.print("\n" + dry);
    }

    void isWatery()
    {
        System.out.print("\n" + water);
    }

    void isLeafy()
    {
        System.out.print("Not Leafy");
    }

}

class Vegetable extends VegetarianFood
{
    String leafy, water;

    void isLeafy()
    {
        System.out.print(leafy);
    }
    void isWatery()
    {
        System.out.print(water);
    }

}

class NonVegetarianFood extends Food
{

}

class Fish extends NonVegetarianFood
{

}

class Chicken extends NonVegetarianFood
{

}

class Input
{

    void mangodb()
    {
        Fruit mango = new Fruit();
        mango.calories = 42;
        mango.fat = 6;
        mango.protein = 10;
        mango.carb = 20;
        mango.water = "Has water 78%";
        mango.dry = "Not dry fruit";
        System.out.print("\nDescription about Calories of Mango");
        mango.getCalories();
        mango.isWatery();
        mango.isDry();
        mango.isLeafy();
        System.out.print("\nFat + Protein + carb: " + mango.getFood());
        System.out.print('\n');
    }
        
    void potatodb()
    {
        Vegetable potato = new Vegetable();
        potato.calories = 45;
        potato.fat = 25;
        potato.protein = 43;
        potato.carb = 62;
        potato.iron = 42;
        potato.water = "Has water 34%";
        potato.leafy = "Not leafy";
        System.out.print("\nDescription about Calories of Potato");
        potato.getCalories();
        potato.getIron();
        potato.isLeafy();
        potato.isWatery();
        System.out.print("\n" + potato.getFood());
        System.out.print('\n'); 
    }

    void fishdb()
    {
        Fish shark = new Fish();
        shark.calories = 67;
        shark.fat = 701;
        shark.protein = 37;
        shark.carb = 67;
        System.out.print("\nDescription about Calories of Shark");
        shark.getCalories();
        System.out.print("\nFat + Protein + carb: " + shark.getFood());
        System.out.print('\n');
    }

    void chickendb()
    {
        Chicken kadakNath = new Chicken();
        kadakNath.calories = 17;
        kadakNath.fat = 81;
        kadakNath.protein = 432;
        kadakNath.carb = 97;
        System.out.print("\nDescription about Calories of Kadaknath");
        kadakNath.getCalories();
        System.out.print("\n" + kadakNath.getFood());
        System.out.print('\n');

    }
}

class Fetch
{
    public void error()
    {
        System.out.print('\n');
        System.out.print("Wrong Choice, Hence you kicked out of Program.");
        System.exit(0);
    }

    static Scanner sc = new Scanner(System.in);
    void wel()
    {
        System.out.print('\n');
        System.out.print("\t\t\t\tWelcome to the Food Cart\n\n");
        System.out.print("Are You hungary? y/n: ");
        char choice = sc.next().charAt(0);

        switch(choice)
        {
            case 'y': wel3();
            break;

            case 'n': System.exit(0);
            break;

            default: error();
            break;
        }
    }

    void wel3()
    {
        System.out.print('\n');
        System.out.print("Veg or Nonveg?");
        System.out.print('\n');
        System.out.print('\n');
        System.out.print("Enter 1 for Veg");
        System.out.print('\n');
        System.out.print("Enter 2 for Nonveg?");
        System.out.print('\n');
        wel2();
    }
        
    void wel2()
    {
        /*System.out.print("Veg or Nonveg?");
        System.out.print('\n');
        System.out.print('\n');
        System.out.print("Enter 1 for Veg");
        System.out.print('\n');
        System.out.print("Enter 2 for Nonveg?");
        System.out.print('\n');*/

        int choi = sc.nextInt();

        switch(choi) 
        {
            case 1 : case1();
            break;

            case 2 : case2();
            break;

            default : 
            System.out.print('\n');
            System.out.print("Enter the valid Number");
            System.out.print('\n');
            System.out.print('\n');
            wel3();
            break;
        }
    
    }

    
    void case1()
    {
        Input in = new Input();
        //Scanner sc = new Scanner(System.in);
        System.out.print('\n');
        System.out.print("We have Mango and Potato in Veg Menu");
        System.out.print('\n');
        System.out.print("Enter 1 for Mango, 2 For Potato: ");
        int ig = sc.nextInt();

        switch(ig)
        {
            case 1: in.mangodb();
            break;

            case 2: in.potatodb();
            break;

            default: System.out.print("Enter the Right option");
            case1();
            break;  

        }

    }

    void case2()
    {
        Input ip = new Input();
        //Scanner st = new Scanner(System.in);
        System.out.print('\n');
        System.out.print("We have Fish and Chicken in Non-Veg Menu");
        System.out.print('\n');
        System.out.print("Enter 1 for Fish, 2 For Chicken: ");
        int jk = sc.nextInt();

        switch(jk)
        {
            case 1: ip.fishdb();
            break;

            case 2: ip.chickendb();
            break;

            default: System.out.print("Enter the Right option");
            case2();
            break;

        }

    }
}


public class Main
{
    public static void main(String[] args) throws IOException
    {
        Fetch fe = new Fetch();

        fe.wel();
        
    }

    
}