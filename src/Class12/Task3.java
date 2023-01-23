package Class12;

import java.util.Scanner;

public class Task3 {
    //3) Write a program that reads two people's first
    //names and if they expecting boy or girl?
    //Based on the input suggests a name for a baby:
    //Example Output:
    //Mom’s first name? Mary
    //Dad’s first name? Daniel
    //Boy or Girl? boy
    //Suggested baby name: DANRY
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Please enter your first name(Dad)");
        String name=scan.nextLine();
        System.out.println("2. Please enter your first name (mom)");
        String name2=scan.nextLine();
        System.out.println("Boy or Girl?");
        String childname;

        String gender=scan.nextLine();
        if (gender.equalsIgnoreCase("Boy")){
            childname=name.substring(0,3)+name2.substring(2);
            System.out.println(childname);

        } else if (gender.equalsIgnoreCase("Girl")) {
            childname=name2.substring(0,3)+name.substring(2);
            System.out.println(childname);

        }

    }


}
