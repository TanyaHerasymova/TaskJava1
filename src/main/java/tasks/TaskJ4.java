package tasks;

public class TaskJ4 {
        public static void main(String[] args) {
            String name = "Tatyana";
            int i = 0;
            do {
                int j = 0;
                do {
                    System.out.print(name + " ");
                    j++;
                } while (j < 10);
                System.out.println();
                i++;
            } while (i < 5);
        }

}
