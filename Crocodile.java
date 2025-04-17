public class Crocodile extends Reptile {

    /**
     * constructor for Alligator.
     */
    public Crocodile(String name, int weight, int gender, double length) {
        super(name, weight, gender, length);// Call to Reptile constructor
    }

    // copy constructor
    public Crocodile(Crocodile other) {
        super(other);
    }

    /**
     * Implements conversation with an Alligator.
     */
    public void converse() {
        System.out.println("Whaaaaammmmmm");
    }


    
    @Override
    public String getType() {
        return "Crocodile";
    }

}
