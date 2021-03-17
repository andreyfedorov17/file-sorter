import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of the folder you want to sort: ");
        String dirPath = scanner.nextLine();

        FileSorter fileSorter = new FileSorter(dirPath);
        fileSorter.sorting();
    }
}
