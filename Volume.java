public class Volume{
  public double Volume (int method, double width, double length, double height, double radius){
    
    int cube = 30000;
    int rectP = 30001;
    int cyl = 30010;
    int sph = 30011;
    int cone = 30100;
    int pyra = 30101;
    
    if (method == cube || method == rectP){
      double v = width*length*height;
    	return v;
    }
		
		if (method == cone){
			double v = 1/3*(Math.PI*(radius*radius)*height);
			return v;
		}
		
		if (method == sph){
			double v = 4/3*(Math.PI*(radius*radius*radius));
			return v;
		}
		
		if (method == cyl){
			double v = Math.PI*(radius*radius)*height;
			return v;
		}
		
		if(method == pyr){
			double v = 1/3*(width*length)*height;
			return v;
		}
		
		return null;
  }
}
