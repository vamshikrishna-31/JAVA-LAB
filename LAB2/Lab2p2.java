import java.util.Scanner;

public class Lab2p2 {
    	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=s.nextInt();
		System.out.println("enter the elements:");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		
        int c = 0;

        for(int i : arr) {

            if(i < 2)
                continue;

            int f = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    f++;
                }
            }

            if(f == 2) {
                c++;
            }
        }

        System.out.println("Number of prime elements: " + c);

        s.close();

	
		        		
	}
}
