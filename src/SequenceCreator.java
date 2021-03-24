import java.util.Random;

public class SequenceCreator {
    private static int _minValue = 10;
    private static int _maxValue = 100;
    private static int _maxDenominatorValue = 99;
    private static Random _random = new Random();

    public static double[] Create(int negativeNumbersCount, int length) throws Exception {
        if (negativeNumbersCount < 0 || length < 0 || negativeNumbersCount > length)
        {
            throw new Exception("Длинна массива меньше чем кол-во негативных чисел!");
        }

        var sequence = new double[length];
        for (int i = 0; i < length; i++)
        {
            if (i < negativeNumbersCount)
            {
                var value1 = _random.nextInt(_maxValue + 10) + _minValue;
                var value2 = _random.nextInt(_maxDenominatorValue) + 1;
                sequence[i] = -1 * value1 * value2;
            }
            else{
                sequence[i] = _random.nextInt(_maxValue + 1) + _minValue;
            }
        }

        return sequence;
    }
}
