package ship;

public abstract class Ship implements Floating {

    private String name;
    private int weight;
    protected int yearOfCreation;

    @Override
    public void swim() {
        System.out.println(getName() + " can swim!!!");
    }

    public Ship(){
        name = "Unnamed";
        weight = 0;
        yearOfCreation = 0;
    }

    public Ship(String name){
        this();
        this.name = name;
    }

    public Ship(String name, int weight){
        this(name);
        this.weight = weight;
    }

    public Ship(String name, int weight, int yearOfCreation){
        this.name = name;
        this.weight = weight;
        this.yearOfCreation = yearOfCreation;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setYearOfCreation(int yearOfCreation){
        this.yearOfCreation = yearOfCreation;
    }

    public int getYearOfCreation(){
        return yearOfCreation;
    }

    public void printFields() {
        System.out.println("----" + this.getClass().getSimpleName() + "----");
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("yearOfCreation: " + yearOfCreation);
    }
}
