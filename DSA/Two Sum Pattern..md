
## Core Idea
Use a hash map to store numbers we've seen so we can look up the complement in O(1) time.

## When to Use
1.  "Find two numbers that sum to a target."
2.  Array is **not necessarily sorted**.

## Java Template
```java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[]{};
}