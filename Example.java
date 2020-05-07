class Example{
    /* This is my first java program.
   This will print 'Hello World' as the output*/
    public static void main(String []args) {
        System.out.println("Hello World"); //prints Hello World
    }
}

class Conversion {
  public static void main(String args[]) {
    byte b;
    int i = 257;
    double d = 323.142;

    System.out.println("\nConversion of int to byte.");
    b = (byte) i;
    System.out.println("i and b "+ i + " " + b);

    System.out.println("\nConversion of double to int.");
    i = (int) d;
    System.out.println("d and i "+ d + " " + i);

    System.out.println("\nConverson of double to byte.");
    b = (byte) d;
    System.out.println("d and b "+ d + " " + b);
  }

}

class Array {
    public static void main(String args[]) {
	int month_days[];
	month_days = new int[12];
// or you see it written as int month_days[] = new int[12]
	month_days[0] = 31;
	month_days[1] = 28;
	month_days[2] = 31;
	month_days[3] = 30;
	month_days[4] = 19;
	System.out.println("April has "+ month_days[3] + " days.");
   }
}
// An improved version of the previous program.
class AutoArray {
    public static void main(String args[]) {
	int month_days[] = {31, 28, 31, 30, 31, 30};
	System.out.println("April has " + month_days[3] + " days.");
    }
}

//two dimensional arrays
int twoD[] [] = new int[4] [5]

class TwoDArray{
   public static void main(String args[]) {
	int twoD[] [] = new int[4] [5];
	int i, j, k = 0;

	for(i=0; i<4; i++)
	    for (j=0; j<5; j++) {
	        twoD[i] [j] = k;
		k++;
	    }
	for (i=0; i<4; i++) {
	    for(j=0; j<5; j++)
		System.out.print(twoD[i] [j] + " ");
	    System.out.println();

	}
    }
}

// Manually allocate differing size second dimension
class TwoDAgain {
    public static void main(String args[]) {
        int twoD[] [] = new int[4] [];
	twoD[0] = new int[1];
	twoD[1] = new int[2];
	twoD[2] = new int[3];
	twoD[3] = new int[4];

	int i, j, k = 0;

	for(i=0; i<4; i++)
	    for (j=0; j<5; j++) {
	        twoD[i] [j] = k;
		k++;
	    }
	for (i=0; i<4; i++) {
	    for(j=0; j<5; j++)
		System.out.print(twoD[i] [j] + " ");
	    System.out.println();

	}
    }
}

//Initialize a two-dimensional array.
class Matrix {
    public static void main(String args[]) {
	double m[] [] = {
          { 0*0, 1*0, 2*0, 3*0 },
          { 0*1, 1*1, 2*1, 3*1 },
          { 0*2, 1*2, 2*2, 3*2 },
          { 0*3, 1*3, 2*3, 3*2 }
        };
        int i, j;

	for (i=0; i<4; i++) {
	  for (j=0; j<4; j++)
	    System.out.print(m[i] [j] + " ");
	  System.out.println();
	}
    }
}

class Ten{
    public static void main(String args[]) {
	for(int i=1; i<=10, i++) {
	    System.out.println(i);
	}
}

public class Mul{
    public static void main(String[] args) {

	int num = 10;	

	System.out.print("Enter a number \nHere you go! ");

	

	for(int i=1; i<=12; i++) {
	    System.out.println(i*num);
	}
    }
}
// this can be written more effificiently using the do-while loop as
M

class Promote {
    public static void main(String args[]) {
	byte b = 42;
	char c = 'a';
	short s = 1024;
	int i = 50000;
	float f = 5.67f;
	double d = .1234;
	double result = (f * b) + (i / c) - (d * s);
	System.out.println((f * b) + " + " + (i / c) + " - "+(d * s));
	System.out.println("result = "+ result);
    }
}

// Task to do. Complete
class IfElse {
    public static void main(String args[]) {
	String season;

	int month[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	String months[] = {"jan", "feb", "march", "april", "may", "june", "july", "august", "sept", "oct", "nov", "dec"};
	for(String x: months)
	    for (int y:month){
		if(y == 12 || y == 1 || y == 2)
	            season = "Winter";
		else if(y == 3 || y == 4 || y == 5)
	    	    season = "Spring";
		else if(y == 6 || y == 7 || y == 8)
		    season = "Summer";
		else if(y == 9 || y == 10 || y == 11)
		    season = "Autumn";
		else
		    season = "Bogus Month";
	        System.out.println(x +" is in the " + season + ".");
	    }
    }
}


class NoBody{
    public static void main(String args[]) {
	int i, j;
	
	i = 100;
	j = 200;

	while(++j < --j); 

	System.out.println("Midppoint is  " + i);

    }
}
// this can be written more effificiently using the do-while loop as
class While{
    public static void main(String args[]) {
	int n = 10;

	do {
	    System.out.println("tick " + n);
	    } while(---n > 0);

    }
}
class StringSwitch {
    public static void main(String args[]) {
	String str = "two";
	switch(str) {
	    case "one":
		System.out.println("one");
		break;
	    case "two": 
		System.out.println("two");
		break;
	    default:
		System.out.println("no match");
	}

    }
}

class While{
    public static void main(String args[]) {
	int n = 10;

	while(n > 0) {
	    System.out.println("Hello there! " + n);
	    n--;
	}

    }
}

class NoBody{
    public static void main(String args[]) {
	int i, j;
	
	i = 100;
	j = 200;

	while(++j < --j); 

	System.out.println("Midppoint is  " + i);

    }
}

import java.util.Scanner;
public class Mul{
    public static void main(String[] args) {
	Scanner console=new Scanner(System.in);
	int num;
	int i =1;
	int a =1;	

	System.out.print("Enter a number ");
	num = console.nextInt();
	while (i <= num) {
	    a *= i;
	    i++;
	    System.out.println(a);
	}
    }
}

class forLoop {
    public static void main(String[] args) {
	int n;
	for(n=5; n>1; n--)
	    System.out.println("Hello there! " + n);
	}
    }
}

class ExistLoop {
    public static void main(String[] args) {
	for(int i=0; i<20; i++) {
	    if (i %2 == 0) break;
	    System.out.println("i is " + i);
	}
	System.out.println("Done !");
    }
}

class justcontinue {
    public static void main(String[] args) {
	for(int i=0; i<8; i++) {
	    System.out.print(i + " ...");
	    if (i %2 == 0) continue;
	    System.out.print("..." );
	}
	System.out.println("Done !");
    }
}