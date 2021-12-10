## Advent of Code 2021

### Day 1 - Sonar Sweep

### Thinking process part 1

- Starting with the base case i.e for no entries or one entry which returns the increasedMeasurements as 0
- `increaseMeasurements()` method returns the solution
- Time complexity: O(n)
- Space complexity: O(n) where n is the number of elements in the list

### Thinking process part 2

- Starting with base case where entries are less than or equal to 3 will have incremented Measurements as 0
- `sumOfThreeElements()` which uses IntStream to [Go through indices using stream](https://www.baeldung.com/java-stream-indices) and reduce the sum of the three elements
- Initializing the first window with the sum of first 3 elements and then iterating through the other elements Time
  Complexity:
    - O(n) for looping through the list and O(3) which goes through the elements for the sum O(n+3) which is O(n)
      Space Complexity:
    - O(n) for list of elements in the given in the input
    
### Utility classes

- FileReader, reads file and returns entries in String in a List