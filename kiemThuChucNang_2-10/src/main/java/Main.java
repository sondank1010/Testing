import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y;
        x = sc.nextFloat();
        y = sc.nextFloat();

        QualityAssessment qa = new QualityAssessment();

        String result = qa.quality(x, y);
        System.out.println(result);

    }
}