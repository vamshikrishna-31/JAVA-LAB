import java.io.IOException;
import java.util.*;

public class Lab4p3{
	public static void main(String[] args) throws IOException{
		Scanner s=new Scanner(System.in);
		try{
			int x=Integer.parseInt("Manideep");
            int y=s.nextInt();
			System.out.println(x/y);
		}
		catch(InputMismatchException e){
            System.out.println("x");
			System.out.println(e.getMessage());
			}
		catch(ArithmeticException e){
            System.out.println("y");
			System.out.println(e.getMessage());
			}
        catch(Exception e){
            System.out.println("E");
			System.out.println(e.getMessage());
			}
		finally{
			System.out.println("Exception handled");
		
		}
	s.close();
	}

}