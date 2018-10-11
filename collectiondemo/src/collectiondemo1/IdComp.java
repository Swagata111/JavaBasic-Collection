package collectiondemo1;

import java.util.Comparator;

public class IdComp implements Comparator<SavingAccount>
{
	public int compare(SavingAccount e1, SavingAccount e2) {
        if(e1.getAcc_ID() > e2.getAcc_ID()){
            return 1;
        } else {
            return -1;
        }
    }
}
