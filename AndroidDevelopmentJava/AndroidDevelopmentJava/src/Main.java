public class Main extends ClassA{
    public static void main(String[] args) {
//        Child child = new Child();
//        child.show(); // I'm child will be called
//
//        Parent parent = new Parent();
//        parent.show(); // I'm parent will be printed
//
//        Parent parent1 = new Child();
//        parent1.show(); // I'm child will be called
//                        // because the instance is of the child class
//
////        parent1.display(); // this method is not defined in parent class, so it will display an error;
        Main main = new Main();
        main.count();

            }
            public void count(){
                int sum = super.add(5, 6);
                ClassB b  = new ClassB();
                System.out.println(sum);
                System.out.println(b.multiply(3, 4));
            }
}