/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
       
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;

        queue.add(root);

       while(!queue.isEmpty()){
            int size = queue.size();
            
            List<Integer> list = new ArrayList<>();
            for(int i=0 ;i<size ;i++){
                //preparing each level list
                list.add(queue.peek().val);
                //traversing the kids
                List<Node> children = queue.poll().children;
                
                if(children.size()!=0){
                    for(int j=0 ;j<children.size() ;j++){
                        queue.add(children.get(j));
                    }
                }
                
            }
           //Adding levels to and answer
            res.add(list);

       }
       
       return res;
    }
}
