class Point
{
    int x,y;
    void printThisObject()
    {
        System.out.println(this);
    }
}
class ThisKeyWordIntro {
    public static void main(String[] args) {
        Point p1= new Point();
        System.out.println(p1);
        p1.printThisObject();
    }
}
