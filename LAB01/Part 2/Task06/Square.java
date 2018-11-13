public class Square{
  
  private double height;
  private double width;
  
  public Square(){
    this.height = 0;
    this.width = 0;
  }
  
  public double getHeight(){
    return height;
  }
  
  public void setHeight(double h){
    this.height = h;
  }
  
  public double getWidth(){
    return width;
  }
  
  public void setWidth(double w){
    this.width = w;
  }
  
  public double getArea(){
    return height*width;
  }
  
}
