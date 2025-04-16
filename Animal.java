abstract class Animal {

    /*
     * architecture
     * Naming Conventions in Java
     * * 1. camelCase:
     * - Used for variable names and method names.
     * - Example: `getWeight()`, `setGender()`
     * 
     * 2. i used PascalCase:
     * - for class and interface names.
     * - Example: `Animal`, `Zoo`, `Dog`
     *
     */

    // ==================================
    //  Abstract Class Animal 
    // ==================================
    protected String _name;
    protected double _weight;
    protected int _gender;

    public static final int MALE = 0;
    public static final int FEMALE = 1;

    /**
     * Represents a general animal in the zoo.
     * This class is abstract because a "general" animal doesn't make sense,
     * and certain actions like converse and goOut must be implemented by
     * subclasses.
     */

    /**
     * Parameterized constructor for Animal.
     * 
     * @param name   Animal's name.
     * @param weight Animal's weight (must be non-negative, otherwise set to 0).
     * @param gender Animal's gender (0 for Male, 1 for Female, otherwise set to 0).
     */
    public Animal(String name, double weight, int gender) {
        this._name = name;

        // Initialize _weight using the ternary operator: if weight is non-negative,
        // assign it; otherwise, assign 0.0
        // Set _weight to weight if it's >= 0; otherwise to 0.0
        this._weight = (weight >= 0) ? weight : 0.0;
        this._gender = (gender == MALE || gender == FEMALE) ? gender : MALE;

    }

    /**
     * Copy constructor for Animal.
     * 
     * @param other The animal to copy.
     *              i use Encapsulation s to ensure proper encapsulation and data
     *              access.
     */
    public Animal(Animal other) {
        this._name = other._name;
        this._weight = other._weight;
        this._gender = other._gender;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public double getWeight() {
        return _weight;
    }

    public void setWeight(double weight) {
        // Initialize _weight using the ternary operator: if weight is non-negative,
        // assign it; otherwise, assign 0.0
        // Set _weight to weight if it's >= 0; otherwise to 0.0
        // method i think is optional here but i prefer to make it clean and readable
        this._weight = (weight >= 0) ? weight : 0.0;

    }

    public int getGender() {
        return this._gender;
    }

    public void setGender(int gender) {
        // Validate gender
        this._gender = (gender == MALE || gender == FEMALE) ? gender : MALE;
    }


    // ==================================
    // Overridden Methods
    // ==================================

    /**
     * Determines if two animals are equal by comparing their name, weight, and gender.
     * 
     * @param obj The object to compare to this animal.
     * @return true if the animals are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {

     // Check if both references point to the same object in memory
        if (this == obj)
            return true;
        if (!(obj instanceof Animal))
            return false;

        Animal other = (Animal) obj; // we casting it to Ainmel from obj

        return this._name.equals(other._name) &&
                this._weight == other._weight &&
                this._gender == other._gender;

    }

    // ==================================
    // Abstract Methods (will  be implemented by subclasses)
    // ==================================
    /**
     * Handles the animal leaving its cage for feeding.
     * 
     * This method must be implemented by all concrete subclasses of Animal.
     * Each subclass ( Walker, Reptile) will override this method.
     * For example:
     * - A Walker animal might walk out of its cage.
     * - A Reptile might be carried out in a special box.
     */
    public abstract void goOut();

    /**
     * Handles conversing with the animal.
     * Behavior depends on the specific animal type.
     */
    public abstract void converse();

    /**
     * This method defines the default behavior for all animals when they return
     * to their cage after feeding or walking.
     * 
     * Since this behavior is common for all animals, it is implemented in the base
     * Animal class and does not need to be overridden.
     */
    public void getBack() {
        System.out.println(" getting back ");
    }



}