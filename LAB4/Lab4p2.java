import java.io.IOException;
import java.util.*;

public class Lab4p2{

public static void main(String[] args) throws IOException{

Scanner s=new Scanner(System.in);

try{
int x=s.nextInt();
int y=s.nextInt();

System.out.println(x/y);
}

catch(InputMismatchException e){
System.out.println("Y");
System.out.println(e.getMessage());
}

catch(ArithmeticException e){
System.out.println(e.getMessage());
}

finally{
System.out.println("Exception handled");
}

s.close();

}
}