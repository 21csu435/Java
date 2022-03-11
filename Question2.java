import java.util.*;
class Question2
{public static void main(String[]args)
	{Scanner ob = new Scanner(System.in);
	 int min;
	 int rmin;
	 int year;
	 int months;
	 int days;
	 System.out.println("Enter the minutes");
	 min = ob.nextInt();
	 System.out.println("The minutes entered is: "+ min);

	 year = min/525600;
	 rmin = min%525600;
	 months = rmin/43200;
	 rmin = rmin%43200;
	 days = rmin/1440;

	 System.out.println(+ year + " years and" + months +" months and " + days + " days and " + rmin + "minutes");
	}
}
	 