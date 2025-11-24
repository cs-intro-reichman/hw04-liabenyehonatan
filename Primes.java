public class Primes {
    public static void main(String[] args) {

    }

    public static void printPrimesUpTo(int n) {

        boolean isPrime[] = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;

        }
        int p = 2;

        while (p * p <= n) {
            if (isPrime[p]) {
                int multiple = p * p;
                while (multiple <= n) {
                    isPrime[multiple] = false;
                    multiple += p;
                }
            }
            p++;

        }

        System.out.println("Prime numbers up to " + n + ":");

        int count = 0;

        for (int g = 2; g <= n; g++) {
            if (isPrime[g] == true) {
                System.out.println(g);
                count++;
            }
        }
        System.out.println(
                "There are " + count + " primes between 2 and " + n + " (" + (count * 100 / n) + "% are primes)");

    }
}
