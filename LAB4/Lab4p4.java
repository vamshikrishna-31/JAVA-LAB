import java.util.*;

class UserException1 extends Exception {
    public UserException1() {
        super("Odd number exception");
    }
}

class Lab4p3 {

    public static void excheck(int x) throws UserException1 {

        if ((x & 1) != 0) {
            throw new UserException1();
        } else {
            System.out.println("Exception not occurred");
        }
    }
}

public class Lab4p4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {
            int x = s.nextInt();
            Lab4p3.excheck(x);
        }

        catch (UserException1 e) {
            System.out.println("Odd number exception handled");
        }

        s.close();
    }
}