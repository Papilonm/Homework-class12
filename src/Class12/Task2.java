package Class12;

public class Task2 {
    public static void main(String[] args) {


        //2) Create a String and print it in reverse order (Sunday → yadnuS).

        String day = "Monday";
        StringBuffer sb = new StringBuffer(day);
        System.out.println(sb.reverse());
    }

}