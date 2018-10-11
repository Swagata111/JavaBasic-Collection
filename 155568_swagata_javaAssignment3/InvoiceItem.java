public class InvoiceItem
{
String id;
String desc;
int qty;
double double unitPrice;
InvoiceItem(String id,String desc,int qty,double unitPrice)
{
this.id=id;
this.desc=desc;
this.qty=qty;
this.unitPrice=unitPrice;

}

public String getId()
{
return id;
}
public String getDesc()
{
return desc;
}
public int getQty()
{
return qty;
}
public void setQty(int Qty)
    {
        this.qty = qty;
    }
public double getUnitPrice()
{
return unitPrice;
}
public void setunitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }
public double getTotal()
{
return unitPrice*qty;
}
	public String toString()
	{
	return "InvoiceItem[id="+id+"desc="+desc+"qty="+qty+"unitPriceprice="+unitPriceprice;
	}
}


public class test
{
public static void main(String[] args) 
{
InvoiceItem obj1=new InvoiceItem("10","Bat",10,9.8);
obj.getId();
obj.getDesc();
obj.getQty();
obj.setQty(10);
obj.getUnitPrice();
obj.setunitPrice(15);
c=obj.getTotal();
System.out.print("Total="+total);
String c=obj.toString();
System.out.println(c);
}
}


