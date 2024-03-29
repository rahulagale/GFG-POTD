class Solution {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here
        int count = 0;

        Map<String, Integer> fractionMap = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int gcd = gcd(numerator[i], denominator[i]);

            String fraction = (numerator[i] / gcd) + "/" + (denominator[i] / gcd);

            String diffFraction = (denominator[i] / gcd - numerator[i] / gcd) + "/" + (denominator[i] / gcd);


            if (fractionMap.containsKey(diffFraction)) {

                count += fractionMap.get(diffFraction);

            }

            fractionMap.put(fraction, fractionMap.getOrDefault(fraction, 0) + 1);

        }

        return count;

    }

    private static int gcd(int a, int b) {

        if (b == 0) {

            return a;

        }

        return gcd(b, a % b);
    }
}
        
