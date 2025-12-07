

public class Rectangle{
    
        double length;
        double  breadth;
        double  area;
        double perimeter;

        public Rectangle( double length , double breadth){
            this.length=length;
            this.breadth=breadth;
        }
        void areaOfRectangle(){
          double  area = length*breadth;
          System.out.println("Area of rectanglr" +area);
            

        }
        void perimeterOfRectangle(){
           double perimeter = 2 * (length + breadth);
           System.out.println("Perimeter of rectangle" +perimeter);
        }
       
    
}
