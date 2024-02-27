class Example
{
    public static void main(String[] args)
    {
        String result = example(args[0]); // Call example with the first command-line argument

        for (int j=0; j<5; j++)
        {
            for (int i=0; i<5; ++i) // Define n as 5
            {
                System.out.print(i + " ");
            }
            System.out.println(); // Print a newline after each inner loop
        }
    }

    public static String example(String arg)
    {
        int t = 10;
        int r = 100;

        // Set r to the product of t and r
        r = t * r;
        return Integer.toString(r); // Convert r to a String before returning
    }
}