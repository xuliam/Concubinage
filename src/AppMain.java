import java.sql.SQLOutput;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nnNameArray = {"Mary", "Cindy", "Rose", "Linda", "Micky","", "","", "",""};
        String[] levelNames = {"Good", "Better", "Great", "Fantastic", "Amazing"};
        int[] level = new int[10];
        int[] loves = new int[10];

        int nncount = 5;
        int gamedays = 1;

        for (int i = 0; i < nncount; i++) {
            loves[i] = 100;
        }
        while(gamedays<=10){
            System.out.println("Today is the day "+ gamedays);
            System.out.println("1. Choose one -- add");
            System.out.println("2. Love most -- change");
            System.out.println("3. Don't love anymore -- delete");
            System.out.println("4. Where are you -- search");
            System.out.println("Your choice?");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    if(nncount == nnNameArray.length){
                        System.out.println("you have 10 nn. it is max");
                    }
                    System.out.println("pls enter her name");
                    String newName = input.next();
                    nnNameArray[nncount] = newName;
                    loves[nncount++] = 100;
                    break;
                case 2:
                    break;

                case 3:

                    break;
                case 4:

                    break;
                    default:
                        System.out.println("You must input the integer between 1 to 4");
                        continue;
            }

            for (int i = 0; i <nncount ; i++) {
                System.out.println(nnNameArray[i] + "\t" + levelNames[level[i]] + "\t" + loves[i]);
            }
            gamedays++;
        }
        System.out.println("name\tlevel\tlove");
        for (int i = 0; i <nncount ; i++) {
            System.out.println(nnNameArray[i]+"\t" + levelNames[level[i]]+"\t" + loves[i]);
        }

    }
}
