// ==================================
// Abstract Class Reptile
// it is super calss for Snake and Crocodile
// ==================================
abstract class Reptile extends Animal {
    private double _length; // the length of the Animal

    /**
     ** Parameterized constructor for Reptile.
     * This constructor initializes the reptile's attributes.
     * 
     * @param weight Animal's weight.
     * @param gender Animal's gender.
     * @param length Length of the animal
     *               * Note: There is no aliasing here since all parameters passed
     *               are either primitive types (int, double) or immutable (String).
     *               Primitives are passed by value, and Strings in Java are
     *               immutable,
     *               so no shared references can be modified externally.
     **/
    public Reptile(String name, int weight, int gender, double length) {
        super(name, weight, gender);// Call to Animal's constructor
        this._length = (length >= 0) ? length : 0.0;

    }

    /**
     * Copy constructor for Reptile.
     * This constructor creates a deep copy of another Reptile object.
     * - super(other) calls the Animal copy constructor (assumed to deep copy ).
     * length is a primitive (double) and copied by value.
     *
     * @param other Another Reptile object to copy from.
     */
    public Reptile(Reptile other) {
        super(other);// Calls Animal copy constructor
        this._length = other._length;
    }

    // --- Getter ---
    public double getLength() {
        return this._length;
    }

    // --- Setter ---
    public void setLength(double length) {

        this._length = (length >= 0) ? length : 0.0;
    }

    /**
     * Overrides the abstract goOut() method from Animal.
     * Prints a message indicating that the reptile is crawling out.
     */
    @Override
    public void goOut() {
        // Note: Output string remains in Hebrew as per original code.
        // Uses getName() inherited from Animal - no change needed here
        System.out.println(getName() + " crawling out ");
    }

    public boolean equals(Object obj) {
        if(this == obj)return true; // point to  the same location in memory 
        if (!super.equals(obj)) return false;// Check if the parent (Animal) fields are equal
     
        Reptile other = (Reptile)obj; // Cast to Reptile

        return Double.compare(this._length, other._length) == 0; 

     

    }

}


