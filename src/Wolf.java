public class Wolf extends Animal implements Canine{

    private int fangLength;


    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }


    @Override
    public void introduce() {
        System.out.println(super.getId()+" : I'm a "+getClass().getName().toLowerCase()+". My name is "+super.getName()+". I weigh "+
                super.getWeight()+" kg and my fang length is "+fangLength+".");
    }


    @Override
    public void bark() {
            System.out.println("BARK BARK BARK");
    }
}
