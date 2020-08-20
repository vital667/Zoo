public class Tiger extends Animal{

    private int clawLength;


    public Tiger(String name, float weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }


    @Override
    public void introduce() {
        System.out.println(super.getId()+" : I'm a "+getClass().getName().toLowerCase()+". My name is "+super.getName()+". I weigh "+
                super.getWeight()+" kg and my claw length is "+clawLength+".");
    }
}
