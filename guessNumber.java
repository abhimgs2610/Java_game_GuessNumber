import java.util.Random;
import java.util.Scanner;
public class guessNumber
{
    public static void main(String args [])
    {
        System.out.println("Welcome to play 'Guess The Number' Game");
        Game g = new Game();
        g.takeName();
        boolean b = false;
        while(!b)
        {
            g.takeInput();
            b = g.isCorrectNumber(); 
            if(b==true)
            {
                break;
            }
        }
    }
}
class Game
{
    public int n;
    public int system;
    public int count=0;
    public String name;
    
    Game()
    {
        Random r = new Random();
        system = r.nextInt(100);
    }

    void takeInput()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = s.nextInt();
    }

    void takeName()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        name = s.nextLine();
    }

    boolean isCorrectNumber()
    {
        count++;
        if(n == system)
        {
            System.out.println("Yes " +name+ " correct guess!!\nYou took total " +count+ " chance for the correct guess.");
            return true;
        }
        else if(n > system)
        {
            System.out.println("No " +name+ " please Take a low number");
        }
        else
        {
            System.out.println("No " +name+ " please Take a higher number");
        }
        return false;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public int getCount()
    {
        return count;
    }
}
