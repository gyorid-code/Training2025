package Package_Trainer;

public class Trainermain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer("Joe", 2000);
        System.out.println("Name: " + trainer.getName());
        System.out.println(trainer.getYearOfBirth());


        Trainer anotherTrainermain = new Trainer("Due", 1900 );
        System.out.println("Name: " + anotherTrainermain.getName());
        System.out.println(anotherTrainermain.getYearOfBirth());


    }

}
