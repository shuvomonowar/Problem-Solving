namespace LearningToSolving.Module_1.Assignment;

public class Task_2 {
    
    // Find the sum between two natural numbers
    public void Solution()
    {
        long first, second, start, end;
        Console.Write("Enter first number : ");
        first = Convert.ToInt64(Console.ReadLine());
        Console.Write("Enter second number : ");
        second = Convert.ToInt64(Console.ReadLine());
        
        // Find out the starting and ending number
        if (first > second)
        {
            start = second - 1;
            end = first;
        }
        else
        {
            start = first - 1;
            end = second;
        }
        
        
        // Calculate the sum
        long final_start, final_end, sum;
        final_start = (start * (start + 1)) / 2;
        final_end = (end * (end + 1)) / 2;

        sum = final_end - final_start;
        Console.WriteLine("The sum is " + sum);
    }
}


// Time Complexity : O(1)
// Space Complexity : O(1)