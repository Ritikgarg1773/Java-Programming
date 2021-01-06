package BinarySearch;

import java.math.BigInteger;
import java.util.*;

public class learn {
    class Tree{
        int val;
        Tree left;
        Tree right;
    }
    class LLNode {
    int val;
    LLNode next;
  }
    List<Integer> res = new ArrayList<>();
    public int[] solve18(Tree root) {
        // Write your code here
//        Given a binary tree root, return an inorder traversal of root as a list.
//
//An inorder traversal is a way of visiting all nodes in a tree where you:
//
//Recursively visit the left subtree.
//Visit the current node.
//Recursively visit the right subtree.
//Bonus: Can you do this iteratively?
        inorder(root);
        int[] result = new int[res.size()];
        for(int i=0;i<res.size();i++) result[i] = res.get(i);
        return result;
    }
    void inorder(Tree root){
        if(root == null)return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
    public Tree solve14(Tree root) {
        // Write your code here
        //Given a binary tree root, invert it so that its left subtree
        // and right subtree are swapped and the children are recursively inverted.
        if(root==null)
            return root;
        Tree left = solve14(root.left);
        Tree right = solve14(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    public int[] solve15(Tree root) {
        // Write your code here
        Queue<Tree> queue = new LinkedList();
        queue.add(root);
        ArrayList<Integer> array =new ArrayList<>();
        // array.add(root.val);
        while(!queue.isEmpty()){
            int size = queue.size();
            if(size != 0){
                Tree peek = queue.peek();
                array.add(peek.val);
            }

            while(size != 0){
                root = queue.remove();
                if(root.left != null)
                    queue.add(root.left);
                if(root.right != null)
                    queue.add(root.right);
                size--;
            }
        }
        // if(root)
        // array.add(root.val);
        int[] arr = array.stream().mapToInt(i -> i).toArray();
        return arr;
    }
    public Tree solve13(Tree root) {
        // Write your code here
        // if(root == null) return root;
        //sum the left and right of the subtree and replace its val with sum
        if(root.left==null && root.right==null) return root;
        if(root.left==null&&root.right!=null){
            root.val+=solve13(root.right).val;
            return root;
        }
        if(root.left!=null&&root.right==null){
            root.val+=solve13(root.left).val;
            return root;
        }
        root.val+=solve13(root.left).val+solve13(root.right).val;
        return root;
    }
    public boolean solve(String s) {
        //Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).
        //
        //For example, given the string ([])[]({}), you should return true.
        //
        //Given the string ([)] or (((), you should return false.

        // Write your code here

        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
    public int solve16(Tree root) {
        // Write your code here
//        Given the root to a binary tree, return the largest sum of any path that goes from the root to a leaf.
        if(root == null) return 0;
        return root.val + Math.max(solve16(root.left) , solve16(root.right));
    }
    public LLNode solve16(LLNode node) {
        // Write your code here
        //
        //here we are changing the node itself
        HashSet<Integer> set = new HashSet<>();
        LLNode curr = node;
        LLNode prev = null;
        while(curr!=null){
            int v = curr.val;
            if(set.contains(v)){
                prev.next = curr.next;
            }
            else{
                set.add(v);
                prev = curr;
            }
            curr = curr.next;
        }
        return node;
    }
    public int solve12(int[] A, int k) {
        // Write your code her
        // Given a list of integers A and an integer k, let's create a new set of possible elements { A[k], A[A[k]], A[A[A[k]]], ... } stopping before it's out of index.
        //
        //Return the size of this set, or -1 if it's infinite.
        int count = 0;
        while(count<=A.length){
            if(k>=A.length){
                return count;
            }
            k = A[k];
            count++;
        }
        return -1;
    }
    public String[] solve11(String s) {
        // Write your code here
//        Given a string s containing balanced parentheses "(" and ")", split them into balanced groups.
        int left=0;
        int right=0;
        String s1 ="";
        ArrayList<String> array = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                right++;
            }
            else{
                left++;
            }
            s1+=s.charAt(i);
            if(left == right){
                array.add(s1);
                s1= "";
            }
        }
        String[] arr = array.toArray(new String[0]);
        return arr;
    }
    public int solve19(int[][] grid) {
        // Write your code here
        // count the number of islands
        if(grid==null || grid.length==0||grid[0].length==0)
            return 0;

        int m = grid.length;
        int n = grid[0].length;

        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    count++;
                    merge(grid, i, j);
                }
            }
        }

