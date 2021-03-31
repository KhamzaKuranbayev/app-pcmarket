package uz.pdp.apppcmarket.constants;

public enum OrderStatus {

    Cancelled("Buyurtma bekor qilindi"),
    Delivered("Buyurtma etkazib berildi"),
    Problem("Buyurtma muammosi"),
    Processing("Buyurtmani qayta ishlash"),
    Returned("Buyurtma qaytarildi");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
