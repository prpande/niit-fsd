# Implement Sorting on Arrays - 10/08

## Searching

### Linear Search

- Simplest searching algorithm
- Sequential search
- Search by examining the elements in an array one by one starting from the first element
- Comparison with elements continues till the element is found or we reach the end of array
- Sample Code for linear search located in method `linearSearch()` in *src\session\SearchingAlgorithms.java.java*
  
### Binary Search

- Used for searching large lists
- Searches in least possible number of comparisons
- Array should be **sorted**
- Like finding a word in a dictionary: no need to read the entire dictionary, quickly flip to the middle, decide if the word you're looking for comes before or after, and repeat the process until you find the word.
- **Logic**:

  ```text
  1. Start with a sorted list
  2. Pick the middle element
  3. Compare with your target
  4. If the middle element is exactly what you're looking for, great! You've found it. If the middle element is smaller than your target, you know your target must be in the right half of the list. If it's larger, you know your target is in the left half.
  5. Repeat steps 2-4 with the half of the list where your target must be. You keep narrowing down your search by picking the middle element of the remaining portion and comparing it until you find the exact element you're looking for.
  6. Stop when found
  ```

- Much faster than looking at every element one by one, especially for large lists
- Like dividing and conquering. It cuts the search space in half with each step, which makes it very efficient.
- **Algorithm**
  
  ```less
  binarySearch(arr, size)
        loop until beg is not equal to end
            midIndex = (beg + end)/2
            if (item == arr[midIndex] )
                return midIndex
            else if (item > arr[midIndex] ) 
                beg = midIndex + 1
            else                       
                end = midIndex - 1
  ```

- Sample Code for binary search located in method `binarySearch()` in *src\session\SearchingAlgorithms.java*

## Sorting

- Process of arranging data in predefined sequence or order - ascending or descending
- Bubble Sort, Insertion Sort, Selection Sort, Quick Sort, Heap Sort, Merge Sort etc.

### Linear Sort

- Simple algorithm
- Good for small arrays, inefficient to be used for larger arrays
- Smallest value comes at the first position after the first iteration
- Sample code present in method `linearSort()` in *src\session\SortingAlgorithms.java*

### Bubble Sort

- Simple sorting algorithm
- Largest value goes to the last index after the first iteration
- **Logic**:

  ```text
  1. Start at the beginning of the list of items to be sorted.
  2. Compare the first item with the second item. If the first item is larger (or smaller, depending on the sorting order you want), swap them.
  3. Move to the next pair of items (second and third), and again, swap them if they are in the wrong order.
  4. Continue this process, comparing and swapping adjacent items as you move through the list. Each pass through the list will "bubble up" the largest (or smallest) unsorted item to its correct position.
  5. Keep repeating steps 2-4 until you go through the entire list without making any swaps. This means the list is now sorted.
  ```

> *Like bubbles rising to the surface in a glass of water. The larger bubbles (higher values) move upwards faster because they are lighter, just like the larger elements move towards their correct position faster in the list.*
- Not very efficient for large lists. Can take many passes to fully sort the list, especially if the largest (or smallest) items are at the beginning.
- **Algorithm**

    ```text
    begin BubbleSort(arr)  
    for all array elements  
        if arr[i] > arr[i+1]  
            swap(arr[i], arr[i+1])  
        end if  
    end for     
    return arr     
    end BubbleSort  
    ```

- Sample code present in method `bubbleSort()` in *src\session\SortingAlgorithms.java*

### Insertion Sort

- More optimized than bubble/linear sort
- Divide list into 2 sublist: sorted and unsorted
- Initially the sorted list has just the first element and rest of the elements in the unsorted list
- Then we pick elements in the unsorted list one by one and place them in the correct location in the sorted list comparing the element against the elements in the sorted list one by one
- **Logic**

  ```text
  1. Start with the first element in the list. It is considered the sorted portion because it's the only element in the sorted list.
  2. Move to the next element in the unsorted portion of the list.
  3. Compare this element to the elements in the sorted portion, moving from right to left, until you find the correct position for the element.
  4. Once you find the correct position, "insert" the element by shifting the larger elements to the right to make space for it.
  5. Repeat steps 2-4 for all remaining elements in the unsorted portion, each time inserting them into the correct position within the sorted portion.
  6. When you've gone through all the elements, the entire list will be sorted.
  ```

> *Imagine sorting a hand of playing cards. You start with one card in your hand (the sorted portion), and then you pick up another card from the table (the unsorted portion). You find where this new card belongs in your hand and insert it there. You keep doing this for each card on the table, and by the end, your hand is sorted.*

- Efficient for small lists or when the list is almost sorted already, but it can become slower for larger lists
- **Algorithm**

    ```text
    1. Repeat steps 2, 3, 4, and 5 varying i from 1 to n— 1
    2. Set temp = arr[i]
    3. Set j = i-l
    4. Repeat until j becomes less than 0 or arr[j] becomes less than or equal to temp:
        a. Shift the value at index j to index j + 1
        b. Decrement j by 1 
    5. Store temp at index j + 1
    ```

- Sample code present in method `insertionSort()` in *src\session\SortingAlgorithms.java*
