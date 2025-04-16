public class Gazelle extends Walker {
    
    public Gazelle(String name, double weight,int gender, double speed, double tailLength){
        super(name,weight,gender,speed,tailLength);
    }
    public void converse(){
        System.out.println("Lailatilati");
    }

    public Gazelle(Gazelle other ){
        super(other);
    }


}
