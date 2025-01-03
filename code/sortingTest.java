package sorting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class sortingTest {
	
	@Test
	public void sortingTest1 () {
		int arr [] = {1, 2, 3, 4, 5};
		int n = arr.length;
		int expected[] = {1, 2, 3, 4, 5};
		Sorting.bubbleSort(arr, n);
		Sorting.printArray(arr, n);
		assertArrayEquals(expected, arr);
	}
	
	@Test
	public void sortingTest2 () {
		int arr [] = {5, 4, 3, 2, 1};
		int n = arr.length;
		int expected[] = {1, 2, 3, 4, 5};
		Sorting.bubbleSort(arr, n);
		Sorting.printArray(arr, n);
		assertArrayEquals(expected, arr);
	}
	
	@Test
	public void sortingTest3 () {
		int arr [] = {3, 5, 2, 2, 5};
		int n = arr.length;
		int expected[] = {2, 2, 3, 5, 5};
		Sorting.bubbleSort(arr, n);
		Sorting.printArray(arr, n);
		assertArrayEquals(expected, arr);
	}
	
	@Test
	public void sortingTest4 () {
		int arr [] =  {0, 0, 0, 0, 0};
		int n = arr.length;
		int expected[] =  {0, 0, 0, 0, 0};
		Sorting.bubbleSort(arr, n);
		Sorting.printArray(arr, n);
		assertArrayEquals(expected, arr);
	}
	
	@Test
	public void sortingTest5 () {
		int arr [] =  {-3, -1, -4, -2, -5};
		int n = arr.length;
		int expected[] =   {-5, -4, -3, -2, -1};
		Sorting.bubbleSort(arr, n);
		Sorting.printArray(arr, n);
		assertArrayEquals(expected, arr);
	}
	
	@Test
	public void sortingTest6 () {
		int arr [] =  {};
		int n = arr.length;
		int expected[] =   {};
		Sorting.bubbleSort(arr, n);
		Sorting.printArray(arr, n);
		assertArrayEquals(expected, arr);
	}
	
	@Test
	public void sortingTest7 () {
		int arr [] =  {8, 5, 7, 2, -1, -4, -6, 0, -3};
		int n = arr.length;
		int expected[] =   {-6, -4, -3, -1, 0, 2, 5, 7, 8};
		Sorting.bubbleSort(arr, n);
		Sorting.printArray(arr, n);
		assertArrayEquals(expected, arr);
	}
	
	@Test
	public void sortingTest8 () {
		int arr [] =  {658, 497, 524, 937, 557, 473, 363, 728, 455, 774, 
					   95, 121, 264, 152, 22, 451, 85, 515, 384, 947, 
					   896, 598, 376, 777, 593, 49, 343, 556, 2, 131, 
					   939, 204, 678, 347, 761, 665, 632, 236, 615, 809, 
					   940, 548, 94, 682, 510, 621, 345, 73, 257, 106, 
					   594, 932, 237, 915, 779, 224, 384, 593, 958, 170, 
					   820, 550, 805, 907, 407, 422, 625, 508, 128, 68, 
					   210, 195, 715, 122, 604, 403, 169, 137, 226, 365, 
					   174, 864, 763, 234, 915, 282, 274, 18, 118, 201, 
					   597, 437, 167, 485, 212, 793, 917, 14, 103, 676};
		int n = arr.length;
		int expected[] =   {2, 14, 18, 22, 49, 68, 73, 85, 94, 95, 
						    103, 106, 118, 121, 122, 128, 131, 137, 152, 167, 
						    169, 170, 174, 195, 201, 204, 210, 212, 224, 226, 
						    234, 236, 237, 257, 264, 274, 282, 343, 345, 347, 
						    363, 365, 376, 384, 384, 403, 407, 422, 437, 451, 
						    455, 473, 485, 497, 508, 510, 515, 524, 548, 550, 
						    556, 557, 593, 593, 594, 597, 598, 604, 615, 621, 
						    625, 632, 658, 665, 676, 678, 682, 715, 728, 761, 
						    763, 774, 777, 779, 793, 805, 809, 820, 864, 896, 
						    907, 915, 915, 917, 932, 937, 939, 940, 947, 958};
		Sorting.bubbleSort(arr, n);
		Sorting.printArray(arr, n);
		assertArrayEquals(expected, arr);
	}
	
	@Test
	public void sortingTest9 () {
		int arr [] =  {'a', 2, 'b','c'};
		int n = arr.length;
		int expected[] =   {2, 'a', 'b','c'};
		Sorting.bubbleSort(arr, n);
		Sorting.printArray(arr, n);
		assertArrayEquals(expected, arr);
	}
	
	
}
