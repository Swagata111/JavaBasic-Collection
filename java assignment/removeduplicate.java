public class removeduplicate
{
   public static void main(String args[])
    {
        String word="aabcccdfg";
        String str = new String();
        int i;
        for(i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if (str.indexOf(c) < 0)
            {
                
                str += c;
            }
        }
       System.out.println("New string:"+str);
    }
}