import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {           
        try(Scanner input = new Scanner(System.in))
        {   
                System.out.print("Please enter your age: ");
                String userInput = input.nextLine();

                int userAge = Integer.parseInt(userInput);
    
                if(userAge > 18)
                {
                    System.out.println("Hello adult human");
                }
                else if(userAge<18)
                {
                    System.out.println("Hello underaged human");
                    if(userAge<=10)
                    {
                        System.out.println("Actually...you are a super tiny human, 10 or under I see!");
                    }
                }
                else
                {
                    System.out.println("Hello, Congradulations on becoming a full sized adult human!");
                }

        }catch(Exception e)
        {
            System.out.println("Sorry you entered an invalid value");
        }
        
    }
}
