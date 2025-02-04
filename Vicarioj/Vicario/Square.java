package Vicarioj.Vicario;

public class Square extends Shape {
    private double edge;

    public double getEdge()
     {
        return edge;
     }

     public void setEdge(double edge) {
        System.out.println("Shape::setEdge()");
        this.edge = edge;
        super.setArea(area);
     }

     public double getArea(){
        return  super.getArea();
     }

     public void setArea(double area){
        super.setArea(edge*edge);
     }
}
