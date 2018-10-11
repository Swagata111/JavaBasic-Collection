public class reverse
{
   public void reverseword(String str)
   {
	String[] words = str.split(" ");
	String rs = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String rw = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		
		rw = rw + word.charAt(j);
	   }
	   rs = rs + rw + " ";
	}
	System.out.println("Reversed string: ");
	System.out.print(rs);
   }
   public static void main(String[] args) 
   {
	reverse obj = new reverse ();
	obj.reverseword("Let's take LeetCode contest");
	
   }
}