public class MyRectangle2D {
    private double x;  
    private double y;   
    private double width; 
    private double height;

    public MyRectangle2D() {
        this.x = 0.0;
        this.y = 0.0;
        this.width = 1.0;
        this.height = 1.0; 
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
     
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        double left = this.x - width / 2;
        double right = this.x + width / 2;
        double up = this.y + height / 2;
        double down = this.y - height / 2;
        
        return (x >= left && x <= right && y <= up && y >= down);
    }

    public boolean contains(MyRectangle2D r) {
        return this.contains(r.getX() - r.getWidth() / 2, r.getY() - r.getHeight() / 2) &&
           this.contains(r.getX() + r.getWidth() / 2, r.getY() - r.getHeight() / 2) &&
           this.contains(r.getX() - r.getWidth() / 2, r.getY() + r.getHeight() / 2) &&
           this.contains(r.getX() + r.getWidth() / 2, r.getY() + r.getHeight() / 2);
     }

     public boolean overlaps(MyRectangle2D r) {
        double thisleft = this.x - width / 2;
        double thisright = this.x + width / 2;
        double thisup = this.y + height / 2;
        double thisdown = this.y - height / 2;
        
        double otherleft = r.getX() - r.getWidth() / 2;
        double otherright = r.getX() + r.getWidth() / 2;
        double otherup = r.getY() + r.getHeight() / 2;
        double otherdown = r.getY() - r.getHeight() / 2;
        
        return thisleft < otherright && thisright > otherleft &&
               thisup > otherdown && thisdown < otherup;
    }

    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(3, 2, 6.5, 5.9);
        System.out.println("面積: " + r1.getArea() + " 周長: " + r1.getPerimeter());
        System.out.println("(4,4) in rectangle？ " + r1.contains(4, 4));
        System.out.println("Specific rectangle in r1 rectangle? " + r1.contains(new MyRectangle2D(5, 6, 11.5, 4.2)));
        System.out.println("Specific rectangle overlap r1 rectangle? " + r1.overlaps(new MyRectangle2D(4, 6, 3.3, 6.4)));
    }
}

