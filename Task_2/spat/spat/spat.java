package spat;

/**
*
* @author AnriTool
*/

public class spat {
	 public static void main(String[] args) {
		 Box b = new Box(5);
		 Cylinder c = new Cylinder(3,4);
		 System.out.println(b.getFree());
		 while(b.add(c)) {
			 System.out.println(b.getFree() + " " + c.getVolume());
			 System.out.println("DA");
		 }  
	 }
}
