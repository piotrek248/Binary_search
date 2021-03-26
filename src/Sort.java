public class Sort {
    int[] data;
    int size;

    public Sort(int size){
        this.size = size;
    }

    public int[] sort() {
        GenerateNum generateNum = new GenerateNum();
        data = new int[size];
        data = generateNum.rand(size);
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j + 1];
                    this.data[j + 1] = this.data[j];
                    this.data[j] = temp;
                }
            }
        }
        return data;
    }
}
