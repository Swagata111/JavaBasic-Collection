public class namesearch
{
   public static void main(String args[])
    {
        String[] ar1= {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Dave","Raj"};
        String name="Dave";
        int i,c=0;
        for(i=0;i<ar1.length;i++)
        {
            String word=ar1[i];
            if(word.equals(name))
            {
                c++;
            }
        }
       System.out.println("The name is present "+c+ " times.");
    }
}