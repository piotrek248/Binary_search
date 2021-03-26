import java.util.Random;

public class GenerateNum {
    public int[] rand(int size) {
        int[] container = new int[size];
        Random generateRandom = new Random();
        for (int i = 0; i < size; i++) {
            container[i] = generateRandom.nextInt(size);
        }
        return container;
    }
}
