public class Main {
    public static void main(String[] args) {

        // Combine command-line arguments into one string
        String str = String.join(" ", args);

        String[] words = str.split(" ");
        String reversed = "";

        // Reverse word order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        // Display result
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed.trim());
    }
}
