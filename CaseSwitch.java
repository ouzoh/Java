public class Program 
{
    public static void main(String[] args) 
    {
        int day = 3;
        switch(day) 
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        }
    }
}



/*
A switch statement can have an optional DEFAULT case. 
The DEFAULT case can be used for performing a task when none of the cases is matched.

For example:
int day = 3;

switch(day) {
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
  default:
    System.out.println("Weekday");
}
// Outputs "Weekday"
*/
