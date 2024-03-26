import java.lang.*;
class RegularPolygon{
   private int n;
   private double side;
   private double x;
   private double y;
   public RegularPolygon(){
       n=3;
       side=1;
       x=y=0;
   }
   public RegularPolygon(int m,double len){
       n=m;
       side=len;
       x=y=0;
   }
   public RegularPolygon(int m,double len,double a,double b){
       n=m;
       side=len;
       x=a;
       y=b;
   }
   public void setNumberOfSide(int m){
       n=m;
   }
   public void setSideLength(double len){
       side=len;
   }
   public void setXcoordinate(double a){
       x=a;
   }
   public void setYcoordinate(double b){
       y=b;
   }
   public int getNumberOfSide(){
       return n;
   }
   public double getSideLength(){
       return side;
   }
   public double getXcoordinate(){
       return x;
   }
   public double getYcoordinate(){
       return y;
   }
   //finds perimeter
   public double getPerimeter(){
       return n*side;
   }
   //find area
   public double getArea(){
       double area=(n*side*side)/(Math.tan(Math.PI/n)*4);
       return area;
   }
}
class RegularPolygonMain{
   public static void main(String args[]){
       RegularPolygon p1=new RegularPolygon();
       RegularPolygon p2=new RegularPolygon(6,4);
       RegularPolygon p3=new RegularPolygon(10,4,5.6,7.8);
       System.out.println("Polygon 1 perimeter: "+p1.getPerimeter()+"\n");
       System.out.println("Polygon 1 area: "+p1.getArea()+"\n");
       System.out.println("Polygon 2 perimeter: "+p2.getPerimeter()+"\n");
       System.out.println("Polygon 2 area: "+p2.getArea()+"\n");
       System.out.println("Polygon 3 perimeter: "+p3.getPerimeter()+"\n");
       System.out.println("Polygon 3 area: "+p3.getArea()+"\n");

   }
}