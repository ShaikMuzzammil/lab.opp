class Delivery {
    void deliverItem() {
        System.out.println("Delivering item...");
    }
}

class FoodDelivery extends Delivery {
    @Override
    void deliverItem() {
        System.out.println("Delivering food with priority...");
    }
}

class ParcelDelivery extends Delivery {
    @Override
    void deliverItem() {
        System.out.println("Delivering parcel with tracking...");
    }
}

public class Overriding_1 {
    public static void main(String[] args) {
        Delivery delivery;

        delivery = new FoodDelivery();
        delivery.deliverItem();

        delivery = new ParcelDelivery();
        delivery.deliverItem();
    }
}