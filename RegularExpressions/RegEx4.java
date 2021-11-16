package RegularExpressions;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
public class RegEx4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

            System.out.println("Enter regex pattern:");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("Enter text:");
            Matcher matcher = pattern.matcher(sc.nextLine());
            while (matcher.find()) {
                System.out.println("I found the text "+matcher.group()+" starting at index "+
                        matcher.start()+" and ending at index "+matcher.end());

            }


    }
}
