public class Snake extends Reptile {

    /**
     * constructor for Snake.
     */
    public Snake(String name, int weight, int gender, double length) {
        super(name, weight, gender, length);// Call to Reptile constructor
    }

    // copy constructor
    public Snake(Snake other) {
        super(other);
    }

    /**
     * Implements conversation with an Snake.
     */
    public void converse() {
        System.out.println("Tssssssss");
    }

    /**
     * Returns the type of animal.
     *
     * @return the string "Snake".
     * 
     */
    @Override
    public String getType() {
        return "Snake";
    }
}


