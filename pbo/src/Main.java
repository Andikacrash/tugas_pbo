public class Main {
    public static void main(String[] args) {
        // Program Utama
        System.out.println("Hello, World!");

        // Variabel
        int number = 5;

        // Tipe Data
        float floatNumber = 3.14f;

        // Perulangan For
        for (int i = 0; i < 5; ++i) {
            System.out.print(i + " ");
        }

        // Pernyataan If
        if (number > 0) {
            System.out.println("Angka positif.");
        }

        // Perulangan While
        int whileCounter = 0;
        while (whileCounter < 3) {
            System.out.print(whileCounter + " ");
            whileCounter++;
        }

        // Perulangan Do-While
        int doWhileCounter = 0;
        do {
            System.out.print(doWhileCounter + " ");
            doWhileCounter++;
        } while (doWhileCounter < 3);

        // Array Satu Dimensi
        int[] oneDimArray = {1, 2, 3, 4, 5};

        // Array Multidimensi
        int[][] twoDimArray = {{1, 2, 3}, {4, 5, 6}};

        // Input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int userInput = scanner.nextInt();

        // Output
        System.out.println("Input pengguna: " + userInput);

        // Komentar
        // Ini adalah komentar satu baris

        /*
        Ini adalah
        komentar multi-baris
        */
    }
}
