abstract class A{
    abstract void callme();
    void callmetoo(){
        System.out.println("call me too!");
    }
}
class B extends A{
    void callme(){
        System.out.println("Меня определили");
    }
    void callmetoo(){
        System.out.println("Меня переопределили");
    }
    public String toString(){
        System.out.println("Я ЕСТЬ СТРОКА");
        return "asdjgbaskjfsdfg";
    }
}