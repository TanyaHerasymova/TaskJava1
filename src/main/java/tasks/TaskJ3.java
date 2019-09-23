package tasks;

public class TaskJ3 {
    public static void main(String[] args) {
        String name = "Tatyana";
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 10) {
                System.out.print(name + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
