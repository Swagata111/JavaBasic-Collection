public class deleteword{

    public static void main(String[] args) {

        String s = "I work at at Capgemini";

        String[] word=s.split(" ");
        String w="at";
        int pos=2;
         for (int i = 0; i < word.length; i++)
         {
             if(!(word[i].equals(w) && (i==pos)))
             System.out.print(word[i]+" ");
         }
        
        
    }
}
