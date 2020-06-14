# Data Structure & Alogorithms

## TODOs (14-Jun-2020)

+ ~~Complete All Tries Explore Questions~~
+ Folow the link from Dynamic Programing Questions Below, Complete all pattern exerciese
+ Greedy

## 1.Trie

``` java
class Node{
    Map<Character, Node> children;
    boolean isCompleteWord;
}
```

### 1.1. Validation

> Don't look up each prefix from the root
> Build on the past calls by returning node reference
> keeping state witin a tree

## 2. Recursion

Recursion as an algorithm lays the foundation for DP / DFS algorithms.

## 3. Dynamic Programming

_Interesting Summary by **aatalyk** from [LeetCode](https://leetcode.com/discuss/general-discussion/458695/dynamic-programming-patterns)_
_Doing Topological Sort for a group of subproblems dependency DAG_

Top-Down approach and bottom up approach.

### 3.1. Memoization Pattern

It always works if you cache your result.

> if you solve the subproblem, note down the answer
> DP ~=~ recursion + memoization.
> O(T) = number of subtimes * time per subproblem
> Don't count recursion, because only need to count once

### 3.2. Shortest Path

_for memoization to work, you need **ACYCLIC GRAPH**_
_Else you will run into infinite loop_

To make a Cyclic Graph Acyclic:

> + given search space, v
> + make k copies of (based on k in degrees);
> + for v edges
> + search space v * k
> Need to refer to [bellman-ford algorithm](https://www.geeksforgeeks.org/bellman-ford-algorithm-dp-23/)

## Maximum amount


## 4. Breadth First Search & Depth First Search

### 4.1. Common BFS templates

```java
//java template
```

> Take note there are something called the Bi-directional search.

#### 4.1.1. LeetCoe OpenLock Example

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

### 4.2. Depth First Search

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

## 5. TopLogical Sort

**For DAG Only**
**No vertex shall come after the one it is pointing to**
**implemented by Stack and Set**

## 6. Minimax (Gaming and Artificial Intelligence)

> Good Place to Start
> <https://www.hackerearth.com/blog/developers/minimax-algorithm-alpha-beta-pruning/>

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
