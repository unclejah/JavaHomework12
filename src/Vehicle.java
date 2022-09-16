public class Vehicle implements UpdateTyreInterface,CheckEngineInterface{

    @Override
    public void checkEngine(Car Car) {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkEngine(Truck truck) {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void updateTyre(Bicycle bicycle){
        System.out.println("Меняем покрышку");
    }

    @Override
    public void updateTyre(Car car) {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void updateTyre(Truck truck) {
        System.out.println("Меняем покрышку");
    }

}