        return count;
    }
    public void merge(int[][] grid, int i, int j){
        int m=grid.length;
        int n=grid[0].length;

        if(i<0||i>=m||j<0||j>=n||grid[i][j]!=1)
            return;

        grid[i][j]=-1;

        merge(grid, i-1, j);
        merge(grid, i+1, j);
        merge(grid, i, j-1);
        merge(grid, i, j+1);
    }
    public boolean solve19(String s) {
//        Given a string s, determine whether any permutation of it is a palindrome.
        int[] cnt = new int[26];
        for (char c: s.toCharArray())
            cnt[c-'a'] += 1;
        int odd = 0;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 == 1)
                odd++;
        }
        if (odd > 1)
            return false;
        else
            return true;
    }
    public Tree solve20(Tree node0, Tree node1) {
        // Write your code here
        //merge the two binary tree
        if(node0==null)return node1;
        if(node1==null)return node0;
        node0.val+=node1.val;
        node0.left= solve20(node0.left,node1.left);
        node0.right=solve20(node0.right,node1.right);
        return node0;
    }
    public int solve20(int[] a) {
        // Write your code here
        //maximum sum contiguous subarray
        int max_so_far = a[0];
        int curr_max = a[0];
        int size = a.length;
        for (int i = 1; i < size; i++)
        {
            curr_max = Math.max(a[i], curr_max+a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
    public boolean solve21(Tree root) {
        // Write your code here
//        Given a binary tree root, return whether for every node in the tree other than leaves,
//        its value is equal to the sum of its left child's value and its right child's value.
        if(root == null)return true;
        if(root.left==null &&root.right==null){
            return true;
        }
        int val = 0;
        if(root.left!=null)val+=root.left.val;
        if(root.right!=null)val+=root.right.val;
        return val==root.val && solve21(root.right) && solve21(root.left);
    }
    public int solve22(Tree root) {
        // Write your code here
//        Given a binary tree tree, return the level of the tree with minimum sum. Note that the level of a tree starts at 0.
        //here i had cal both the level with max sum and the sum
        if(root == null)return 0;
        int res = root.val;
        int minlevel = 0;
        int level = 0;
        Queue<Tree> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            // int temp = count;
            int count = q.size();
            int sum = 0;
            while(count>0){
                Tree r = q.remove();
                sum+=r.val;
                if(r.left!=null)q.add(r.left);
                if(r.right!=null)q.add(r.right);
                count--;
            }
            if(sum<res){
                res=sum;
                minlevel=level;
            }
            // res = Math.max(sum,res);
            level++;

        }
        return minlevel;

    }
    public int solve23(Tree root, String[] moves) {
        // Write your code here
        //You are given a tree root and a list of strings moves consisting of "RIGHT", "LEFT" and "UP". Starting from root, traverse the tree by performing each move in moves where:
        //
        //"RIGHT" means to traverse to the right child.
        //"LEFT" means to traverse to the left child.
        //"UP" means to traverse to its parent.
        Tree temp = root;
        Stack<Tree> s = new Stack<>();
        for(int i =0;i<moves.length;i++){
            if(moves[i].equals("RIGHT")){
                s.push(temp);
                temp = temp.right;
            }
            if(moves[i].equals("LEFT")){
                s.push(temp);
                temp = temp.left;
            }
            if(moves[i].equals("UP")){
                temp = s.peek();
                s.pop();
            }
        }
        return temp.val;
    }
    public int solve24(int[] nums, int k) {
        // Write your code here
        //You are given a list of integers nums and an integer k. You must subtract 1 from any element in the list k times.
        // Return the minimum possible maximum value in the list after k operations.


        int n = nums.length;
        Queue<Integer> q = new PriorityQueue<>((i, j) -> j-i);
        for(int i = 0; i < n; i++) {
            q.add(nums[i]);
        }

        while(k > 0) {
            int max = q.poll();
            max--;
            q.add(max);
            k--;
        }

        return q.poll();
    }
    public int solve25(Tree root, int a, int b) {
        // Write your code here
//        Give a binary tree root, and integers a and b, find the value of the lowest node that has a and b as descendants.
//        A node can be a descendant of itself.
        if(root == null)return -1;
        if(root.val==a||root.val==b)return root.val;
        int x = solve25(root.left, a, b);
        int y = solve25(root.right, a, b);
        if(x == -1)
            return y;
        else if(y == -1)
            return x;
        else
            return root.val;
    }
    public int[][] solve26(int[][] arr) {
        // Write your code here
//        Given a two-dimensional integer list intervals representing unsorted inclusive intervals, return their union in sorted order.
//
//Constraints
//
//intervals length is at most \leq 10000≤10000
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
//            for(int[] ele :arr) System.out.println(Arrays.toString(ele));
        ArrayList<Integer[]> list =new ArrayList<>();
        int index = 0;
        while (index<arr.length){
            int low = arr[index][0];
            int high = arr[index][1];
            while (index+1<arr.length && high>=arr[index+1][0] ){
                index++;
                high = Math.max(high,arr[index][1]);
            }
            list.add(new Integer[]{low,high});
            index++;
        }
        int[][] merge = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            merge[i][0]=list.get(i)[0];
            merge[i][1]=list.get(i)[1];
        }
        return merge;
    }
    public boolean solve(String s1, String s2) {
//        Given two strings s1 and s2, determine if s1 is a subsequence of s2.
        // Write your code here
        int n = s1.length();
        int m = s2.length();
        while(n>0 && m>0){
            if(s2.charAt(m-1)==s1.charAt(n-1)){
                n-=1;
            }
            m-=1;
        }
        return n<=0;
    }
    public int solve(String[] words, String s) {
        // Write your code here
        HashSet<String> set = new HashSet<>();
        for(int i =0;i<words.length;i++){
            set.add(words[i]);
        }
        if(!set.contains(s))
            return 0;
        System.out.println(Arrays.toString(set.toArray()));
        int v = dfs(set,s, 1);
        return v;
    }

    int dfs(Set<String> words, String str, int len) {
        int max = len;
        for(int i = 0; i < str.length(); i++) {
            String text = str.substring(0, i) + str.substring(i + 1);
            if(words.contains(text)) {
                int r = dfs(words, text, len + 1);
                if(r > max) {
                    max = r;
                }
            }
        }
        System.out.println(str + ", len=" + len);
        return max;
    }
    public int solve(int n) {
        // Write your code here
        //it is the catlan number
        //(2n)!/((n+1)!(n)!)
        BigInteger a = BigInteger.valueOf(2*n);
        BigInteger b = BigInteger.valueOf(n+1);
        BigInteger c = BigInteger.valueOf(n);
        BigInteger a1 = BigInteger.valueOf(1000000000+7);
        a = fact(a);
        b = fact(b);
        c = fact(c);
        b = b.multiply(c);
        a = a.divide(b);
        a = a.mod(a1);
        return a.intValue();
    }
    public BigInteger fact(BigInteger a){
        BigInteger b = BigInteger.valueOf(1);
        for(int i =1;i<a.intValue();i++){
            b =b.multiply(BigInteger.valueOf(i+1));
        }
        return b;
    }
}
