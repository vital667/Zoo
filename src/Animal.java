abstract class Animal {
    protected static int currentId=1;
    private int id;
    private String name;
    private float weight;

    public Animal(String name, float weight) {
        this.id=currentId++;
        this.name = name;
        this.weight = weight;
    }


    public abstract void introduce();


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public float getWeight() {
        return weight;
    }
}
