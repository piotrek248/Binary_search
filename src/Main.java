public class Main {
    public static void main(String[] args) {
        Sort sort = new Sort(100);

        int[] tablica = sort.sort();

        for(int i:tablica){
            System.out.print(i + " ");
        }

        Finder finder = new Finder(58, tablica);
        System.out.println();
        finder.divideTable();
    }
}
