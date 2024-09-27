package objectExercise;

public class Apartment extends Property {
    private String layout; // 間取り

    public Apartment(String name, String owner, int price, String layout) {
        super(name, owner, "マンション", price);
        this.layout = layout;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("間取り：" + layout);
        System.out.println("=============================");
    }
}