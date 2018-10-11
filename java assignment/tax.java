public class tax
{  
public static void main(String args[])
{  
int ctc=190000;
double tax=0;
if(ctc>=0 && ctc<=80000)
{
    tax=ctc*0;
}

else if(ctc>=181001 && ctc<=300000)
{
    tax=ctc*0.10;
}
else if(ctc>=300001 && ctc<=500000)
{
    tax=ctc*0.20;
}
else if(ctc>=500001 && ctc<=1000000)
{
    tax=ctc*0.30;
}
System.out.println("The tax amount is:"+tax);
}
    
}  