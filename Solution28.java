class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> adj = new HashMap<>();
        Stack<String> stack = new Stack<>();
        List<String> itinerary = new ArrayList<>();
        
        for(List<String> ticket : tickets){
            adj.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            adj.get(ticket.get(0)).add(ticket.get(1));
        }
        
        stack.push("JFK");
        
        while(!stack.isEmpty()){
            String src = stack.peek();
            
            if(adj.get(src) == null || adj.get(src).peek() == null){
                itinerary.add(src);
                stack.pop();
            }else{
                String dest = adj.get(src).poll();
                stack.push(dest);
            }
        }
        
        Collections.reverse(itinerary);
        
        return itinerary;
    }
}
