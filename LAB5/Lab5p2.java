import java.util.Scanner;

class Lab5p2 {
    public static void main(String[] args) throws Age {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = s.nextInt();

        if (age < 18)
            throw new Age("Sorry not eligible to vote");
        else
            System.out.println("Cast your vote");

    }
}

class Age extends Exception {

    public Age(String msg) {
        super(msg);
    }

}