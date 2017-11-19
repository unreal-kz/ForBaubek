import java.util.Scanner;

public class RectangleTest {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	Rectangle r1=new Rectangle();

	System.out.println("What is the width? ");
    r1.width=in.nextInt();
	
    System.out.println("What is the length? ");
    r1.length=in.nextInt();
    r1.area=r1.width*r1.length;
    
     		
   
	System.out.println("Rectangle area is  "+r1.area);
	
}
}
