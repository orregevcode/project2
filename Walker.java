// ==================================
// Abstract Class Walker
// ==================================
/**
 * The Walker class is an abstract subclass of Animal that adds attributes
 * specific to animals that walk or run, such as speed and tail length.
 */

abstract class Walker extends Animal {

    private double _speed;
    private double _tailLength;

    /**
     * Parameterized constructor for Walker.
     * Initializes the animal with the provided attributes.
     * 
     * Note: speed and tailLength must be non-negative. If negative values
     * are provided, they are defaulted to 0.0.
     *
     * No aliasing here since all parameters are either primitives
     * or immutable types (String).
     * 
     * @param name       Animal's name (String - immutable).
     * @param weight     Animal's weight (double - primitive).
     * @param gender     Animal's gender (int - primitive, e.g., constants like
     * @param speed      Running speed (non-negative).
     * @param tailLength Tail length (non-negative).
     */
    public Walker(String name, double weight, int gender, double speed, double tailLength) {
        super(name, weight, gender);// Call to Animal's constructor

        this._speed = (speed >= 0) ? speed : 0.0;// if it negtive speed set the speed to 0
        this._tailLength = (tailLength >= 0) ? tailLength : 0.0;

    }

    /**
     * Copy constructor for Walker.
     * Creates a deep copy of another Walker object.
     * 
     * @param other The Walker to copy. If null, fields will default to 0.
     */
    public Walker(Walker other) {
        super(other); // Calls Animal's copy constructor
        if (other != null) {
            this._speed = other._speed;
            this._tailLength = other._tailLength;
        }
    }

    // --- Getters ---
    public double getRunSpeed() {
        return _speed;
    }

    // --- Setters ---
    public void setRunSpeed(double speed) {
        this._speed = (speed >= 0) ? speed : 0.0;// if it negtive speed set the speed to 0
    }

    // --- Getters ---//
    public double getTailLength() {
        return _tailLength;
    }

    // --- Setters ---
    public void setTailLength(double tailLength) {
        this._tailLength = (tailLength >= 0) ? tailLength : 0.0;
    }

    // --------------------
    // Abstract/Overridden Methods
    // --------------------

    /**
     * Implementation of the abstract goOut method for walkers.
     * Prints a message describing the animal going out for a stroll.
     */
    @Override
    public void goOut() {
        System.out.println(getName() + " " + "strolling out");
    }

    @Override
    public String toString() {
        return "Walker [name=" + _name + ", weight=" + _weight + ", gender=" + (_gender == MALE ? "Male" : "Female")
                + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;// iF the attributes like name ,weight ,and gender are not equel return false
        if (this == obj) return true; // point to the same location in memory
    
        Walker other = (Walker)obj;

        return this._speed == other._speed && this._tailLength == other._tailLength;
    }

    //Note   because Walker is abstract class we not use 

}