#include <iostream>
using namespace std;

int main() {
    // Program Utama
    std::cout << "Hello, World!" << std::endl;

    // Variabel
    int number = 5;

    // Tipe Data
    float floatNumber = 3.14;

    // Perulangan For
    for (int i = 0; i < 5; ++i) {
        std::cout << i << " ";
    }

    // Pernyataan If
    if (number > 0) {
        std::cout << "Angka positif." << std::endl;
    }

    // Perulangan While
    int whileCounter = 0;
    while (whileCounter < 3) {
        std::cout << whileCounter << " ";
        whileCounter++;
    }

    // Perulangan Do-While
    int doWhileCounter = 0;
    do {
        std::cout << doWhileCounter << " ";
        doWhileCounter++;
    } while (doWhileCounter < 3);

    // Array Satu Dimensi
    int oneDimArray[5] = {1, 2, 3, 4, 5};

    // Array Multidimensi
    int twoDimArray[2][3] = {{1, 2, 3}, {4, 5, 6}};

    // Input
    int userInput;
    std::cout << "Masukkan sebuah angka: ";
    std::cin >> userInput;

    // Output
    std::cout << "Input pengguna: " << userInput << std::endl;

    // Komentar
    // Ini adalah komentar satu baris

    /*
    Ini adalah
    komentar multi-baris
    */

    return 0;
}

