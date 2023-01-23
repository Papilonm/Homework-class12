package Class12;

public class Task1 {
    //@here1) Create a String and if the String is not empty perform the following:
    //if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
    //For Example String str=hello =>l
    public static void main(String[] args) {
        String str="Morning";
        if (!str.isEmpty()){
            int largo=str.length();
            if (largo>3&&largo%2!=0){
                int middlecharacter=largo/2;
                System.out.println(str.charAt(middlecharacter));
            }

        }
    }
}

