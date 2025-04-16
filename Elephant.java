
/**
 * Represents an Elephant.
 * Inherits from Walker and implements converse.
 */
public class Elephant extends Walker {


    /**
      constructor for Elephant.
     */
    public Elephant(String name, double weight, int gender, double speed, double tailLength) {
        super(name, weight, gender, speed, tailLength);

    }
    
    /**
     * Copy constructor for Elephant.
     */
    public Elephant(Elephant other) {
        super(other);
    }


    
    /**
     * Implements conversation with an Elephant.
     */
    @Override
    public void converse() {
        System.out.println("WUOOOOOOO");
       
    }



}
