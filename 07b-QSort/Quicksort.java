import java.io.*;
import java.util.*;

public class Quicksort {
    
    public void swap(int[] a, int x, int y){
	int temp = a[x];
	a[x] = a[y];
	a[y] = temp;
    }

    public int partition(int[] a, int lower, int upper){
	int index = lower;
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

	swap(a, pivotIndex, upper);
	for (int i = lower; i < upper; i++){
	    if (a[i] <= pivot)
		swap(a, i, index++);
	}
	swap(a, index, upper);
	return index;
    }

    public void quicksort(int[] a){
	quicksort(a, 0, a.length - 1);
    }
    public void quicksort(int[] a, int lower, int upper){
	if (a.length <= 1 || lower >= upper)
	    return;
	int pivotIndex = partition(a, lower, upper);
	quicksort(a, lower, pivotIndex - 1);
	quicksort(a, pivotIndex + 1, upper);
    }
    public static String toString(int[] i){
	String s = "";
	for (int x : i){
	    s = s + x;
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
     