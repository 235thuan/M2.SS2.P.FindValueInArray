import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        int exit=0;
        do {
            String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a name's student ");
            String input_name = scanner.nextLine();
            boolean isExist = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(input_name)) {
                    System.out.println("Position of students in the list " + input_name + " is: " + (i + 1));
                    isExist = true;
                    break;
                }
            }
            if (!isExist)
                System.out.println("Not found " + input_name + " in the list");
            System.out.println("Enter 0 to exit, other number to continue");
            exit = scanner.nextInt();
            if (exit==0) {
                System.exit(0);
            }
        }
        while (exit!=0);

    }
}
