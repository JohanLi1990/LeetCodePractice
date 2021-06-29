## 1. Table of Content
- [1. Table of Content](#1-table-of-content)
- [2. System Design](#2-system-design)
- [3. Data Structure & Alogorithms](#3-data-structure--alogorithms)
  - [3.1. TODOs](#31-todos)
  - [3.2. 1.Trie](#32-1trie)
    - [3.2.1. Validation](#321-validation)
  - [3.3. Greedy Algorithms](#33-greedy-algorithms)
  - [3.4. Dynamic Programming](#34-dynamic-programming)
    - [3.4.1. Memoization Pattern](#341-memoization-pattern)
    - [3.4.2. Shortest Path](#342-shortest-path)
    - [3.4.3. Merge Interval Patterns](#343-merge-interval-patterns)
    - [3.4.4. Decision Making Patterns](#344-decision-making-patterns)
    - [3.4.5. String Manipulations patterns](#345-string-manipulations-patterns)
    - [3.4.6. Distinct Ways](#346-distinct-ways)
  - [3.5. Breadth First Search & Depth First Search](#35-breadth-first-search--depth-first-search)
    - [3.5.1. LeetCoe OpenLock Example](#351-leetcoe-openlock-example)
    - [3.5.2. Depth First Search](#352-depth-first-search)
  - [3.6. TopLogical Sort](#36-toplogical-sort)
  - [3.7. Minimax (Gaming and Artificial Intelligence)](#37-minimax-gaming-and-artificial-intelligence)
  - [3.8. Bitwise Manipulation](#38-bitwise-manipulation)
  - [3.9. Tortoise and Hare problems](#39-tortoise-and-hare-problems)
  - [3.10. Union Find - Disjointed Union Set](#310-union-find---disjointed-union-set)
    - [3.10.1. Find and Union](#3101-find-and-union)
    - [3.10.2. Template](#3102-template)
  - [3.11. Graph](#311-graph)
  - [3.12. Segement Tree, Binary index Trees](#312-segement-tree-binary-index-trees)
## 2. System Design

- Key Goal: Resilient / Scalable / Consistent

## 3. Data Structure & Alogorithms

### 3.1. TODOs

Things that I am not very good at

1. Divide and Conquer
2. Greedy (in progress)
3. Bit Manipulation
4. Union Find [In Progress]
5. Graph:
    1) [Graph LeetCode](https://leetcode.com/discuss/general-discussion/655708/Graph-For-Beginners-Problems-or-Pattern-or-Sample-Solutions)
    2) [Dijkstra](https://leetcode.com/discuss/general-discussion/1059477/A-noob's-guide-to-Djikstra's-Algorithm)
6. Design
7. Topological Sort
8. Binary Indexed Tree
9. Segment Tree 
   1)  [Range Query Sum](https://leetcode.com/problems/range-sum-query-mutable/)
   2)  [G4G article](https://www.geeksforgeeks.org/segment-tree-set-1-sum-of-given-range/)
10. Minimax
11. Line Sweep
12. Rolling Hash
13. OOP

### 3.2. 1.Trie

``` java
class Node{
    Map<Character, Node> children;
    boolean isCompleteWord;
}
```

#### 3.2.1. Validation

> Don't look up each prefix from the root
> Build on the past calls by returning node reference
> keeping state witin a tree

### 3.3. Greedy Algorithms

[Greedy for Beginners](https://leetcode.com/discuss/general-discussion/669996/Greedy-for-Beginners-Problems-or-Sample-solutions)
Greedy Algorithms only apply to problems whose global optimal solution relies on its local optimal solutions.
The way to Think is, is my current step able to bring me closer to the answer for sure?

+ [Jump Game](https://leetcode.com/problems/jump-game/)
+ [Jump Game II](https://leetcode.com/problems/jump-game-II/)
+ [Stamping Sequence](https://leetcode.com/problems/stamping-the-sequence/)
+ [Spliting String](https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/)
+ [Maximum NUmber of Events that can attend](https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/)

Each day I try to grab / take more, but I do have my own code: the grabing / taking should sustain me as long as possible. Therefore I only grab the one that ends first, and save the ones that ends later.

+ [Remove K digits](https://leetcode.com/problems/remove-k-digits/)

Somtimes you need to consider the interval, Heap data structure comes in real handy

+ [Split Array into Consecutive Subsequences](https://leetcode.com/problems/split-array-into-consecutive-subsequences/)
+ [Divide Array in Sets of K Consecutive Numbers](https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/)

Sometimes you can do it backward, like consider the largest/ most unlikely choice, if that one works, all the other choice should work

+ [Construct Target Array with Multiple Sums](https://leetcode.com/problems/construct-target-array-with-multiple-sums/)
+ [Put Boxes Into the Warehouse I](https://leetcode.com/problems/put-boxes-into-the-warehouse-i/)
+ [Put Boxes Into the Warehouse II](https://leetcode.com/problems/put-boxes-into-the-warehouse-ii/)

### 3.4. Dynamic Programming

_Interesting Summary by **aatalyk** from [LeetCode](https://leetcode.com/discuss/general-discussion/458695/dynamic-programming-patterns)_
_Doing Topological Sort for a group of subproblems dependency DAG_

+ Merging Intervals [DONE]
+ Minimum (Maximum) Path to Reach a Target
+ Distinct Ways
+ DP on Strings [DONE]
+ Decision Making [DONE]

Top-Down approach and bottom up approach.

#### 3.4.1. Memoization Pattern

It always works if you cache your result.

> if you solve the subproblem, note down the answer
> DP ~=~ recursion + memoization.
> O(T) = number of subtimes * time per subproblem
> Don't count recursion, because only need to count once

#### 3.4.2. Shortest Path

_for memoization to work, you need **ACYCLIC GRAPH**_
_Else you will run into infinite loop_

To make a Cyclic Graph Acyclic:

> + given search space, v
> + make k copies of (based on k in degrees);
> + for v edges
> + search space v * k
> Need to refer to [bellman-ford algorithm](https://www.geeksforgeeks.org/bellman-ford-algorithm-dp-23/)

#### 3.4.3. Merge Interval Patterns

```java
for (int win = 1; win < length; win++){
    for (int i = 0; i < length - win; i++){
        j = i + win;
        for (int k = i; k < j ; k++){
            dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + func(nums[i], nums[k], nums[j]));
        }
    }
}
```

+ [LC312 Burst Ballons](https://leetcode.com/problems/burst-balloons)
+ [LC1039 Minimum Score Triangulation](https://leetcode.com/problems/minimum-score-triangulation-of-polygon/)
+ [LC1000 Minimum Cost to Merge Stones](https://leetcode.com/problems/minimum-cost-to-merge-stones/)
+ [LC546 Remove Boxes](https://leetcode.com/problems/remove-boxes/)
+ [LC1130  Minimum Cost Tree](https://leetcode.com/problems/minimum-cost-tree-from-leaf-values/)

#### 3.4.4. Decision Making Patterns

+ [LC198 House Robber](https://leetcode.com/problems/house-robber/)
+ [LC188 Best Time to Buy and Sell Stock IV](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/)
+ [LC309 Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/)
+ [LC213 House Robber II](https://leetcode.com/problems/house-robber-ii/)
+ [LC714 Best Time to Buy and Sell Stock with Transaction Fee](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/)

When the dynamic programming travels down a binary tree, normally for each node there are some stages
depending on the stages for the subnode, the answer will be obtained at root node
+ [LC986 Binary Tree Camera](https://leetcode.com/problems/binary-tree-cameras/)
+ [LC337 House Robber III](https://leetcode.com/problems/house-robber-iii/)
+ ~~[LC979 Distribute Coins in Binary Tree](https://leetcode.com/problems/distribute-coins-in-binary-tree/)~~


#### 3.4.5. String Manipulations patterns

+ [LC1143 Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
+ [LC115 Distinct Subsequence](https://leetcode.com/problems/distinct-subsequences/)
+ [LC5 Longest Palindrome Substring](https://leetcode.com/problems/longest-palindromic-substring/)
+ [LC72 Edit Distance](https://leetcode.com/problems/edit-distance/)
+ [LC712 Minimum ASCII Delete Sum for Two Strings](https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/)

#### 3.4.6. Distinct Ways
+ [LC576 Out of Boundary Paths](https://leetcode.com/problems/out-of-boundary-paths/submissions/)



### 3.5. Breadth First Search & Depth First Search

> Take note there are something called the Bi-directional search.

#### 3.5.1. LeetCoe OpenLock Example

```java
    public int openLock(String[] deadends, String target){
        Set<String> end = new HashSet();
        Set<String> begin = new HashSet();
        Set<String> deads = new HashSet();
        for (String s : deadends){
            deads.add(s);
        }
        if (deads.contains("0000")) return -1;
        begin.add("0000");
        end.add(target);
        int level = 0;
        while(!begin.isEmpty() && !end.isEmpty()){
            if (begin.size() < end.size()){
                Set<String> temp = begin;
                begin = end;
                end = temp;
            }
            Set<String> curLevel = new HashSet<>();
            for (String s : begin){

                if (deads.contains(s)){
                    continue;
                }
                deads.add(s);
                char[] curArr = s.toCharArray();
                for (int i = 0; i < 4; i++){
                    String s1 = getString(curArr, i, 1);
                    String s2 = getString(curArr, i, -1);
                    if (end.contains(s1)){
                        return level + 1;
                    }
                    if (end.contains(s2)){
                        return level + 1;
                    }
                    if (!deads.contains(s1)){
                        curLevel.add(s1);
                    }
                    if (!deads.contains(s2)){
                        curLevel.add(s2);
                    }
                }
            }
            begin = curLevel;
            level++;
        }
        return -1;
    }
```

_idea is that b^(d/2) + b^(d/2) is much less than b^d. b is branch factor, d is depth._

#### 3.5.2. Depth First Search

``` java
// Spiral DFS backtracking
for (int i = 0; i < 4; i++){
    int nx = x + dirs[dir][0];
    int ny = y + dirs[dir][1];
    if (!visited.contains(new Pair(nx, ny)) && robot.move()){
        clean(robot, dir, nx, ny);
    }
    dir = (dir + 1) % 4;
    robot.turnRight();
}

```

### 3.6. TopLogical Sort

**For DAG Only**
**No vertex shall come after the one it is pointing to**
**implemented by Stack and Set**

+ [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/)
+ [Parallel Courses](https://leetcode.com/problems/parallel-courses/) very interesting, look at solution, have all the approaches.

### 3.7. Minimax (Gaming and Artificial Intelligence)

Good Place to Start
+ <https://www.hackerearth.com/blog/developers/minimax-algorithm-alpha-beta-pruning/>

```python
function minimax(node, depth, maximizingPlayer)
            if depth = 0 or node is a terminal node
                   return the utility of the node

            if maximizingPlayer
                   bestValue := ??
            for each child of node
                   v := minimax(child, depth ? 1, FALSE)
                   bestValue := max(bestValue, v)
            return bestValue  

            else (* minimizing player *)
                   bestValue := +?
                   for each child of node
                          v := minimax(child, depth ? 1, TRUE)
                          bestValue := min(bestValue, v)
                   return bestValue
```
*min max sometimes can be dp too*
*here is an example:*
+ [LC1690 Stone Game VII](https://leetcode.com/problems/stone-game-vii/submissions/)

*sometimes DP reminds me of the method of deduction, work backwards, ask your self, what if there are only 2 items*
*start from the simplest scenario and build from there, and try to come up with a transition function*


### 3.8. Bitwise Manipulation

> use ^ for XOR 10 ^ 0 = 10, 10 ^ 10 = 1
> & bitwise and, ~ bitwise not

### 3.9. Tortoise and Hare problems

slow and fast pointer problem
> beware of the difference between array and linkedlist

```java
    // arrays
    slow = nums[slow];
    fast = nums[nums[fast]];
    // linkedlist
    slow = slow.next;
    fast = fast.next.next;
```

### 3.10. Union Find - Disjointed Union Set

#### 3.10.1. Find and Union

Find will return to root.
Path compression and Union by rank.

Find: O(a(n)) ~= O(1)
Union: O(a(n)) ~= O(1)
Space: O(n)

#### 3.10.2. Template

[implementation1](https://people.eecs.berkeley.edu/~jrs/61bs02/hw/pj3/set/DisjointSets.java)

```java
public class DisjointSets {
    private int[] array;

    public DisjointSets(int numElements){
        array = new int[numElements];
        for (int i = 0; i < array.length; i++){
            array[i] = -1;
        }
    }

    public int find(int x){
        if (array[x] < 0){
            return x;
        } else {
            array[x] = find(array[x]);
            return array[x];
        }
    }

    public void union(int root1, int root2){
        if (array[root1] < array[root2]){
            array[root1] = array[root2];
        } else {
            if (array[root1] == array[root2]){
                array[root1]--;
            }
            array[root2] = root1;
        }
    }
}

```

or another [implmentation2](https://www.geeksforgeeks.org/disjoint-set-data-structures/)

```java
class DisjointUnionSets { 
    int[] rank, parent; 
    int n; 
  
    // Constructor 
    public DisjointUnionSets(int n) 
    { 
        rank = new int[n]; 
        parent = new int[n]; 
        this.n = n; 
        makeSet(); 
    } 
  
    // Creates n sets with single item in each 
    void makeSet() 
    { 
        for (int i = 0; i < n; i++) { 
            // Initially, all elements are in 
            // their own set. 
            parent[i] = i; 
        } 
    } 
  
    // Returns representative of x's set 
    int find(int x) 
    { 
        // Finds the representative of the set 
        // that x is an element of 
        if (parent[x] != x) { 
            // if x is not the parent of itself 
            // Then x is not the representative of 
            // his set, 
            parent[x] = find(parent[x]); 
  
            // so we recursively call Find on its parent 
            // and move i's node directly under the 
            // representative of this set 
        } 
  
        return parent[x]; 
    } 
  
    // Unites the set that includes x and the set 
    // that includes x 
    void union(int x, int y) 
    { 
        // Find representatives of two sets 
        int xRoot = find(x), yRoot = find(y); 
  
        // Elements are in the same set, no need 
        // to unite anything. 
        if (xRoot == yRoot) 
            return; 
  
        // If x's rank is less than y's rank 
        if (rank[xRoot] < rank[yRoot]) 
  
            // Then move x under y  so that depth 
            // of tree remains less 
            parent[xRoot] = yRoot; 
  
        // Else if y's rank is less than x's rank 
        else if (rank[yRoot] < rank[xRoot]) 
  
            // Then move y under x so that depth of 
            // tree remains less 
            parent[yRoot] = xRoot; 
  
        else // if ranks are the same 
        { 
            // Then move y under x (doesn't matter 
            // which one goes where) 
            parent[yRoot] = xRoot; 
  
            // And increment the result tree's 
            // rank by 1 
            rank[xRoot] = rank[xRoot] + 1; 
        } 
    } 
} 
```


### 3.11. Graph

_tarjan algorithm_

+ [Critical Connections](https://leetcode.com/problems/critical-connections-in-a-network/solution/)
you can use rank to detect cycles in a graph
``` java
      public void dfs(int node,int parent,int[] rank,int[] discovery,int[] lowDiscovery,
                   List<Integer>[] graph,List<List<Integer>> bridges){
        if(discovery[node]!=-1) return;
        discovery[node]= lowDiscovery[node]= rank[0]++;
        for(int neighbor: graph[node]){
            if(neighbor==parent) continue;
            dfs(neighbor,node,rank,discovery,lowDiscovery,graph,bridges);
            if(discovery[node]<lowDiscovery[neighbor]){
                bridges.add(Arrays.asList(node,neighbor));
            }else{
                lowDiscovery[node]= Math.min(lowDiscovery[node],lowDiscovery[neighbor]);
            }
        }
    }  

```

_Traverlling Salseman_

one of the toughest question i ever did
**Time Complexity**: 
- O(n!) brute force
- O(n^2 * 2^n) dynamic programming
+[Find the shortest superstring](https://leetcode.com/problems/find-the-shortest-superstring/)
``` java
        // the tsp dp approach
        for (int i = 1; i < (1 << n); i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            for (int j = 0; j < n; j++){
                if ((i & (1 << j)) > 0){
                    int prev = i - (1 << j);
                    if (prev == 0){
                        dp[i][j] = A[j].length();
                    } else {
                        for (int k = 0; k < n; k++){
                            if (dp[prev][k] < Integer.MAX_VALUE && dp[prev][k] + graph[k][j] < dp[i][j]){
                                dp[i][j] = dp[prev][k] + graph[k][j];
                                path[i][j] = k;
                            }
                        }
                    }
                }
                
                if (i == (1 << n) - 1 && dp[i][j] < min){
                    min = dp[i][j];
                    last = j;
                }
            }
        }
```

### 3.12. Segement Tree, Binary index Trees

Leet article: 
[Recursive approach to segment tree](https://leetcode.com/articles/a-recursive-approach-to-segment-trees-range-sum-queries-lazy-propagation/)

**Questions**

[LC 307. Range Sum Query - Mutable](https://leetcode.com/problems/range-sum-query-mutable/)
> pay attention to how size of a segment tree is calculated

```java
int height = (int)Math.ceil(Math.log(n) / Math.log(2));
int size = 2 * (int)Math.pow(2, height) - 1;
int[] tree = new int[size];

// buildTree(0, 0, n - 1, A)
public void buildTree(int treeIndex, int lo, int hi, int[] A)){
    if (lo == hi){
        tree[treeIndex] = A[lo];
        return;
    }
    int mid = lo + (hi - lo) / 2;
    buildTree(2 * treeIndex + 1, lo, mid, A);
    buildTree(2 * treeIndex + 2, mid + 1, hi, A);
    tree[treeIndex] = tree[treeIndex * 2 + 1] + tree[treeIndex * 2 + 2];
}

// updateTree(0, 0, n - 1, target, val)
public void updateTree(int treeIndex, int lo, int hi, int target, int val){
    if (lo == hi){
        tree[treeIndex] = val;
        return;
    }
    int mid = lo + (hi - lo)/2;
    if (target <= mid){
        updateTree(treeIndex * 2 + 1, lo, mid, target, val);
    } else if  {
        updateTree(treeIndex * 2 + 2, mid + 1, hi, target, val);
    }
    tree[treeIndex] = tree[treeIndex * 2 + 1] + tree[treeIndex * 2 + 2]
}

public int queryTree(int treeIndex, int lo, int hi, int left, int right){
    if (left > hi || right < lo) return 0;
    if (lo >= left && hi <= right) return tree[treeIndex];
    int mid = lo + (hi - lo) / 2;

    int left = queryTree(treeIndex * 2 + 1, lo, mid, left, right);
    int right = queryTree(treeIndex * 2 + 2, mid + 1, hi, left, right);

    return left + right;
}

```

