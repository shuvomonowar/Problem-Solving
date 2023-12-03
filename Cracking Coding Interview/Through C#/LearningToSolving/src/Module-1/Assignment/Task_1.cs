namespace LearningToSolving.Src.Module_1.Assignment;

public class Task_1 {
    
    // Calculate the factorial
    public void Solution()
    {
        Console.Write("Enter input number: ");
        uint input_number = Convert.ToUInt32(Console.ReadLine());

        uint result = 1;

        while (input_number > 1)
        {
            result *= input_number;
            input_number--;
        }

        Console.WriteLine("The factorial result is " + result);
    }
}