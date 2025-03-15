import java.util.Scanner;

public class WordCounter{
    public static void main(String[] args) {
        String sentence = getSentenceInput();
        countWords(sentence);
    }
    public static String getSentenceInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        return sentence;
    }
    public static int countWords(String sentence){
        int count = sentence.split(" ").length;
        System.out.println("The sentence has " + count + " words.");
        return count;
    }
}