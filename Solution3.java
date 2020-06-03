class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int cost = 0;
        
        Arrays.sort(costs, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return (a[0]-b[0])-(a[1]-b[1]);
            }
        });
        
        for(int i=0; i<costs.length; i++){
            if(i < costs.length/2)
                cost += costs[i][0];
            else{
                cost += costs[i][1];
            }
        }
        
        return cost;
    }
}
