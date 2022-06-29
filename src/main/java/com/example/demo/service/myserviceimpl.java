package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repo.myservice;
@Service
public class myserviceimpl implements myservice {
	@Override
	public void bubblesort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

	
	int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
	@Override
	public void quicksort(int arr[], int low, int high) {
		  if (low < high)
	        {
	            /* pi is partitioning index, arr[pi] is
	              now at right place */
	            int pi = partition(arr, low, high);
	 
	            // Recursively sort elements before
	            // partition and after partition
	            quicksort(arr, low, pi-1);
	            quicksort(arr, pi+1, high);
	        }
		
	}

}
