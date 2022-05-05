import java.util.Random;
import java.util.Scanner;
class guessthenumber
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int system = r.nextInt(100);
        int usercount = 1;
        System.out.println("Welcome to Play 'Guess the number' Game");
        System.out.println("Enter your choice to start the game : ");
        System.out.println("1. Choose between 0 to 100\n2. Exit");
        int choice = s.nextInt();
        while(choice!=2)
        {
            switch(choice)
            {
                case 1:
                System.out.println("Enter a number to play the game : ");
                int a = s.nextInt();
                if(a==system)
                {
                    System.out.println("Nice, you really get it!!");
                }
                else
                {
                    if(a<system)
                    {
                        System.out.println("No, Please Choose bigger number");
                        usercount = usercount + choice;
                    }
                    else
                    {
                        System.out.println("No, Please Choose smaller number");
                        usercount = usercount + choice;
                    }
                }
                break;
                default:
                {
                    System.out.println("Sorry, it's not a correct Choice");
                }
            }
            System.out.println("Want to Play Again?\n1.Yes\n2. No");
            choice = s.nextInt();
        }
        System.out.println("You tried "+usercount+" times to win this game. Well Played\nThank You");
    }
}
