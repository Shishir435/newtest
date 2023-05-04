public class Keywords {
    int a;
    final int b = 3;
    public void demo(){
        int a;
        a =11;
        System.out.println(a);

        this.a=7;
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        Keywords keywords = new Keywords();
        keywords.demo();

    }
}
