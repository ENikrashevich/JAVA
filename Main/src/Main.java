public class Main {
    public static void main(String[] args) {
        FigureInterface i;
        i = new Square(10, 20);
        System.out.println(i.area());
    }
}

class Figure{
    protected String color;
    private  String type;

    Figure(String color, String type){
        this.color = color;
        this.type = type;
    }
    public final void color(){
        System.out.println(color);
    }
    public final void type(){
        System.out.println(type);
    }
}

class Rectangle extends Figure{
    private int width;
    private int height;

    Rectangle(int width, int height, String color){
        super(color, "Rectangle");
        this.width = width;
        this.height = height;
    }
    public void width(){
        System.out.println(width);
    }
    public void height(){
        System.out.println(height);
    }
}