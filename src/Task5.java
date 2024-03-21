public class Task5 {

    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int count = 0;

        System.out.println("Generated numbers:");

        while (count < 10) {
            int randomNumber = (int) (Math.random() * 100) + 1;

            System.out.println(randomNumber);

            if (randomNumber > largest) {
                largest = randomNumber;
            }
            if (randomNumber < smallest) {
                smallest = randomNumber;
            }

            count++;
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
