public class Main {

    public static void main(String[] args) {
	// bir oyunda puan hesaplama örneği üzerinden abstract classları anlamaa dayalı bir proje.

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        GameCalculator gameCalculator = new WomanGameCalculator()
    }
}
