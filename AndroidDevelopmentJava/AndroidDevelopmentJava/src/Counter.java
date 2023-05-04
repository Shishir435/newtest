public class Counter {
    static int count =0; // this will retain its value;
//    int count =0; // memory will be re-allocated after each instance creation
    public Counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
