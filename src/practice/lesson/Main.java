package practice.lesson;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (DayOfWeek day:DayOfWeek.values()) {
            /*switch (day){
                case FRIDAY:case MONDAY:case WEDNESDAY:
                    System.out.println(day);
            }*/
            if(day.isFlag()){
                System.out.println(day);
            }

            System.out.println("------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter day of week -> ");
            System.out.println("next day -> "+ DayOfWeek.valueOf(scanner.next().toUpperCase()).nexDay());
        }
    }
}
