import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter file path: ");
            String filePath = scanner.nextLine();

            System.out.print("Enter source directory path: ");
            String sourcePath = scanner.nextLine();

            FileSorter fileSorter = new FileSorter(filePath, sourcePath);
            fileSorter.sort();
        }
    }
}
