import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;
    public static void main(String args[])
	{

        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
	int num = 0;
        String hexadecimal="";

	if(args.length == 0)
        {
                System.out.println("Empty Input.");
                return;
        }

        try
        {
                Arg1 = Integer.parseInt(args[0]);
                num = Arg1;
        }
        catch (NumberFormatException e)
        {
                System.out.println("Input is not an integer");
                return;

        }

	System.out.println("Converting the Decimal Value " + num + " to Hex...");
        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

  }
}
