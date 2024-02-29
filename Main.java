public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Main o = new Main();
    }

    public Main()
    {
        Dice die1 = new Dice();
        Dice die2 = new Dice();
        die1.roll();
        die2.roll();
        System.out.println("dice 1 is "+die1.get()+"\ndice 2 is "+die2.get());
    }
}