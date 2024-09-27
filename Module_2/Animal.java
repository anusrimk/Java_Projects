// Question 15
package Module_2;

public class Animal {
    boolean vegetarian;
    String food;
    int numOfLegs;

    Animal(){
        this.food = "unknown";
        this.numOfLegs = 4;
        this.vegetarian = true;
    }

    Animal(String f, int n, boolean v){
        this.food = f;
        this.numOfLegs = n;
        this.vegetarian = v;
    }

    public void setFood(String f){
        this.food = f;
    }

    public String getFood(){
        return this.food;
    }

    public void setVegetarian(boolean b){
        this.vegetarian = b;
    }

    public boolean getVegetarian(){
        return this.vegetarian;
    }

    public void setNumOfLegs(int n){
        this.numOfLegs = n;
    }

    public int getNumOfLegs(){
        return this.numOfLegs;
    }

    @Override
    public String toString(){
        return ("Animal summoned");
    }
}

class Cat extends Animal{
    String color;

    Cat(){
        super();
    }

    Cat(String f, boolean v, int num, String c){
        super(f, num, v);
        this.color = c;
    }

    @Override
    public String toString(){
        return ("Cat summoned meoww");
    }
}

class Cow extends Animal{
    String breed;

    Cow(){
        super();
    }

    Cow(String f, int num, boolean v, String breed){
        super(f, num, v);
        this.breed = breed;
    }

    @Override
    public String toString(){
        return ("Cow summoned moo");
    }
}