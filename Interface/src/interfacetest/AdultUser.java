package interfacetest;

public class AdultUser implements LibraryUser
{

	int age;
	 String bookType;
	 public void registerAccount()
	 {
		 if(age>12)
			 System.out.println("You have successfully registered under an Adult account");
		 if(age<12)
			 System.out.println("Sorry,Age must be greater than 12 years to register as an Adult");
		 
	 }
		public void requestBook()
		{
			if(bookType.equals("Fiction"))
				System.out.println("Book issued successfully,please return the book within 7 days");
			else
				System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
}
