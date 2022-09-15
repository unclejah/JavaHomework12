public interface UpdateTyreInterface {
   default void updateTyre(Bicycle bicycle){
       System.out.println("Меняем покрышку");
   };
    default void updateTyre(Car car){
        System.out.println("Меняем покрышку");
    };
    default void updateTyre(Truck truck){
        System.out.println("Меняем покрышку");
    };
}
