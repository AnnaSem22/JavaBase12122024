package app;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        String name = "Lisa";
        String produkt = "smartphone";
        double suma = 305.99;
        String street = "Moon";
        short home = 10;

        System.out.println("Order № " + number);
        System.out.println("Client: " + name);
        System.out.println("Product: " + produkt);
        System.out.println("price EUR " + suma);
        System.out.println("Address: " + street);
        System.out.println(" Street, " + home);

        number = number + 1;
        name = "Sofe";
        produkt = "laptop";
        suma = 570.95;
        street = "Terra";
        home = 17;
        System.out.println("Order № " + number);
        System.out.println("Client: " + name);
        System.out.println("Product: " + produkt);
        System.out.println("price EUR " + suma);
        System.out.println("Address: " + street);
        System.out.println(" Street, " + home);
    }
}
