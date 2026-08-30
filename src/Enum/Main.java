package Enum;

enum OrderStatus {

    PLACED(1, "Order Placed"),
    SHIPPED(2, "Order Shipped"),
    DELIVERED(3, "Order Delivered"),
    CANCELLED(4, "Order Cancelled");

    // Fields
    private int code;
    private String description;

    // Constructor
    OrderStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    // Getter
    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    // Custom method
    public boolean isCompleted() {
        return this == DELIVERED || this == CANCELLED;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return name() + " (" + code + ")";
    }
}


public class Main {

    public static void main(String[] args) {

        // 1. Accessing an enum constant
        OrderStatus status = OrderStatus.PLACED;

        System.out.println("Status: " + status);


        // 2. name()
        System.out.println(
            "Name: " + status.name()
        );


        // 3. ordinal()
        System.out.println(
            "Ordinal: " + status.ordinal()
        );


        // 4. Custom methods
        System.out.println(
            "Code: " + status.getCode()
        );

        System.out.println(
            "Description: " + status.getDescription()
        );

        System.out.println(
            "Completed: " + status.isCompleted()
        );


        // 5. values()
        System.out.println("\nAll statuses:");

        for (OrderStatus s : OrderStatus.values()) {

            System.out.println(
                s.name()
                + " | Code: "
                + s.getCode()
                + " | Description: "
                + s.getDescription()
            );
        }


        // 6. valueOf()
        String input = "SHIPPED";

        OrderStatus converted =
                OrderStatus.valueOf(input);

        System.out.println(
            "\nConverted: " + converted
        );


        // 7. == comparison
        OrderStatus s1 = OrderStatus.PLACED;
        OrderStatus s2 = OrderStatus.PLACED;

        System.out.println(
            "\ns1 == s2: " + (s1 == s2)
        );


        // 8. equals()
        System.out.println(
            "s1.equals(s2): " + s1.equals(s2)
        );


        // 9. compareTo()
        System.out.println(
            "PLACED compareTo DELIVERED: "
            + OrderStatus.PLACED.compareTo(
                OrderStatus.DELIVERED
            )
        );


        // 10. toString()
        System.out.println(
            "toString(): " + status.toString()
        );
    }
}