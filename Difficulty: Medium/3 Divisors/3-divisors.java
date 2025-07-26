// User function Template for Java
class Solution {
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q) {
        
         ArrayList<Integer> result = new ArrayList<>();

        
        long maxN = Collections.max(query);
        int limit = (int) Math.sqrt(maxN) + 1;

        
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        
        for (int i = 0; i < q; i++) {
            long n = query.get(i);
            int count = 0;
            for (int prime : primes) {
                long square = (long) prime * prime;
                if (square <= n)
                    count++;
                else
                    break;
            }
            result.add(count);
        }

        return result;
    }
}
    
