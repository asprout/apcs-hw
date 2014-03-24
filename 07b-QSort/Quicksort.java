//i don't understand why this doesn't work


import java.io.*;
import java.util.*;

public class Quicksort {
    
    public void swap(int[] a, int x, int y){
	int temp = a[x];
	a[x] = a[y];
	a[y] = temp;
    }

    public int partition(int[] a, int lower, int upper){
	int pivotIndex = 0;
	if (a.length == 1)
	    return 0;
	if (a[lower] >= a[upper] && a[lower] <= a[(lower+upper)/2])
	    pivotIndex = lower;
	else if (a[upper] >= a[lower] && a[upper] <= a[(lower+upper)/2])
	    pivotIndex = upper;
	else 
	    pivotIndex = (upper+lower)/2;
	int pivot = a[pivotIndex];
	while (lower <= upper && upper < a.length && lower < a.length){
	    while (a[lower] < pivot)
		lower++;
	    while (a[upper] > pivot)
		upper--;
	    if (upper >= lower){
		swap(a, lower, upper);}
		upper--;
		lower++;
	    
	}
	return lower;
    }
    
    public void quicksort(int[] a){
	quicksort(a, 0, a.length - 1);
    }
    public void quicksort(int[] a, int lower, int upper){
	System.out.println(toString(a));
	if (a.length <= 1 || lower >= upper)
	    return;
	int pivotIndex = partition(a, lower, upper);
	quicksort(a, lower, pivotIndex - 1);
	quicksort(a, pivotIndex + 1, upper);
    }
    public static String toString(int[] i){
	String s = "";
	for (int x : i){
	    s = s + x + " ";
	}
	return s;
    }

    public static void main(String[] args){
	Quicksort a = new Quicksort();
	int[] q = new int[10];
	Random rand = new Random();
	for (int i = 0; i< 10; i++){
	    q[i] = rand.nextInt(9) + 1;
	}

	System.out.println(toString(q));
	a.quicksort(q);
	
	System.out.println(toString(q));
    }
}
     