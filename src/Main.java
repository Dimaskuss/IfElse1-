public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {

        System.out.println("\nЗадача_1");

        int age = 11;
         if ( age >= 18 ) {
             System.out.println("\nЕсли возрас человека равен "+ age +"\nчеловеку 18 или больше лет\n");
         }
         else {
             System.out.println("\nЕсли возрас человека равен "+ age +"\nвозраст совершеннолетия еще не наступил и нужно немного подождать.\n");
         }
    }

    public static void task2() {

        System.out.println("\nЗадача_2");

        byte temp = 6;

        if ( temp>5){
            System.out.println("\nНа улице " + temp +  " градусов . Можно идти без шапки!! :))");
        }
        else{
            System.out.println("\nНа улице " + temp +  " градусов . Нужно надеть шапку ! :((");
        }
    }

    public static void task3() {

        System.out.println("\nЗадача_3");

        int speed = 0 ;
        if ( speed > 60 ){
            System.out.println("\nЕсли скорость " + speed + ", то придется заплатить штраф.\n");
        }
        else{
            System.out.println("\nЕсли скорость " + speed + ", можно ездить спокойно.\n");
        }


    }

    public static void task4() {

        System.out.println("\nЗадача_4");
        int age = 25;
        boolean canGoToGarden = age >= 2 && age < 6;
        if (canGoToGarden) {
            System.out.println("\nЕсли возраст человека равен " + age + ", то ему нужно ходить детский сад.");
        }if ( age < 2){
            System.out.println("покормите грудничка");
        }
        boolean canGoToSchool = age >= 7 && age < 18;
        if (canGoToSchool){
                System.out.println("\nЕсли возраст человека равен " + age + ", то ему нужно ходить в школу.");
            }
        boolean canGoToUniver = age >= 18 && age < 24;
        if (canGoToUniver){
            System.out.println("\nЕсли возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        if (age>=24){
            System.out.println("\nЕсли возраст человека равен " + age + ", то ему нужно ходить на работу. человек РАб");
        }
        else {
            System.out.print("Человек на пути развития и обучения ");
        }


    }

    public static void task5() {

        System.out.println("\nЗадача_5");
        int age = 17;
        if (age < 5) {
            System.out.println("\nЕсли возраст человека равен " + age + ", то ему нельзя кататься на аттракционе.\n");
        } else if (age >= 5 && age <= 14){
            System.out.println("\nЕсли возраст человека равен " + age + " доступ на аттракцион с родителями.\n");
        }else {
            System.out.println("\nЕсли возраст человека равен " + age +" можно кататься без взрослого.\n");
        }
    }

    public static void task6() {

        System.out.println("\nЗадача_6");
        int people = 122;
        if (61 <= people && people <= 102) {
            System.out.println(" едем стоя !!  )) ");
        } else if ( 0 <= people && people <= 61) {
            System.out.println(" едем сидя!!  )) ");
        }else{
                System.out.println(" вагон переполнен !!  )) ");
            }

        }




    public static void task7() {

        System.out.println("\nЗадача_7");
        int one = 33;
        int two = 313;
        int three = 50 ;
    /*    boolean oneTop = (three < one && one> two );
    if(oneTop){
            System.out.println( one ); }
        boolean twoTop = (three < two && one < two );
        if(twoTop){
            System.out.println( two ); }
        boolean threeTop = (three > one && three > two );
        if(threeTop){
            System.out.println( three ); }
*/
     if (one> two && one> three){
         System.out.println( one );
     }
         else if (two> one && two> three){
         System.out.println(two);
         }
         else {
         System.out.println( three );
     }
    }

}