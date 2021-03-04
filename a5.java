public class a5 {
    public static void main(String args[]) {
        Factory s=new Factory();
        Audi udi = (Audi) s.create("Audi");
        udi.drive();
        Toyota t=(Toyota) s.create("Toyota");
        t.changes("pokrishki");
    }
}
    interface Car {
    void drive();
    }
    class Toyota implements Car{
        @Override
        public void drive() {
            System.out.println("Drive Toyota");
        }
        public void changes(String c){
            System.out.println("Changes "+c);
        }
    }
    class Audi implements Car{
        @Override
        public void drive() {
            System.out.println("Drive Audi");
        }
    }
    class Factory {
        public Car create(String typeofcar){
            switch (typeofcar){
                case "Toyota":return new Toyota();
                case "Audi":return new Audi();
                default:return null;
            }
    }}

