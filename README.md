## 1. Table of Content
- [1. Table of Content](#1-table-of-content)
- [2. EveryDay Practice (Focus on Old Questions first)](#2-everyday-practice-focus-on-old-questions-first)
- [3. System Design](#3-system-design)
- [4. Data Structure \& Alogorithms](#4-data-structure--alogorithms)
  - [4.1. TODOs](#41-todos)
  - [Set, List, Comparators](#set-list-comparators)
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
  - [4.6. Breadth First Search \& Depth First Search](#46-breadth-first-search--depth-first-search)
    - [4.6.1. LeetCoe OpenLock Example](#461-leetcoe-openlock-example)
    - [4.6.2. Depth First Search](#462-depth-first-search)
  - [4.7. Dijkstra Algorithm (Shorted distance in a weighted Graph)](#47-dijkstra-algorithm-shorted-distance-in-a-weighted-graph)
  - [4.8. TopLogical Sort](#48-toplogical-sort)
  - [4.9. Minimax (Gaming and Artificial Intelligence)](#49-minimax-gaming-and-artificial-intelligence)
  - [4.10. Bit Manipulation](#410-bit-manipulation)
  - [4.11. Tortoise and Hare problems](#411-tortoise-and-hare-problems)
  - [4.12. Union Find - Disjointed Union Set](#412-union-find---disjointed-union-set)
    - [4.12.1. Find and Union](#4121-find-and-union)
    - [4.12.2. Template](#4122-template)
  - [4.13. Graph](#413-graph)
  - [4.14. Segement Tree, Binary index Trees](#414-segement-tree-binary-index-trees)
  - [4.15. Math](#415-math)


## 2. EveryDay Practice (Focus on Old Questions first)
- *DoAgain* [1242. Web Crawler Multithreaded](https://leetcode.com/problems/web-crawler-multithreaded/)
- *DoAgain* [1520. Maximum Number of Non-Overlapping Substrings](https://leetcode.com/problems/maximum-number-of-non-overlapping-substrings/)
- *DoAgain* [1062. Longest Repeating Substring](https://leetcode.com/problems/longest-repeating-substring/)
- *DoAgain* [1687. Delivering Boxes from Storage to Ports](https://leetcode.com/problems/delivering-boxes-from-storage-to-ports/)
- *DoAgain* [1521. Find a Value of a Mysterious Function Closest to Target](https://leetcode.com/problems/find-a-value-of-a-mysterious-function-closest-to-target/description/))
- *DoAgain* [1125. Smallest Sufficient Team](https://leetcode.com/problems/smallest-sufficient-team/)
- *DoAgain* [960. Delete Columns to Make Sorted III](https://leetcode.com/problems/delete-columns-to-make-sorted-iii/description/)
- *DoAgain* [1488. Avoid Flood in The City](https://leetcode.com/problems/avoid-flood-in-the-city/)  need to apply treeset flexibily
- *DoAgain* [854. K-Similar Strings](https://leetcode.com/problems/k-similar-strings/)
- *DoAgain* [361. Bomb Enemy](https://leetcode.com/problems/bomb-enemy/)
- *DoAgain* [351. Android Unlock Patterns](https://leetcode.com/problems/android-unlock-patterns/description/)
- *DoAgain* [847. Shortest Path Visiting All Nodes](https://leetcode.com/problems/shortest-path-visiting-all-nodes/)
- *DoAgain* [2101. Detonate the Maximum Bombs](https://leetcode.com/problems/detonate-the-maximum-bombs/description/)
- *DoAgain* [2127. Maximum Employees to Be Invited to a Meeting](https://leetcode.com/problems/maximum-employees-to-be-invited-to-a-meeting/description/)
- *DoAgain* [1066. Campus Bikes II](https://leetcode.com/problems/campus-bikes-ii/description/)
- *DoAgain* [2096. Step-By-Step Directions From a Binary Tree Node to Another](https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/description/)
- *DoAgain* [1626. Best Team With No Conflicts](https://leetcode.com/problems/best-team-with-no-conflicts/description/)
- *DoAgain* [2312. Selling Pieces of Wood](https://leetcode.com/problems/selling-pieces-of-wood/description/)
- *DoAgain* [407. Trapping Rain Water II](https://leetcode.com/problems/trapping-rain-water-ii/description/)
- *DoAgain* [1081. Smallest Subsequence of Distinct Characters](https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/)
- *DoAgain* [1443. Minimum Time to Collect All Apples in a Tree](https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/description/)
- *DoAgain* [1654. Minimum Jumps to Reach Home](https://leetcode.com/problems/minimum-jumps-to-reach-home/)
- *DoAgain* [277. Find the Celebrity](https://leetcode.com/problems/find-the-celebrity/description/)
- *DoAgain* [722. Remove Comments](https://leetcode.com/problems/remove-comments/description/)
- *DoAgain* [1606. Find Servers That Handled Most Number of Requests](https://leetcode.com/problems/find-servers-that-handled-most-number-of-requests/description/)
- *DoAgain* [913. Cat and Mouse](https://leetcode.com/problems/cat-and-mouse/description/)
- *DoAgain* [1916. Count Ways to Build Rooms in an Ant Colony](https://leetcode.com/problems/count-ways-to-build-rooms-in-an-ant-colony/description/)
- *DoAgain* [296. Best Meeting Point](https://leetcode.com/problems/best-meeting-point/description/)
- *DoAgain* [1206. Design Skiplist](https://leetcode.com/problems/design-skiplist/description/)
- *DoAgain* [2355. Maximum Number of Books You Can Take](https://leetcode.com/problems/maximum-number-of-books-you-can-take/description/)
- *DoAgain* [962. Maximum Width Ramp](https://leetcode.com/problems/maximum-width-ramp/description/)
- *DoAgain* [2376. Count Special Integers](https://leetcode.com/problems/count-special-integers/description/)
- *DoAgain* [1531. String Compression II](https://leetcode.com/problems/string-compression-ii/description/)
- *DoAgain* [1977. Number of Ways to Separate Numbers](https://leetcode.com/problems/number-of-ways-to-separate-numbers/description/)
- *DoAgain* [2369. Check if There is a Valid Partition For The Array](https://leetcode.com/problems/check-if-there-is-a-valid-partition-for-the-array/description/)
- *DoAgain* [1307. Verbal Arithmetic Puzzle](https://leetcode.com/problems/verbal-arithmetic-puzzle/)
- *DoAgain* [1012. Numbers With Repeated Digits](https://leetcode.com/problems/numbers-with-repeated-digits/description/)
- *DoAgain* [1639. Number of Ways to Form a Target String Given a Dictionary](https://leetcode.com/problems/number-of-ways-to-form-a-target-string-given-a-dictionary/description/)
- *DoAgain* [1727. Largest Submatrix With Rearrangements](https://leetcode.com/problems/largest-submatrix-with-rearrangements/)
- *DoAgain* [1363. Largest Multiple of Three](https://leetcode.com/problems/largest-multiple-of-three/)
- *DoAgain* [2327. Number of People Aware of a Secret](https://leetcode.com/problems/number-of-people-aware-of-a-secret/)
- *DoAgain* [1395. Count Number of Teams](https://leetcode.com/problems/count-number-of-teams/)
- *DoAgain* [466. Count The Repetitions](https://leetcode.com/problems/count-the-repetitions)
- *DoAgain* [432. All O one Data Structure](https://leetcode.com/problems/all-oone-data-structure/)
- *DoAgain* [634. Find the Derangement of An Array](https://leetcode.com/problems/find-the-derangement-of-an-array/)
- *DoAgain* [1172. Dinner Plate Stacks](https://leetcode.com/problems/dinner-plate-stacks/)
- *DoAgain* [995. Minimum Number of K Consecutive Bit Flips](https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/)
- *DoAgain* [2167. Minimum Time to Remove All Cars Containing Illegal Goods](https://leetcode.com/problems/minimum-time-to-remove-all-cars-containing-illegal-goods/)
- *DoAgain* [2281. Sum of Total Strength of Wizards](https://leetcode.com/problems/sum-of-total-strength-of-wizards/)
- *DoAgain* [394. Decode String](https://leetcode.com/problems/decode-string/)
- *DoAgain* [855. Exam Room](https://leetcode.com/problems/exam-room/)
- *DoAgain* [1274. Number of Ships in a Rectangle](https://leetcode.com/problems/number-of-ships-in-a-rectangle/solution/)
- *DoAgain* [2122. Recover the Original Array](https://leetcode.com/problems/recover-the-original-array/)
- *DoAgain* [2007. Find Original Array From Doubled Array](https://leetcode.com/problems/find-original-array-from-doubled-array/)
- *DoAgain* [372. Super Pow](https://leetcode.com/problems/super-pow/)
- *DoAgain* [980. Unique Paths III](https://leetcode.com/problems/unique-paths-iii/)
- *DoAgain* [2002. Maximum Product of the Length of Two Palindromic Subsequences](https://leetcode.com/problems/maximum-product-of-the-length-of-two-palindromic-subsequences/)
- *DoAgain* [1478. Allocate Mailboxes](https://leetcode.com/problems/allocate-mailboxes/)
- *DoAgain* [1074. Number of Submatrices That Sum to Target](https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/)
- *DoAgain* [1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/)
- *DoAgain* [1838. Frequency of the Most Frequent Element](https://leetcode.com/problems/frequency-of-the-most-frequent-element/)
- *DoAgain* [1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/)
- *DoAgain* [106. Construct Binary Tree from Inorder and Postorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/)
- *DoAgain* [966. Vowel Spellchecker](https://leetcode.com/problems/vowel-spellchecker/)
- *DoAgain* [1197. Minimum Knight Moves](https://leetcode.com/problems/minimum-knight-moves/)
- *DoAgain* [2267. Check if There Is a Valid Parentheses String Path](https://leetcode.com/problems/check-if-there-is-a-valid-parentheses-string-path/)
- *DoAgain* [2014. Longest Subsequence Repeated k Times](https://leetcode.com/problems/longest-subsequence-repeated-k-times/)
- *DoAgain* [1982. Find Array Given Subset Sums](https://leetcode.com/problems/find-array-given-subset-sums/submissions/)
- *DoAgain* [420. Strong Password Checker](https://leetcode.com/problems/strong-password-checker/)
- *DoAgain* [757. Set Intersection Size At Least Two](https://leetcode.com/problems/set-intersection-size-at-least-two/)
- *DoAgain* [2271. Maximum White Tiles Covered by a Carpet](https://leetcode.com/problems/maximum-white-tiles-covered-by-a-carpet/)
- *DoAgain* [889. Construct Binary Tree from Preorder and Postorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/)
- *DoAgain* [903. Valid Permutations for DI Sequence](https://leetcode.com/problems/valid-permutations-for-di-sequence/)
- *DoAgain* [358. Rearrange String k Distance Apart](https://leetcode.com/problems/rearrange-string-k-distance-apart/)
- *DoAgain* [1373. Maximum Sum BST in Binary Tree](https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/)
- *DoAgain* [1124. Longest Well-Performing Interval](https://leetcode.com/problems/longest-well-performing-interval/)
- *DoAgain* [24 Games](https://leetcode.com/problems/24-game)
- *DoAgain* [Merge BST to create single BST](https://leetcode.com/problems/merge-bsts-to-create-single-bst/)
- *DoAgain* [Amount of New Area Painted Each Day](https://leetcode.com/problems/amount-of-new-area-painted-each-day/)
- *DoAgain* [Design Excel Sum Formula](https://leetcode.com/problems/design-excel-sum-formula)
- *DoAgain* [Largest color value in a directed graph](https://leetcode.com/problems/largest-color-value-in-a-directed-graph/)
- *DoAgain* [Find good days to rob the bank](https://leetcode.com/problems/find-good-days-to-rob-the-bank/)
- *DoAgain* [Reaching points](https://leetcode.com/problems/reaching-points) (If class is used in Set, need to override both equals and hash)
- *DoAgain* [Rank Transform of an Array](https://leetcode.com/problems/rank-transform-of-an-array/)
- *DoAgain* [Sequentially Ordinal Rank Tracker](https://leetcode.com/problems/sequentially-ordinal-rank-tracker/)
- *DoAgain* [Build Binary Expression Tree From Infix Expression](https://leetcode.com/problems/build-binary-expression-tree-from-infix-expression/)
- *DoAgain* [Design in memory file system](https://leetcode.com/problems/design-in-memory-file-system/)
- *DoAgain* [Analyze user website visit pattern](https://leetcode.com/problems/analyze-user-website-visit-pattern/)
- *DoAgain* [Minimum Increment to make array unique](https://leetcode.com/problems/minimum-increment-to-make-array-unique/)
- *DoAgain* [Equal Sum Arrays With Minimum Number of Operations](https://leetcode.com/problems/equal-sum-arrays-with-minimum-number-of-operations/)
- *DoAgain* [Partition Array into two arrays to minimize sum difference](https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference)
- *DoAgain* [Tallest Billboard](https://leetcode.com/problems/tallest-billboard)
- *DoAgain* [Maximum Height by Stacking Cuboids](https://leetcode.com/problems/maximum-height-by-stacking-cuboids/)
- *DoAgain* [The number of weak characters in the game](https://leetcode.com/problems/the-number-of-weak-characters-in-the-game)
- *DoAgain* [Form Largest Integer With Digits That Add up to Target](https://leetcode.com/problems/form-largest-integer-with-digits-that-add-up-to-target/)
- *DoAgain* [Additive Number](https://leetcode.com/problems/additive-number/)
- *DoAgain* [Longest nice substring](https://leetcode.com/problems/longest-nice-substring/)
- *DoAgain* [Count submatrices with all ones](https://leetcode.com/problems/count-submatrices-with-all-ones/)
- *DoAgain* [Sum of subsequence width](https://leetcode.com/problems/sum-of-subsequence-widths/submissions/)
- *DoAgain* [Substring with Largetst Variance](https://leetcode.com/problems/substring-with-largest-variance)
- *DoAgain* [k inverse pairs array](https://leetcode.com/problems/k-inverse-pairs-array/)
- *DoAgain* [Super ugly number](https://leetcode.com/problems/super-ugly-number)
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
- *DoAgain* [Count Number of Rectangles Containing Each Point](https://leetcode.com/problems/count-number-of-rectangles-containing-each-point/)
- *DoAgain* [Design Most recently used queue](https://leetcode.com/problems/design-most-recently-used-queue/)
- *DoAgain* [GCD sort of an array](https://leetcode.com/problems/gcd-sort-of-an-array/submissions/)
- *DoAgain* [My Calendar II](https://leetcode.com/problems/my-calendar-ii/)
- *DoAgain* [Minimum number of moves to make palindrome](https://leetcode.com/problems/minimum-number-of-moves-to-make-palindrome/)
- *DoAgain* [Minimum Possible Integer After at Most K Adjacent Swaps On Digits](https://leetcode.com/problems/minimum-possible-integer-after-at-most-k-adjacent-swaps-on-digits/)
- *DoAgain* [Bus routes](https://leetcode.com/problems/bus-routes/)
- *DoAgain* [Count Subarrays With More Ones Than Zeros](https://leetcode.com/problems/count-subarrays-with-more-ones-than-zeros/)
- *DoAgain* [Count of smaller number after self](https://leetcode.com/problems/count-of-smaller-numbers-after-self/)
- *DoAgain* [Count of Range Sum](https://leetcode.com/problems/count-of-range-sum/)
- *DoAgain* [Smallest missing genetic value in each substree](https://leetcode.com/problems/smallest-missing-genetic-value-in-each-subtree/)
- *DoAgain* [Detect Cycles in 2d Grid](https://leetcode.com/problems/detect-cycles-in-2d-grid/)
- *DoAgain* [Make array strictly increasing](https://leetcode.com/problems/make-array-strictly-increasing)
- *DoAgain* [Find All good String](https://leetcode.com/problems/find-all-good-strings)
- *DoAgain* [Kth ancestor of a tree node](https://leetcode.com/problems/kth-ancestor-of-a-tree-node)
- *DoAgain* [Race car](https://leetcode.com/problems/race-car)
- *DoAgain* [Check if an original string exists given two encoded strings](https://leetcode.com/problems/check-if-an-original-string-exists-given-two-encoded-strings)
- *DoAgain* [Count different palindrome subsequence](https://leetcode.com/problems/count-different-palindromic-subsequences/)
- *DoAgain* [Dice Roll simulations](https://leetcode.com/problems/dice-roll-simulation/)
- *DoAgain* [Most Stones Removed with same row or clomn](https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/)
- *DoAgain* [New 21 Game](https://leetcode.com/problems/new-21-game)
- *DoAgain* [Length of longest fibonacci subsequence](https://leetcode.com/problems/length-of-longest-fibonacci-subsequence)
- *DoAgain* [Find valid matrix given row and column sums](https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/)
- *DoAgain* [Largest-1-bordered-square](https://leetcode.com/problems/largest-1-bordered-square)
- *DoAgain* [Stickers to Spell Word](https://leetcode.com/problems/stickers-to-spell-word) -- attempt first with BitMask , then without BitMask
- *DoAgain* [Swap Adjacent in LR String](https://leetcode.com/problems/swap-adjacent-in-lr-string)
- *DoAgain* [Active Users](https://leetcode.com/problems/active-users/)
- *DoAgain* [Palindrome Pairs](https://leetcode.com/problems/palindrome-pairs/)
- *DoAgain* [Find two non-overlapping subarrays each with target sum](https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum)
- *DoAgain* [Number of Atoms](https://leetcode.com/problems/number-of-atoms)
- *DoAgain* [Lexicographical numbers](https://leetcode.com/problems/lexicographical-numbers/)
- *DoAgain* [String transforms into another string](https://leetcode.com/problems/string-transforms-into-another-string)
- *DoAgain* [Number Complement](https://leetcode.com/problems/number-complement)
- *DoAgain* [integer replacement](https://leetcode.com/problems/integer-replacement/submissions/)
- *DoAgain* [Encode String with shortest length](https://leetcode.com/problems/encode-string-with-shortest-length)
- *DoAgain* [Scramble String](https://leetcode.com/problems/scramble-string)
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
- Define requirements, go backward
- Draw high level design
- how do they scale ? or distributed for availability
- bottle necks / Trade-off
- Defend your design?

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

### Set, List, Comparators
if object in list can be compared, then Set<List> is going to ignore those list that contain similar object
e.g.
```java
Set<List<Integer>> set = new HashSet<>();
set.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
set.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
assertTrue(set.size() == 1);
```

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

**common technique**
```java
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;
        if (left != null) return left;
        if (right != null) return right;
        
        return null;
    }
}
```

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

### 4.7. Dijkstra Algorithm (Shorted distance in a weighted Graph)

- use PriorityQueue to do bfs

[1102. Path With Maximum Minimum Value](https://leetcode.com/problems/path-with-maximum-minimum-value/)
```java
class Solution {
    int[] dirs = new int[]{-1, 0, 1, 0, -1};
    public int maximumMinimumPath(int[][] grid) {
        
        // bfs but with PriorityQueue<>();
        // only mark i, j as visited when you have everyways to visit i. j
        
        int m = grid.length, n = grid[0].length;
        int[][] score = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                score[i][j] = -1;
            }
        }
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        
        q.offer(new int[]{grid[0][0], 0, 0});
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            
            if (cur[1] == m - 1 && cur[2] == n - 1) return cur[0];
            
            visited[cur[1]][cur[2]] = true;
            
            for(int i = 0; i < 4; i++) {
                int nx = cur[1] + dirs[i];
                int ny = cur[2] + dirs[i + 1];
                
                if (nx < 0 || ny < 0 || nx >= m || ny >= n || visited[nx][ny]) continue;
                
                int curScore = Math.min(grid[nx][ny], cur[0]);
                if (curScore > score[nx][ny]) {
                    score[nx][ny] = curScore;
                    q.offer(new int[]{curScore, nx, ny});
                }
            }
        }
        return -1;
        
    }
}

```


### 4.8. TopLogical Sort

**For DAG Only**
**No vertex shall come after the one it is pointing to**
**implemented by Stack and Set**
In computer science, a topological sort or topological ordering of a directed graph is a linear ordering of its vertices such that for every directed edge uv from vertex u to vertex v, u comes before v in the ordering.

**Topological Sor** is able to identify non-Cycle nodes of a graph.

```java
    L ← Empty list that will contain the sorted elements
    S ← Set of all nodes with no incoming edge

    while S is not empty do
        remove a node n from S
        add n to L
        for each node m with an edge e from n to m do
            remove edge e from the graph
            /**
                add operate on m based on the order between m and n, n may have some information that need to be passed to m
            **/
            if m has no other incoming edges then
                insert m into S

    if graph has edges then
        return error   (graph has at least one cycle)
    else 
        return L   (a topologically sorted order)

```

yet another example:

``` java
// A Java program to print topological
// sorting of a DAG
import java.io.*;
import java.util.*;

// This class represents a directed graph
// using adjacency list representation
class Graph {
	// No. of vertices
	private int V;

	// Adjacency List as ArrayList of ArrayList's
	private ArrayList<ArrayList<Integer> > adj;

	// Constructor
	Graph(int v)
	{
		V = v;
		adj = new ArrayList<ArrayList<Integer> >(v);
		for (int i = 0; i < v; ++i)
			adj.add(new ArrayList<Integer>());
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) { adj.get(v).add(w); }

	// A recursive function used by topologicalSort
	void topologicalSortUtil(int v, boolean visited[],
							Stack<Integer> stack)
	{
		// Mark the current node as visited.
		visited[v] = true;
		Integer i;

		// Recur for all the vertices adjacent
		// to thisvertex
		Iterator<Integer> it = adj.get(v).iterator();
		while (it.hasNext()) {
			i = it.next();
			if (!visited[i])
				topologicalSortUtil(i, visited, stack);
		}

		// Push current vertex to stack
		// which stores result
		stack.push(new Integer(v));
	}

	// The function to do Topological Sort.
	// It uses recursive topologicalSortUtil()
	void topologicalSort()
	{
		Stack<Integer> stack = new Stack<Integer>();

		// Mark all the vertices as not visited
		boolean visited[] = new boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;

		// Call the recursive helper
		// function to store
		// Topological Sort starting
		// from all vertices one by one
		for (int i = 0; i < V; i++)
			if (visited[i] == false)
				topologicalSortUtil(i, visited, stack);

		// Print contents of stack
		while (stack.empty() == false)
			System.out.print(stack.pop() + " ");
	}

	// Driver code
	public static void main(String args[])
	{
		// Create a graph given in the above diagram
		Graph g = new Graph(6);
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);

		System.out.println("Following is a Topological "
						+ "sort of the given graph");
		// Function Call
		g.topologicalSort();
	}
}
// This code is contributed by Aakash Hasija

```


### 4.9. Minimax (Gaming and Artificial Intelligence)

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


### 4.10. Bit Manipulation

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

Interesting example questions
- [Shopping offer](https://leetcode.com/problems/shopping-offers) (consider using bit masking to improve speed)

### 4.11. Tortoise and Hare problems

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

### 4.12. Union Find - Disjointed Union Set

#### 4.12.1. Find and Union

Find will return to root.
Path compression and Union by rank.

Find: O(a(n)) ~= O(1)
Union: O(a(n)) ~= O(1)
Space: O(n)

#### 4.12.2. Template

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


### 4.13. Graph

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


### 4.14. Segement Tree, Binary index Trees

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
        tree[treeIndex] += val;
        return;
    }
    int mid = lo + (hi - lo)/2;
    if (target <= mid){
        updateTree(treeIndex * 2 + 1, lo, mid, target, val);
    } else {
        updateTree(treeIndex * 2 + 2, mid + 1, hi, target, val);
    }
    tree[treeIndex] = tree[treeIndex * 2 + 1] + tree[treeIndex * 2 + 2]
}

public int queryTree(int treeIndex, int lo, int hi, int left, int right){
    if (left > hi || right < lo) return 0;
    if (lo >= left && hi <= right) return tree[treeIndex];
    int mid = lo + (hi - lo) / 2;

    int leftval = queryTree(treeIndex * 2 + 1, lo, mid, left, right);
    int rightval = queryTree(treeIndex * 2 + 2, mid + 1, hi, left, right);

    return leftval + rightval;
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

### 4.15. Math

**To find greatest common divisor of two number**

```java
public int gcd(int x, int y){
    if (x == 0) return y;
    return gcd(y % x, x);
}

```

**How to find reminder of a very large number? Euler's Thereom**
```java
    (a * a ) % mod = ((a % mod) * (a % mod)) % mod;
    ((a * x + c) * (a * x + c)) % a
    = (c * c) % mod;
```

