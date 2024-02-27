class Example
{
    // Entry point of the program
    public static void main(String[] args)
    {
        // Call the 'example' method with the first command-line argument and store the result in 'result'
        String result = example(args[0]);

        // Loop 5 times
        for (int j=0; j<5; j++)
        {
            // Loop 5 times
            for (int i=0; i<5; ++i)
            {
                // Print the current value of 'i' followed by a space
                System.out.print(i + " ");
            }
            // Print a newline after each inner loop
            System.out.println();
        }
    }

    // Method that takes a string as an argument and returns a string
    public static String example(String arg)
    {
        // Declare an integer 't' and set it to 10
        int t = 10;

        // Declare an integer 'r' and set it to 100
        int r = 100;

        // Set 'r' to the product of 't' and 'r'
        r = t * r;

        // Convert 'r' to a string and return it
        return Integer.toString(r);
    }
}