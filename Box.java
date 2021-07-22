public class Box {
    int size = 0;

    public static void main(String[] args) {
        Box Box1 = new Box();
        Box1.size = 5;
        Box1.printBox();
    }
    void printBox() {
        for (int r = 0; r < size; r++) {

            for (int c = 0; c < size; c++) {

                System.out.print("*");
            }
                System.out.println();
        }
    }
}

