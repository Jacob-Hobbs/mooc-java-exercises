import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;
        int longest = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {  
                break;
            } 
       
            String[] people = input.split(",");
            for (int i = 0; i < people.length; i++) {
                if (i % 2 == 1) {
                    sum += Integer.valueOf(people[i]);
                    count++;
                    continue;
                } else if (i % 2 == 0) {
                    if (people[i].length() > longest) {
                        longest = people[i].length();
                        name = people[i];
                        continue;
                    } else {
                        continue;
                    }
                    
                } else {
                    System.out.println("Error");
                }
            }  
        }  
        
        avg = (double) sum / count;
        
        System.out.println("Longest name: " + name); 
        System.out.println("Average of the birth years: " + avg);
    }
}
