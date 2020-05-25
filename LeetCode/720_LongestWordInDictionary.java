//


class Solution {
    private TrieNode root = new TrieNode();
    class TrieNode{
        String word = "";
        TrieNode[] children = new TrieNode[26];
    }
    public String longestWord(String[] words) {
        if (words == null || words.length == 0){
            return "";
        }
        
        for (String word : words){
            TrieNode cur = root;
            for (char c : word.toCharArray()){
                if (cur.children[c - 'a'] == null){
                    cur.children[c - 'a'] = new TrieNode();
                }
                cur = cur.children[c - 'a'];
            }
            cur.word = word;
        }
        return dfs(root);
    }
    
    public String dfs(TrieNode node){
        String res = node.word;
        for (TrieNode child : node.children){
            if (child != null && child.word.length() != 0){
                String childWord = dfs(child);
                if (childWord.length() > res.length() || (childWord.length() == res.length() && childWord.compareTo(res) < 0)){
                    res = childWord;
                }
            }
        }
        return res;
    }
}