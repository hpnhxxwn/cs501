# Palindrome Pairs
### Solution code:
```
public class Solution {
    class TrieNode {
        TrieNode[] dict;
        int idx;
        List<Integer> l;
        TrieNode(){
            dict=new TrieNode[26];
            idx=-1;
            l=new ArrayList<Integer>();
        }
    }
    TrieNode root;
    
    public void addWord(String word, int idx){
        TrieNode node=root;
        for(int i=word.length()-1; i>=0; i--){
            int j=word.charAt(i)-'a';
            if(node.dict[j]==null)
                node.dict[j]=new TrieNode();
            if(Valid(word, 0, i)){
                node.l.add(idx);
            }
            node=node.dict[j];
        }

        node.idx=idx;
        node.l.add(idx);
    }
    public void searchWord(String word, int idx, List<List<Integer>> r) {
        TrieNode node=root;
        
        for(int i=0; i<word.length(); i++){
            if(node.idx>=0 && node.idx!=idx && Valid(word, i, word.length()-1)){
                r.add(Arrays.asList(idx, node.idx));
            }
            int j=word.charAt(i)-'a';
            node=node.dict[j];
            if(node==null)  return;
            
        }

        for(int i:node.l){
            if(i!=idx){
                r.add(Arrays.asList(idx, i));
            }
        }
    }
    public List<List<Integer>> palindromePairs(String[] words) {
        if(words.length<2)  return new ArrayList<List<Integer>>();
        
        List<List<Integer>> r=new ArrayList<List<Integer>>();
        root=new TrieNode();
        for(int i=0; i<words.length; i++){
            addWord(words[i], i);
        }
        
        for(int i=0; i<words.length; i++)   searchWord(words[i], i, r);
        return r;
    }
    
    public boolean Valid(String w, int i, int j){
        while(i<j){
            if(w.charAt(i++)!=w.charAt(j--))  return false;
        }
        return true;
    }
    
}
```

### Test case:
```
["abcd","dcba","lls","s","sssll"]
```
```
[]
```
```
["abcd"]
```
```
["abcd", "lls"]
```
```
["a", "ab"]
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-11%20%E4%B8%8B%E5%8D%886.26.52.png?raw=true)
