class Trie {
    TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word){
        TrieNode r = root;
        
        for(char c : word.toCharArray()){
            int ix = c-'a';
                
            if(r.children[ix] == null)
                r.children[ix] = new TrieNode();
            
            r = r.children[ix];
        }
        
        r.isEnd = true;
    }
}

class TrieNode {
    TrieNode[] children;
    boolean isEnd;
    
    public TrieNode(){
        children = new TrieNode[26];
    }
}

class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        if(words.length == 0) 
            return new ArrayList<String>();
        
        Trie trie = new Trie();
        Set<String> result = new HashSet<>();
        
        for(String word : words){
            trie.insert(word);
        }
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++) {
                dfs(board, i, j, result, trie.root, "");
            }
        }
        
        return new ArrayList<>(result);
    }
    
    private void dfs(char[][] board, int i, int j, Set<String> result, TrieNode trie_node, String s) {
        char b = board[i][j];
        
        if (b == '$')
            return;
        
        board[i][j] = '$';
        
        TrieNode t = trie_node.children[b-'a'];
        
        if(t != null){
            String str = s+b;
            
            if(t.isEnd)
                result.add(str);
            
            if(i>0) dfs(board, i-1, j, result, t, str);
            if(j>0) dfs(board, i, j-1, result, t, str);
            if(i < board.length-1) dfs(board, i+1, j, result, t, str);
            if(j < board[0].length-1) dfs(board, i, j+1, result, t, str);
        }
        
        board[i][j] = b;
    }
}
