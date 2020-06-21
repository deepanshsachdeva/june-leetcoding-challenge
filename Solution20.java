class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<n; i++){
            numbers.add(i+1);
        }
        
        int[] factorial = new int[n+1];
        int sum = 1;
        factorial[0] = sum;
        
        for(int i=1; i<=n; i++){
            sum *= i;
            factorial[i] = sum;
        }
        
        k--;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<=n; i++){
            int ix = k/factorial[n-i];
            sb.append(String.valueOf(numbers.get(ix)));
            numbers.remove(ix);
            k-=ix*factorial[n-i];
        }
        
        return sb.toString();
    }
}
