public class Program 
{
    public static void main(String[] args) 
    {
        int x = 1;
        while(x > 0) 
        {
            System.out.println(x);
            if(x == 4) 
            {
                break;
            }
            x++;
        }
    }
}

/*Break statement terminates the loop and 
executes the statement immediately following the loop.

Similar to exit in fortran
*/


public class Program 
{
    public static void main(String[] args) 
    {
        for(int x=10; x<=40; x=x+10) 
        {
            if(x == 30) 
            {
                continue;
            }
            System.out.println(x);
        }
    }
}

/*
The continue makes the loop skip to its next iteration

similar to continue in fortran
*/
