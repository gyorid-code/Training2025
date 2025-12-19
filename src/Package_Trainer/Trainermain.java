package Package_Trainer;

import java.time.LocalDate;
import java.util.Scanner;

public class Trainermain {

  /*  public static void main(String[] args) {
        Trainer trainer = new Trainer("Joe", 2000);
        System.out.println("Name: " + trainer.getName());
        System.out.println(trainer.getYearOfBirth());


        Trainer anotherTrainermain = new Trainer("Due", 1900 );
        System.out.println("Name: " + anotherTrainermain.getName());
        System.out.println(anotherTrainermain.getYearOfBirth());


    }
*/
    public static void main(String[] args) {
        System.out.println("Name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Birthday?");
        Scanner input2 = new Scanner(System.in);
        int birthday = input2.nextInt();

        Trainer trainer = new Trainer(name, birthday);
        System.out.println("Name: " + trainer.getName());
        System.out.println("Year: "+  trainer.getYearOfBirth());




        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date2 = LocalDate.of(2025,12,18);
        System.out.println("Keszult: "+ date2);


        
        int[] a ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i=0; i<5; i++) {
            System.out.println(a[i]);
        }


    }



}
