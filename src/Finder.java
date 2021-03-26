public class Finder {
    public int[] data;
    int number;
    int pozycja;
    int max;
    int min;

    public Finder(int number, int[] data){
        this.number = number;
        this.pozycja = 0;
        this.min = 0;
        this.max = data.length - 1;

        this.data = new int[data.length];
        for (int i: data) {
            this.data[i] = data[i];
        }
    }

    public void divideTable() {

        while(min <= max) {
            int target = (min + max) / 2;
            if (number == data[target]){
                System.out.print("Znaleziono " + data[target]);
                break;
            }
            else if (number < data[target]){
                System.out.print("|Min " + min + ". " + "Max " + max + "| ");
                    max = target - 1;
            }
            else if (number > data[target]){
                System.out.print("|Min " + min + ". " + "Max " + max + "| ");
                    min = target + 1;
            }
        }
    }
}
