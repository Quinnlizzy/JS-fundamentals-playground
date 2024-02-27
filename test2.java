// Yes, there are a few ways to optimize this code:

// Optimized Bubble Sort: The exampleMethod uses the 
//Bubble Sort algorithm, 
// which is not very efficient for large arrays 
//because it has a worst-case 
// and average time complexity of O(n^2). 
//However, Bubble Sort can be optimized by 
// stopping the algorithm if the inner loop 
//didn’t cause any swap in the last iteration. 
// This means the array is already sorted 
//and there's no need for further iterations.

void exampleMethod(int arr[]) {
    int n = arr.length;
    boolean swapped;
    for (int i = 0; i < n-1; i++) {
        swapped = false;
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
        }
        // If no two elements were swapped by inner loop,
        // then the array is sorted
        if (!swapped) break;
    }
}

// Use StringBuilder for String Concatenation: 
// In the exampleMethod2, string concatenation 
// in a loop can be inefficient because it creates a new 
// string object for each concatenation. 
// Using StringBuilder can be more efficient:

void exampleMethod2(int arr[]) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
        sb.append(arr[i]).append(" ");
    }
    System.out.println(sb.toString());
}

// Use More Efficient Sorting Algorithm: 
// If the array size can be large, 
// consider using a more efficient sorting algorithm like QuickSort,
//  MergeSort, or HeapSort. These algorithms have a better 
//  average and worst-case time complexity of O(n log n).