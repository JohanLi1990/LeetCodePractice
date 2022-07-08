## 1. Table of Content
- [1. Table of Content](#1-table-of-content)
- [2. Everyday practices](#2-everyday-practices)
- [3. System Design](#3-system-design)
- [4. Data Structure & Alogorithms](#4-data-structure--alogorithms)
  - [4.1. TODOs](#41-todos)
  - [4.2. 1.Trie](#42-1trie)
    - [4.2.1. Validation](#421-validation)
  - [4.3. Greedy Algorithms](#43-greedy-algorithms)
  - [4.4. Dynamic Programming](#44-dynamic-programming)
    - [4.4.1. Memoization Pattern](#441-memoization-pattern)
    - [4.4.2. Shortest Path](#442-shortest-path)
    - [4.4.3. Merge Interval Patterns](#443-merge-interval-patterns)
    - [4.4.4. Decision Making Patterns](#444-decision-making-patterns)
    - [4.4.5. String Manipulations patterns](#445-string-manipulations-patterns)
    - [4.4.6. Distinct Ways](#446-distinct-ways)
    - [4.4.7. Kadane's Algorithm](#447-kadanes-algorithm)
    - [4.4.8. Longest Increasing Subsequence with Binary Search](#448-longest-increasing-subsequence-with-binary-search)
    - [4.4.9. KMP Algorithms (Pattern search algorithm)](#449-kmp-algorithms-pattern-search-algorithm)
    - [4.4.10. Knapsack Algorithm](#4410-knapsack-algorithm)
  - [4.5. Lowest Common Ancestor](#45-lowest-common-ancestor)
  - [4.6. Breadth First Search & Depth First Search](#46-breadth-first-search--depth-first-search)
    - [4.6.1. LeetCoe OpenLock Example](#461-leetcoe-openlock-example)
    - [4.6.2. Depth First Search](#462-depth-first-search)
  - [4.7. TopLogical Sort](#47-toplogical-sort)
  - [4.8. Minimax (Gaming and Artificial Intelligence)](#48-minimax-gaming-and-artificial-intelligence)
  - [4.9. Bit Manipulation](#49-bit-manipulation)
  - [4.10. Tortoise and Hare problems](#410-tortoise-and-hare-problems)
  - [4.11. Union Find - Disjointed Union Set](#411-union-find---disjointed-union-set)
    - [4.11.1. Find and Union](#4111-find-and-union)
    - [4.11.2. Template](#4112-template)
  - [4.12. Graph](#412-graph)
  - [4.13. Segement Tree, Binary index Trees](#413-segement-tree-binary-index-trees)
  - [4.14. Math](#414-math)
- [5. Spring Framework](#5-spring-framework)
  - [5.1. Bean Scope](#51-bean-scope)


## 2. Everyday practices

2022-05-17 08:49:05 (mergeSort, BIT)
- *DoAgain* [Bulb Switcher](https://leetcode.com/problems/bulb-switcher)
- *DoAgain* [Form Largest Integer With Digits That Add up to Target](https://leetcode.com/problems/form-largest-integer-with-digits-that-add-up-to-target/)
- *DoAgain* [Min Jump to reach Home](https://leetcode.com/problems/minimum-jumps-to-reach-home/)
- *DoAgain* [Additive Number](https://leetcode.com/problems/additive-number/)
- *DoAgain* [Longest nice substring](https://leetcode.com/problems/longest-nice-substring/)
- *DoAgain* [Count submatrices with all ones](https://leetcode.com/problems/count-submatrices-with-all-ones/)
- *DoAgain* [Sum of subsequence width](https://leetcode.com/problems/sum-of-subsequence-widths/submissions/)
- *DoAgain* [Count subarrays with score less than K](https://leetcode.com/problems/count-subarrays-with-score-less-than-k/)
- *DoAgain* [Substring with Largetst Variance](https://leetcode.com/problems/substring-with-largest-variance)
- *DoAgain* [Shopping offer](https://leetcode.com/problems/shopping-offers) (consider using bit masking to improve speed)
- *DoAgain* [k inverse pairs array](https://leetcode.com/problems/k-inverse-pairs-array/)
- *DoAgain* [Super ugly number](https://leetcode.com/problems/super-ugly-number)
- *DoAgain* [Shortest path visiting all nodes](https://leetcode.com/problems/shortest-path-visiting-all-nodes/)
- *DoAgain* [Smallest sufficient team](https://leetcode.com/problems/smallest-sufficient-team/)
- *DoAgain* [Find Minimum to finish all jobs](https://leetcode.com/problems/find-minimum-time-to-finish-all-jobs/) --- Not everything is dynamic programing
- *DoAgain* [Minimum number of work sessions to finish the tasks](https://leetcode.com/problems/minimum-number-of-work-sessions-to-finish-the-tasks/)
- *DoAgain* [Get the maximum score](https://leetcode.com/problems/get-the-maximum-score)
- *DoAgain* [Maximum value of k coins from piles](https://leetcode.com/problems/maximum-value-of-k-coins-from-piles)
- *DoAgain* [Count vowel substrings of a string](https://leetcode.com/problems/count-vowel-substrings-of-a-string/)
- *DoAgain* [Parallel Course II](https://leetcode.com/problems/parallel-courses-ii/)
- *DoAgain* [Total appeal of a string](https://leetcode.com/problems/total-appeal-of-a-string)
- *DoAgain* [Count unique characters of all substring of a given string](https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/)
- *DoAgain* [Minimum number of days to eat orange](https://leetcode.com/problems/minimum-number-of-days-to-eat-n-oranges)
- *DoAgain* [number of music playlist](https://leetcode.com/problems/number-of-music-playlists/) 
- *DoAgain* [Minimum total space wasted with k resizing operations](https://leetcode.com/problems/minimum-total-space-wasted-with-k-resizing-operations/)
- *DoAgain* [Russian Doll Envelops](https://leetcode.com/problems/russian-doll-envelopes/)
- *DoAgain* [Find the longest valid obstacles course at each position](https://leetcode.com/problems/find-the-longest-valid-obstacle-course-at-each-position/)
- *DoAgain* [Skyline Problem](https://leetcode.com/problems/the-skyline-problem/)
- *DoAgain* [Online Majority Elements in subarry](https://leetcode.com/problems/online-majority-element-in-subarray)
- *DoAgain* [Closest subsequence sum](https://leetcode.com/problems/closest-subsequence-sum/)
- *DoAgain* [Partition Array into two arrays to minimize sum difference](https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference)
- *DoAgain* [Count Number of Rectangles Containing Each Point](https://leetcode.com/problems/count-number-of-rectangles-containing-each-point/)
- *DoAgain* [Last stone weight II](https://leetcode.com/problems/last-stone-weight-ii)
- *DoAgain* [Design Most recently used queue](https://leetcode.com/problems/design-most-recently-used-queue/)
- *DoAgain* [GCD sort of an array](https://leetcode.com/problems/gcd-sort-of-an-array/submissions/)
- *DoAgain* [My Calendar II](https://leetcode.com/problems/my-calendar-ii/)
- *DoAgain* [Maximum number of points with cost](https://leetcode.com/problems/maximum-number-of-points-with-cost)
- *DoAgain* [Minimum number of moves to make palindrome](https://leetcode.com/problems/minimum-number-of-moves-to-make-palindrome/)
- *DoAgain* [Minimum Possible Integer After at Most K Adjacent Swaps On Digits](https://leetcode.com/problems/minimum-possible-integer-after-at-most-k-adjacent-swaps-on-digits/)
- *DoAgain* [Bus routes](https://leetcode.com/problems/bus-routes/)
- *DoAgain* [Count Subarrays With More Ones Than Zeros](https://leetcode.com/problems/count-subarrays-with-more-ones-than-zeros/)
- *DoAgain* [Count of smaller number after self](https://leetcode.com/problems/count-of-smaller-numbers-after-self/)
- *DoAgain* [Count of Range Sum](https://leetcode.com/problems/count-of-range-sum/)
- *DoAgain* [Smallest missing genetic value in each substree](https://leetcode.com/problems/smallest-missing-genetic-value-in-each-subtree/)
- *DoAgain* [Equal Sum Arrays With Minimum Number of Operations](https://leetcode.com/problems/equal-sum-arrays-with-minimum-number-of-operations/)
- *DoAgain* [Longest repeating substring](https://leetcode.com/problems/longest-repeating-substring/)
- *DoAgain* [Count number of teams](https://leetcode.com/problems/count-number-of-teams/)
- *DoAgain* [Detect Cycles in 2d Grid](https://leetcode.com/problems/detect-cycles-in-2d-grid/)
- *DoAgain* [Bomb enemies](https://leetcode.com/problems/bomb-enemy)
- *DoAgain* [Make array strictly increasing](https://leetcode.com/problems/make-array-strictly-increasing)
- *DoAgain* [Find All good String](https://leetcode.com/problems/find-all-good-strings)
- *DoAgain* [Kth ancestor of a tree node](https://leetcode.com/problems/kth-ancestor-of-a-tree-node)
- *DoAgain* [Race car](https://leetcode.com/problems/race-car)
- *DoAgain* [Check if an original string exists given two encoded strings](https://leetcode.com/problems/check-if-an-original-string-exists-given-two-encoded-strings)
- *DoAgain* [Count different palindrome subsequence](https://leetcode.com/problems/count-different-palindromic-subsequences/)
- *DoAgain* [Dice Roll simulations](https://leetcode.com/problems/dice-roll-simulation/)
- *DoAgain* [Maximum students taking exam](https://leetcode.com/problems/maximum-students-taking-exam/)
- *DoAgain* [Most Stones Removed with same row or clomn](https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/)
- *DoAgain* [New 21 Game](https://leetcode.com/problems/new-21-game)
- *DoAgain* [sum of subarray ranges](https://leetcode.com/problems/sum-of-subarray-ranges)
- *DoAgain* [Minimum Number of k consecutive bit flips](https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/)
- *DoAgain* [Minimum Time to Remove all cars containing illegal goods](https://leetcode.com/problems/minimum-time-to-remove-all-cars-containing-illegal-goods/)
- *DoAgain* [Length of longest fibonacci subsequence](https://leetcode.com/problems/length-of-longest-fibonacci-subsequence)
- *DoAgain* [Find valid matrix given row and column sums](https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/)
- *DoAgain* [Largest-1-bordered-square](https://leetcode.com/problems/largest-1-bordered-square)
- *DoAgain* [Tallest Billboard](https://leetcode.com/problems/tallest-billboard)
- *DoAgain* [Stickers to Spell Word](https://leetcode.com/problems/stickers-to-spell-word) -- attempt first with BitMask , then without BitMask
- *DoAgain* [Swap Adjacent in LR String](https://leetcode.com/problems/swap-adjacent-in-lr-string)
- *DoAgain* [Dinner Plate Stacks](https://leetcode.com/problems/dinner-plate-stacks)
- *DoAgain* [Active Users](https://leetcode.com/problems/active-users/)
- *DoAgain* [Palindrome Pairs](https://leetcode.com/problems/palindrome-pairs/)
- *DoAgain* [The number of weak characters in the game](https://leetcode.com/problems/the-number-of-weak-characters-in-the-game)
- *DoAgain* [Find two non-overlapping subarrays each with target sum](https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum)
- *DoAgain* [Number of Atoms](https://leetcode.com/problems/number-of-atoms)
- *DoAgain* [24 Games](https://leetcode.com/problems/24-game)
- *DoAgain* [Lexicographical numbers](https://leetcode.com/problems/lexicographical-numbers/)
- *DoAgain* [String transforms into another string](https://leetcode.com/problems/string-transforms-into-another-string)
- *DoAgain* [Number Complement](https://leetcode.com/problems/number-complement)
- *DoAgain* [integer replacement](https://leetcode.com/problems/integer-replacement/submissions/)
- *DoAgain* [Encode String with shortest length](https://leetcode.com/problems/encode-string-with-shortest-length)
- *DoAgain* [Scramble String](https://leetcode.com/problems/scramble-string)
- *DoAgain* [Count the repetition](https://leetcode.com/problems/count-the-repetitions)
- *DoAgain* [Unique substring in wraparound string](https://leetcode.com/problems/unique-substrings-in-wraparound-string/)
- *DoAgain* [number of Digit one](https://leetcode.com/problems/number-of-digit-one/submissions/)
- *DoAgain* [First day where you have been in all the rooms](https://leetcode.com/problems/first-day-where-you-have-been-in-all-the-rooms/)
- *DoAgain* [Airplane seat probability](https://leetcode.com/problems/airplane-seat-assignment-probability/)
- *DoAgain* [Last Substring in lexicographical order](https://leetcode.com/problems/last-substring-in-lexicographical-order)
- *DoAgain* [Graph Connectivity with Threshold](https://leetcode.com/problems/graph-connectivity-with-threshold/)
- *DoAgain* [Check Existence of edge length limited](https://leetcode.com/problems/checking-existence-of-edge-length-limited-paths/submissions/)
- *DoAgain* [Checking existence of edge length limited paths ii](https://leetcode.com/problems/checking-existence-of-edge-length-limited-paths-ii/)
- *DoAgain* [Crit and pseudo-crit edges in minimum spanning tree](https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/)
- *DoAgain* [Number of ways to get same bst](https://leetcode.com/problems/number-of-ways-to-reorder-array-to-get-same-bst/)



## 3. System Design

- Key Goal: Resilient / Scalable / Consistent

## 4. Data Structure & Alogorithms

### 4.1. TODOs

Things that I am not very good at

1. Divide and Conquer
2. Greedy (in progress)
3. Bit Manipulation
4. Graph (Union Find, ):
    1) [Graph LeetCode](https://leetcode.com/discuss/general-discussion/655708/Graph-For-Beginners-Problems-or-Pattern-or-Sample-Solutions)
    2) [Dijkstra](https://leetcode.com/discuss/general-discussion/1059477/A-noob's-guide-to-Djikstra's-Algorithm)
    3) [Graph Explore Card](https://leetcode.com/explore/featured/card/graph/)
5. Design
6. Topological Sort
7. Binary Indexed Tree
8.  Segment Tree 
   1)  [Range Query Sum](https://leetcode.com/problems/range-sum-query-mutable/)
   2)  [G4G article](https://www.geeksforgeeks.org/segment-tree-set-1-sum-of-given-range/)
9.  Minimax
10. Line Sweep
11. Rolling Hash
12. OOP

### 4.2. 1.Trie

``` java
class Node{
    Map<Character, Node> children;
    boolean isCompleteWord;
}
```

#### 4.2.1. Validation

> Don't look up each prefix from the root
> Build on the past calls by returning node reference
> keeping state witin a tree

### 4.3. Greedy Algorithms

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

### 4.4. Dynamic Programming

_Interesting Summary by **aatalyk** from [LeetCode](https://leetcode.com/discuss/general-discussion/458695/dynamic-programming-patterns)_
_Doing Topological Sort for a group of subproblems dependency DAG_

+ Merging Intervals [DONE]
+ Minimum (Maximum) Path to Reach a Target
+ Distinct Ways
+ DP on Strings [DONE]
+ Decision Making [DONE]

Top-Down approach and bottom up approach.

#### 4.4.1. Memoization Pattern

It always works if you cache your result.

> if you solve the subproblem, note down the answer
> DP ~=~ recursion + memoization.
> O(T) = number of subtimes * time per subproblem
> Don't count recursion, because only need to count once

#### 4.4.2. Shortest Path

_for memoization to work, you need **ACYCLIC GRAPH**_
_Else you will run into infinite loop_

To make a Cyclic Graph Acyclic:

> + given search space, v
> + make k copies of (based on k in degrees);
> + for v edges
> + search space v * k
> Need to refer to [bellman-ford algorithm](https://www.geeksforgeeks.org/bellman-ford-algorithm-dp-23/)

#### 4.4.3. Merge Interval Patterns

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

#### 4.4.4. Decision Making Patterns

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


#### 4.4.5. String Manipulations patterns

+ [LC1143 Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
+ [LC115 Distinct Subsequence](https://leetcode.com/problems/distinct-subsequences/)
+ [LC5 Longest Palindrome Substring](https://leetcode.com/problems/longest-palindromic-substring/)
+ [LC72 Edit Distance](https://leetcode.com/problems/edit-distance/)
+ [LC712 Minimum ASCII Delete Sum for Two Strings](https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/)

#### 4.4.6. Distinct Ways
+ [LC576 Out of Boundary Paths](https://leetcode.com/problems/out-of-boundary-paths/submissions/)


#### 4.4.7. Kadane's Algorithm

```
// Given an input array of numbers "nums",
best = negative infinity
current = 0
for num in nums:
    current = Max(current + num, num)
    best = Max(best, current)
return best

```

#### 4.4.8. Longest Increasing Subsequence with Binary Search

```java

private int LIS(int[] A) {

    int[] dp = new int[A.length];

    dp[0] = A[0];
    int len = 1;
    for (int i = 1; i < A.length; i++){
        int nx = Arrays.binarySearch(dp,0, len -1, A[i] );
        
        if (nx < 0) {
            nx = -(nx + 1);
        }

        dp[nx] = A[i];
        if (nx == len) len++;
    }
    return len;
}

```

#### 4.4.9. KMP Algorithms (Pattern search algorithm)

```java
// for pattern array, find size of suffix which is same as prefix
private int[] computeTemporaryArray(char[] pattern) {
    int[] lps = new int[pattern.length];
    int index = 0;
    int i = 1, j = 0;
    while(i < pattern.length) {
        if(pattern[i] == pattern[j]) {
            lps[i++] = ++j;
        } else if (j == 0) {
            pattern[i++] = 0; 
        } else {
            j = lps[j - 1]; 
        }
    }
    return lps;
    // this can be used to find the repeating patterns in a string!
} 

public boolean KMP(char[] text, char[] pattern) {
    int[] lps = computeTemporaryArray(pattern);
    int i = 0;
    int j = 0;
    while (i < text.length && j < pattern.length){
        if (text[i] == pattern[i]) {
            i++; j++;
        } else {
            if (j != 0) {
                // skip the prefix that is also suffix. 
                j = lps[j - 1];
            } else {
                i++;
            }
        }
    }
    if (j == pattern.length) {
        return true;
    }
    return false;
}

```

#### 4.4.10. Knapsack Algorithm

```java

// return maximum value that can be put in a knapsack of capacity w
// n item, with wt[], and val[], representing the values. 

private int knapSack(int W, int[] wt, int[] val, int n) {
    
    int[][] K = new int[n + 1][W + 1];

    // Build Table K[][] in a bottom up manner
    for (int i = 0; i <= n; i++) {
        for (int w = 0; w <= W; w++){
            if (i == 0 || w == 0) {
                K[i][w] = 0;
            } else if (wt[i - 1] <= w) {
                K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i -1][w]);
            } else {
                K[i][w] = K[i - 1][w];
            }
        }
    }
    return K[n][w];
}

```

### 4.5. Lowest Common Ancestor

A technique to calculate ancestor faster --> binary lifting

```java
    int[][] jump;
    int maxPow;

    public TreeAncestor(int n, int[] parent) {
        // log_base_2(n)
        maxPow = (int) (Math.log(n) / Math.log(2)) + 1;
        jump = new int[maxPow][n];
        jump[0] = parent;
        for (int p = 1; p < maxPow; p++) {
            for (int j = 0; j < n; j++) {
                int pre = jump[p - 1][j];
                jump[p][j] = pre == -1 ? -1 : jump[p - 1][pre];
            }
        }
    }

    public int getKthAncestor(int node, int k) {
        int maxPow = this.maxPow;
        while (k > 0 && node > -1) {
            if (k >= 1 << maxPow) {
                node = jump[maxPow][node];
                k -= 1 << maxPow;
            } else
                maxPow -= 1;
        }
        return node;
    }

```

### 4.6. Breadth First Search & Depth First Search

> Take note there are something called the Bi-directional search.

#### 4.6.1. LeetCoe OpenLock Example

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

#### 4.6.2. Depth First Search

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
*Flood-Fill*


### 4.7. TopLogical Sort

**For DAG Only**
**No vertex shall come after the one it is pointing to**
**implemented by Stack and Set**

+ [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/)
+ [Parallel Courses](https://leetcode.com/problems/parallel-courses/) very interesting, look at solution, have all the approaches.
+ [Alien Dictionary]()


### 4.8. Minimax (Gaming and Artificial Intelligence)

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


### 4.9. Bit Manipulation

> use ^ for XOR 10 ^ 0 = 10, 10 ^ 10 = 1
> & bitwise and, ~ bitwise not
> To get the right most bit n & ( ~ (n - 1));
> [To get all submasks of b](https://cp-algorithms.com/algebra/all-submasks.html)
  To get all submasks,
  ``` java
    // insanely useful when you need to represent subset as a state
    for (int i = b; i > 0 ; i = (i - 1) & b){
        // code goes here
    }
  ```
> To get the reminder of a value divided by power of 2 (e.g. 16) : rem = a % 16, or rem = a & 15;

### 4.10. Tortoise and Hare problems

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

### 4.11. Union Find - Disjointed Union Set

#### 4.11.1. Find and Union

Find will return to root.
Path compression and Union by rank.

Find: O(a(n)) ~= O(1)
Union: O(a(n)) ~= O(1)
Space: O(n)

#### 4.11.2. Template

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


### 4.12. Graph

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

[Find the shortest superstring](https://leetcode.com/problems/find-the-shortest-superstring/)
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

_Minimum Spanning Tree_ (Kruskal Algorithm)

A minimum spanning tree is a special kind of tree that minimizes the lengths (or “weights”) of the edges of the tree. An example is a cable company wanting to lay line to multiple neighborhoods; by minimizing the amount of cable laid, the cable company will save money. 

you can use Kuscal's Alogorithm with DisjointSet as help
[LC 1168. Optimize water distribution](https://leetcode.com/problems/optimize-water-distribution-in-a-village/submissions/)
[Connecting Cities with Min cost](https://leetcode.com/problems/connecting-cities-with-minimum-cost/submissions/)

``` java
//You start with a collections of edges e with cost c ; If you don't have such collections, try to come out with one from existing information
//sort the collection;
for each (e, c):
    if (union(e[0], e[1]))
        totalCost += c;
```

```
algorithm Kruskal(G) is
    F:= ∅
    for each v ∈ G.V do
        MAKE-SET(v)
    for each (u, v) in G.E ordered by weight(u, v), increasing do
        if FIND-SET(u) ≠ FIND-SET(v) then
            F:= F ∪ {(u, v)} ∪ {(v, u)}
            UNION(FIND-SET(u), FIND-SET(v))
    return F

```


### 4.13. Segement Tree, Binary index Trees

Leet article: 
[Recursive approach to segment tree](https://leetcode.com/articles/a-recursive-approach-to-segment-trees-range-sum-queries-lazy-propagation/)

**Questions**

[LC 307. Range Sum Query - Mutable](https://leetcode.com/problems/range-sum-query-mutable/)

> pay attention to how size of a segment tree is calculated, and how close it resembles merge-sort

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

**Binary Indexed Tree Implementation**
 we can easily calculate range sum of first i elements this way
 Time complexity is O(LogN);
 
 we can also easily modify elements in the array, 
 Time Complexity if O(logN);
```java
    // reference from https://www.geeksforgeeks.org/binary-indexed-tree-or-fenwick-tree-2/

class BinaryIndexedTree {
    final static int Max = 1000;
    static int[] BITree = new int[MAX];

    // arr input
    // BIT, range sum 

    int getSum(int index) {
        int sum = 0;
        // BIT uses indexes from 1... arr.length;
        index = index + 1;

        while(index > 0) {
            sum += BITree[index];
            // move index to parent node in getSum View
            // every time remove the last setbit from the current index
            // e.g. 100*1*0
            index -= index & (-index);
        }
        return sum;
    }

    static void updateBIT(ind n, int index, int val) {
        index = index + 1;
        while(index <= n) {
            BITree[index] += val;
            index += index & (-index);
        }
    }
}


```

### 4.14. Math

To find greatest common divisor of two number

```java
public int gcd(int x, int y){
    if (x == 0) return y;
    return gcd(y % x, x);
}

```

## 5. Spring Framework

- Guide: https://www.interviewbit.com/spring-interview-questions/

### 5.1. Bean Scope
