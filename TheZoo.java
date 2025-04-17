public class TheZoo {
    public static void main(String[] args) {

        Elephant el = new Elephant("david", 12, 0, 13, 3);
        Animal combo = new Elephant("david", 12, 0, 13, 3);

        el.equals(combo);

        Animal[] zoo = new Animal[10];

        zoo[0] = new Elephant("DUMBO", 5000, Animal.MALE, 25, 1.0);
        zoo[1] = new Gazelle("BAMBI", 60, Animal.FEMALE, 80, 0.3);
        zoo[2] = new Snake("SLITHER", 5, Animal.MALE, 2.5);
        zoo[3] = new Crocodile("SNAP", 800, Animal.MALE, 4.0);
        zoo[4] = new Elephant("ELLIE", 4500, Animal.FEMALE, 22, 0.9);
        zoo[5] = new Gazelle("SPRINT", 70, Animal.MALE, 85, 0.4);
        zoo[6] = new Snake("VIPER", 4, Animal.FEMALE, 2.2);
        zoo[7] = new Crocodile("CHOMP", 15000, Animal.FEMALE, 3.8);
        zoo[8] = new Elephant("JUMBO", 6000, Animal.MALE, 20, 1.2);
        zoo[9] = new Gazelle("LEAP", 65, Animal.FEMALE, 75, 0.35);

        Animal heaviest = zoo[0];
        for (Animal animal : zoo) {
            animal.goOut();
            animal.converse();
            animal.getBack();
            if (animal.getWeight() > heaviest.getWeight()) {
                heaviest = animal;
            }

        }

        System.out.println("The heaviest animal is " + heaviest.getType() + "  Name: " + heaviest.getName()
                + ", Weight: " + heaviest.getWeight() + ", Gender: "
                + (heaviest.getGender() == Animal.MALE ? "Male" : "Female"));
 
        // Creating an array of Elephant objects specifically (only Elephant objects allowed)
        Elephant[] zooElephants = new Elephant[5];
        zooElephants[0] = new Elephant("E1", 6000, 0, 12, 2.0);
        zooElephants[1] = new Elephant("E2", 5500, 1, 11, 1.8);
        zooElephants[2] = new Elephant("E3", 6200, 0, 13, 2.1);
        zooElephants[3] = new Elephant("E4", 5800, 1, 10, 1.9);
        zooElephants[4] = new Elephant("E5", 5900, 0, 12, 2.2);


    }

}