public class Timer
{
    private long _startTime;
    private long _endTime;

    public Timer() {
        _startTime = 0;
        _endTime = 0;
    }

    public void start()
    {
        _startTime = System.nanoTime();
    }

    public void end()
    {
        _endTime = System.nanoTime();
    }

    @Override
    public String toString() {

        var elapsedTime = (double) _endTime - _startTime;

        var result = "";
        if (elapsedTime / 1000000000 >= 0.5)
        {
            double sec = elapsedTime / 1000000000;
            result = String.format("%.4f sec", sec);
        }
        else if (elapsedTime / 1000000 >= 0.5)
        {
            var milsec = elapsedTime / 1000000;
            result = String.format("%.4f ms", milsec);
        }
        else
        {
            result = String.format("%.4f ns", elapsedTime);
        }

        return String.format("%.0f ns", elapsedTime);
    }
}
