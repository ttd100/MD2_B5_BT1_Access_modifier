package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle(5,"blue");
        System.out.println("ban kinh la: "+circle.getRadius());
        System.out.println("dien tich la: "+circle.getArea());
    }
}