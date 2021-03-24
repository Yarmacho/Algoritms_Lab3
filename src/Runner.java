import java.util.List;

public class Runner
{
    public static void main(String[] args) throws Exception {
        // 11556+ - StackOverflow
        var numbers = SequenceCreator.Create(100, 15000);

        var timer = new Timer();
        timer.start();
        System.out.println(sumOfNegativesIterative(numbers));
        timer.end();
        System.out.println(timer);
        System.out.println();

        timer = new Timer();
        timer.start();
        System.out.println(sumOfNegativesRecursive(numbers, 0));
        timer.end();
        System.out.println(timer);
    }

    private static double sumOfNegativesIterative(double[] numbers)
    {
        var res = 0d;

        for (var number : numbers)
        {
            if (number >= 0)
            {
                break;
            }

            res += number;
        }

        return res;
    }

    private static double sumOfNegativesRecursive(double[] numbers, int index)
    {
        index = index <= 0 ? 0 : index;
        var res = 0d;

        if (index == numbers.length || numbers[index] >= 0)
        {
            return res;
        }
        else
        {
            return res + numbers[index] + sumOfNegativesRecursive(numbers, index + 1);
        }
    }
}
