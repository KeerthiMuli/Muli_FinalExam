package question5;
import java.util.Comparator;
public class ComparableCircle extends Circle implements Comparable<Circle> {

	
	public ComparableCircle(int radius) {
		super(radius);
		
	}

	@Override
	public int compareTo(Circle o) {
		Circle c1=this;
		Circle c2=o;
		
		Integer Area1=(int) c1.Area();
		Integer Area2=(int) c2.Area();
		Integer Result=-(Area1.compareTo(Area2));
		return Result ;
		
	   
				
				

	
	}
}
