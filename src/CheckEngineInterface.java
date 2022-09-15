public interface CheckEngineInterface {

    default void checkEngine(Bicycle bicycle){
        System.out.println("Проверяем двигатель");
    };
    default void checkEngine(Car car){
        System.out.println("Проверяем двигатель");
    };
    default void checkEngine(Truck truck){
        System.out.println("Проверяем двигатель");
    };
}
