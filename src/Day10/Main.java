package Day10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Name : ");
        String name = scanner.nextLine();

        String tempName = (name.substring(0, 1)).toUpperCase() + name.substring(1, name.length());
        System.out.println("Hello, " + tempName + "!");

        convertNameToCamelCase(name);
        convertNameToSnakeCase(name);
    }

    public static void  convertNameToCamelCase(String name){
        for (int i = 0; i < name.length(); i++) {
            if (name.substring(i,i+1).equals(" ")) {
                name=(
                        (name.substring(0,1)).toLowerCase()+name.substring(1,i)
                )+(
                        (name.substring(i+1,i+2)).toUpperCase()+name.substring(i+2,name.length())
                );

            }
        }
        System.out.println(name);
    }

    public static void  convertNameToSnakeCase(String name){
        for (int i = 0; i < name.length(); i++) {
            if (name.substring(i,i+1).equals(" ")) {
                name=((name.substring(0,1)).toLowerCase()+name.substring(1,i))+"_"+((name.substring(i+1,i+2)).toLowerCase()+name.substring(i+2,name.length()));

            }
        }
        System.out.println(name);
    }
}
