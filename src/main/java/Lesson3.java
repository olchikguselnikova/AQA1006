public class Lesson3 {
    public static void main(String[] args) {
        int[] mass = new int[]{-5, -10, 20, 46, 51, -6, 0, 10, 35, 27, 6, 5, 45, -15, 14, 8, 63, 51, -7, 21};
        String words = "Blablb, albalbflas, alblblbfa";

        Lesson9.stringToSet(words);

        int sum = 0;
        for (int a = 0; a < mass.length; a++) {
            if (mass[a] > 5 && mass[a] < 45) {
                sum = sum + mass[a];
            }
        }
        System.out.println("SUM = " + sum);


        for (int i = 0; i < mass.length; i++) {
            if ((mass[i] % 2) == 0 && mass[i] > 0)
                System.out.println(mass[i]);
        }
    }
}


