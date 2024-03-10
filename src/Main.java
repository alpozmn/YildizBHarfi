public class Main {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        // B harfinin çizileceği çok boyutlu dizi
        char[][] bArray = new char[height][width];

        // B harfini oluşturma
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1 || (i == 0 && j < width - 1) || (i == height / 2 && j < width - 2)
                        || (i == height - 1 && j < width - 1)) {
                    bArray[i][j] = '*'; // Yıldız yerleştirme
                } else {
                    bArray[i][j] = ' '; // Boşluk yerleştirme
                }
            }
        }

        // B harfini ekrana yazdırma
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(bArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
