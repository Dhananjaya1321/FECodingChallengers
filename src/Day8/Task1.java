package Day8;

public class Task1 {
    public static void main(String[] args) {
        String providedValue="Write a Java program that finds the starting index of a given word within a provided\n" +
                "string. The program should print the index if the word is found, and a message indicating the word\n" +
                "was not found if it isn't present in the string.";

        String givenValue="indicating";

        int givenValueLength = givenValue.length();
        for (int i = 0; i <= providedValue.length()-givenValue.length(); i++) {
            if (providedValue.substring(i,givenValueLength++).equals(givenValue)) {
                System.out.println(i);
            }
        }

    }
}
