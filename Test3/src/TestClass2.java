public class TestClass2
{
    public static void main(String[] args)
    {
        String[] strings = { "1", "2", "3", "4" };

        double av = average(strings);
        System.out.println(av);



    }

    public static double average(String[] nums)
    {
        double result = 0;

        for(String s : nums)
            result += Integer.parseInt(s);

        return result / nums.length;
    }
}
