import java.util.ArrayList;
import java.util.Scanner;

public class UniqueElements {

    public static ArrayList<String> findUniqueElements(ArrayList<String> inputList) {
        ArrayList<String> uniqueList = new ArrayList<>();
        
        for (String item : inputList) {
            if (!uniqueList.contains(item)) {
                uniqueList.add(item);
            }
        }
        
        return uniqueList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("how many words would you like to enter?");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter" + count + " words:");
        for (int i = 0; i < count; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }
        
        scanner.close();

        ArrayList<String> uniqueWords = findUniqueElements(words);

        System.out.println("\nOriginal List: " + words);
        System.out.println("Unique Elements List: " + uniqueWords);
    }
}