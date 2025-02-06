package ElementaryProgramming;

public class SieveOfErathosthenes {
    

    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n + 1];
        sieve(n, prime);
    }


    public static void sieve(int n,boolean[] primes){

        for(int i = 2;i<=Math.sqrt(n);i++){
            if(!primes[i]){
                for(int j = i*2;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }

        for(int i = 2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
