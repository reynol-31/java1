package pkg1;
class MyPoint{
	private int x;
	private int y;
	public MyPoint() {
		this.x=0;
		this.y=0;}
	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;}
	public void setXY(int x, int y) {
		this.x=x;
		this.y=y;}
	public int[] getXY() {
		int[] points= {x,y};
		return points;}
	public double distance(int x, int y) {
		int xDiff=this.x-x;
		int yDiff=this.y-y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);}
	public double distance() {
		return Math.sqrt(x*x + y*y);}}
public class TestMypoint {
    public static void main(String[] args){
        MyPoint point1=new MyPoint();
        MyPoint point2=new MyPoint(3,4);
        point1.setXY(1,2);
        int[]points=point1.getXY();
        System.out.print("Point1 coordinates are ");
        System.out.print(points[0]+","+points[1]+"\n");
        System.out.println(point1.distance(5,6));
        System.out.println(point1.distance()); 
    }
}
