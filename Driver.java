public class Driver 
{
    public void convertStringToCharArray() 
    {
        
        String str = "Abcdefg";
        char[] cArray = str.toCharArray();
        
        for (char c : cArray)
            System.out.println(c);
    }
}
