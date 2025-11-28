package practice_6.restaurant_manager;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        manager.addNewOrder("Картошка фри");
        manager.addNewOrder("Спагетти");
        manager.addNewOrder("Маргаритта");
        manager.printOrders();

        manager.deleteOrder("Спагетти");
        manager.printOrders();


    }
}
