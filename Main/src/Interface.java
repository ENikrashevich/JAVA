interface FigureInterface{
    public int area();
    String color = "Red";
}

class Square implements FigureInterface{
    private int width;
    private int height;
    Square(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int area(){
        return this.width * this.height;
    }
    public String toString(){
        return "СТРОКА";
    }
}