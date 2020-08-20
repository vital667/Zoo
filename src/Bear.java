public class Bear extends Animal{

    private int furLength;

    public Bear(String name, float weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }


    @Override
    public void introduce() {
        System.out.println(super.getId()+" : I'm a "+getClass().getName().toLowerCase()+". My name is "+super.getName()+". I weigh "+
                super.getWeight()+" kg and my fur length is "+furLength+".");
    }
}
