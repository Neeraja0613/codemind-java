class StraightLine
{
    Point p1,p2;
    StraightLine(Point p1, Point p2)
    {
        this.p1=p1;
        this.p2=p2;
    }
    double getLength()
    {
        return Math.sqrt(Math.pow(p2.x-p1.x,2) + Math.pow(p2.y-p1.y,2));
    }
}
class Point
{
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class LengthOfStraightLine {
    public static void main(String[] args) {
        //Point x= new Point(4,5);
        //Point y= new Point(7,9)
        StraightLine s1= new StraightLine(new Point(4,5), new Point(7,9));
        System.out.println(s1.getLength());
    }
}
