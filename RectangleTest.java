import java.util.Scanner;

public class RectangleTest {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	Rectangle r1=new Rectangle();
	int width = 0;
	int length = 0;
	System.out.println("What is the width? ");
    	width=in.nextInt();	
    	System.out.println("What is the length? ");
    	length=in.nextInt();	
   
	System.out.println("Rectangle area is  "+r1.getArea(length,width);
	
}
}
