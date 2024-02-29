import java.util.Random;
public class Dice
{
    private int value;

    public Dice()
    {
        value = 1;
    }

    public void roll()
    {
        Random rand = new Random();
        value = rand.nextInt(6);
        value++;
    }

    public int get()
    {
        return value;
    }

}
