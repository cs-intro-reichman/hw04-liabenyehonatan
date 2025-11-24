public class Primes {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        int num = Integer.parseInt(args[0]);
        printPrimesUpTo(num);
    }

    public static void printPrimesUpTo(int num) {

        boolean isPrime[] = new boolean[num + 1];

        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;

        }
        int p = 2;

        while (p * p <= num) {
            if (isPrime[p]) {
                int multiple = p * p;
                while (multiple <= num) {
                    isPrime[multiple] = false;
                    multiple += p;
                }
            }
            p++;

        }

        System.out.println("Prime numbers up to " + num + ":");

        int count = 0;

        for (int g = 2; g <= num; g++) {
            if (isPrime[g] == true) {
                System.out.println(g);
                count++;
            }
        }
        System.out.println(
                "There are " + count + " primes between 2 and " + num + " (" + (count * 100 / num) + "% are primes)");

    }
}
