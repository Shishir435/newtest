import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String heights = sc.next().toString();
        String weights = sc.next().toString();
        int height = Integer.parseInt(heights);
        int weight = Integer.parseInt(weights);
        System.out.println(height);
        System.out.println(weight);
    }
}
