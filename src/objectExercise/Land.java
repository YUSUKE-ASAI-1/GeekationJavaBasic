package objectExercise;

public class Land extends Property {
    private double area; // 広さ

    public Land(String name, String owner, int price, double area) {
        super(name, owner, "土地", price);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("広さ：" + area + "㎡");
        System.out.println("=============================");
    }
}