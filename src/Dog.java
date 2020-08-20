public class Dog extends Animal implements Canine{

    public Dog(String name, float weight) {
        super(name, weight);
    }


    @Override
    public void introduce() {
        System.out.println(super.getId()+" : I'm a "+getClass().getName().toLowerCase()+". My name is "+super.getName()+". I weigh "+
                super.getWeight()+"kg.");
    }

    @Override
    public void bark() {
        System.out.println("bark bark bark");
    }

    void sitPretty(){
        System.out.println(getName()+" sits pretty");
    }
}
