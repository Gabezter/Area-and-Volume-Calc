public class Area{

  public double Area(int method, double length, double width, double radius, double widthB, double perimeter){

    int sq = 20000;
    int rect = 20001;
    int circ = 20010;
    int tri = 20011;
    int hexa = 20100;
    int para = 20101;
    int trap = 20110;
    int penta = 20111;
    int poly = 21000;
    
    if(method == sq || method == rect || method = para){
      double a = lenth*width;
      return a;
    }
    
    if(method == circ){
      double a = 2*Math.PI*radius;
      return a;
    }
    
    if (method == tri){
      double a = 0.5*width*length;
      return a;  
    }
    
    if(method == trap){
      double a = length*0.5*(width+widthB);
      return a;
    }
    
    if(method == hexa){
      double a = (3*Math.sqrt(3)/2)*(length*length)
      return a;
    }
    
    if(method == penta){
      double a = (.25*Math.sqrt(5(5+Math.sqrt(5)*2)))*(length*length);
      return a;
    }
    
    if(method == poly){
      double a = .5*length*perimeter;
      return a;
    }
     
    return null;
  }
}
    
