import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		SearchAndSort search = new SearchAndSort(); 
		int target = 0; 
		
		System.out.println("What algorithm would you like to execute? "); 
		String algorithm = in.nextLine().toLowerCase(); 
		
		if (algorithm.equals("linear") || algorithm.equals("binary")) {
			System.out.println("What would the target value be? ");
			target = in.nextInt();
			in.nextLine(); 
		}
		
		else if (algorithm.equals("quit")) {
			System.exit(0);
		}
		
		System.out.println("What type of data? ");
		String datatype = in.nextLine().toLowerCase(); 
		
		System.out.println("How is it stored? ");
		String storage = in.nextLine().toLowerCase(); 
		
		System.out.println("Enter the data separated by commas: ");
		String enteredData = in.nextLine(); 
		
		/**
		 * list1 for integer array
		 * list3 for integer arraylist
		 * list4 for string arraylist
		 */
		
		if (storage.equals("array")) {
			if (datatype.equals("integer")) {
				String[] list1 = enteredData.split(",");
				int ints[] = new int[list1.length]; 
				for (int i = 0; i < list1.length; i++) 
		            ints[i] = Integer.parseInt(list1[i]);
				System.out.println(Arrays.toString(ints));
				
				switch (algorithm) {
				case "bubble":
					System.out.println("Bubble Sort: " + Arrays.toString(search.bubble(ints)));
					break; 
				case "selection":
					System.out.println("Selection Sort: " + Arrays.toString(search.selection(ints)));
					break;
				case "insertion": 
					System.out.println("Insertion Sort: " + Arrays.toString(search.insertion(ints)));
					break;
				case "merge":
					System.out.println("Merge Sort: " + Arrays.toString(search.merge(ints)));
					break;
				case "linear":
					System.out.println("Linear Search: " + search.linear(ints, target));
					break;
				case "binary": 
					System.out.println("Binary Search: " + search.binary(ints, target));
					break; 
				}
			}
			else if (datatype.equals("string")) {
				String[] strings = enteredData.split(",");
				System.out.println(Arrays.toString(strings));
				
				switch (algorithm) {
				case "bubble":
					System.out.println("Bubble Sort: " + Arrays.toString(search.bubble(strings)));
					break; 
				case "selection":
					System.out.println("Selection Sort: " + Arrays.toString(search.selection(strings)));
					break;
				case "insertion": 
					System.out.println("Insertion Sort: " + Arrays.toString(search.insertion(strings)));
					break;
				case "merge":
					System.out.println("Merge Sort: " + Arrays.toString(search.merge(strings)));
					break;
				case "linear":
					System.out.println("Linear Search: " + search.linear(strings, target));
					break;
				case "binary": 
					System.out.println("Binary Search: " + search.binary(strings, target));
					break; 
				}
			}
		}
		else if (storage.equals("arraylist")) {
			if (datatype.equals("integer")) {
				String[] strings = enteredData.split(",");
				ArrayList<Integer> list3 = new ArrayList<Integer>(strings.length);
				for (int i = 0; i < strings.length; i++) {
					list3.add(Integer.parseInt(strings[i])); 
				}
				System.out.println(Arrays.toString(strings));
				
				switch (algorithm) {
				case "bubble":
					System.out.println("Bubble Sort: " + search.bubble(list3));
					break; 
				case "selection":
					System.out.println("Selection Sort: " + search.selection(list3));
					break;
				case "insertion": 
					System.out.println("Insertion Sort: " + search.insertion(list3));
					break;
				case "merge":
					System.out.println("Merge Sort: " + search.merge(list3));
					break;
				case "linear":
					System.out.println("Linear Search: " + search.linear(list3, target));
					break;
				case "binary": 
					System.out.println("Binary Search: " + search.binary(list3, target));
					break; 
				}

			}
			else if (datatype.equals("string")) {
				String[] strings = enteredData.split(",");
				ArrayList<String> list4 = new ArrayList<String>(strings.length); 
				for(int i = 0; i < strings.length; i++) {
					list4.add(strings[i]);
				}
				System.out.println(Arrays.toString(strings)); 
				
				switch (algorithm) {
				case "bubble":
					System.out.println("Bubble Sort: " + search.bubble(false, list4));
					break; 
				case "selection":
					System.out.println("Selection Sort: " + search.selection(false, list4));
					break;
				case "insertion": 
					System.out.println("Insertion Sort: " + search.insertion(false, list4));
					break;
				case "merge":
					System.out.println("Merge Sort: " + search.merge(false, list4));
					break;
				case "linear":
					System.out.println("Linear Search: " + search.linear(false, list4, target));
					break;
				case "binary": 
					System.out.println("Binary Search: " + search.binary(false, list4, target));
					break; 
				}
			}
		}
	}
	
	
	//Sorting and Searching//
	
	private int[] bubble(int[] data) {
		int n = data.length; 
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (data[j] > data[j + 1]) 
                { 
                    int temp = data[j]; 
                    data[j] = data[j + 1]; 
                    data[j + 1] = temp; 
                } 
        return data; 
	}
	
	private String[] bubble(String[] data) {
		int n = data.length; 
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (Integer.parseInt(data[j]) > Integer.parseInt(data[j + 1]))  
                { 
                    String temp = data[j]; 
                    data[j] = data[j + 1]; 
                    data[j + 1] = temp; 
                } 
        return data; 
	}	
	
	private ArrayList<Integer> bubble(ArrayList<Integer> data) {
		int n = data.size(); 
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (data.get(j) > data.get(j + 1)) 
                { 
                	data.set(j, data.set(j + 1, data.get(j)));
                } 
        return data; 
	}
	
	private ArrayList<String> bubble(boolean test, ArrayList<String> data) {
		int n = data.size(); 
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (Integer.parseInt(data.get(j)) > Integer.parseInt(data.get(j + 1))) 
                { 
                	data.set(j, data.set(j + 1, data.get(j)));
                } 
        return data; 
	}
	
	private int[] selection(int[] data) {
		int n = data.length; 
		   
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (data[j] < data[min_idx]) 
                    min_idx = j; 
  
            int temp = data[min_idx]; 
            data[min_idx] = data[i]; 
            data[i] = temp; 
        } 
        return data; 
	}
	
	private String[] selection(String[] data) {
		int n = data.length; 
		   
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (Integer.parseInt(data[j]) < Integer.parseInt(data[min_idx])) 
                    min_idx = j; 
  
            String temp = data[min_idx]; 
            data[min_idx] = data[i]; 
            data[i] = temp; 
        } 
        return data; 
	}
	
	private ArrayList<Integer> selection(ArrayList<Integer> data) {
		int n = data.size(); 
		   
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (data.get(j) < data.get(min_idx)) 
                    min_idx = j; 
  
            data.set(i, data.set(min_idx, data.get(i)));
        } 
        return data; 
	}
	
	private ArrayList<String> selection(boolean test, ArrayList<String> data) {
		int n = data.size(); 
		   
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (Integer.parseInt(data.get(j)) < Integer.parseInt(data.get(min_idx))) 
                    min_idx = j; 
  
            data.set(i, data.set(min_idx, data.get(i)));
        } 
        return data; 
	}

	private int[] insertion(int[] data) {
		int n = data.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = data[i]; 
            int j = i-1; 
  
            while (j>=0 && data[j] > key) 
            { 
                data[j+1] = data[j]; 
                j = j-1; 
            } 
            data[j+1] = key; 
        }  
        return data; 
	}

	private String[] insertion(String[] data) {
		int n = data.length; 
        for (int i=1; i<n; ++i) 
        { 
            String key = data[i]; 
            int j = i-1; 
  
            while (j>=0 && Integer.parseInt(data[j]) > Integer.parseInt(key)) 
            { 
                data[j+1] = data[j]; 
                j = j-1; 
            } 
            data[j+1] = key; 
        }  
        return data; 
	}
	
	private ArrayList<Integer> insertion(ArrayList<Integer> data) {
		int n = data.size(); 
        for (int i=1; i<n; ++i) 
        { 
            int key = data.get(i); 
            int j = i-1; 
  
            while (j>=0 && data.get(j) > key) 
            { 
            	data.set(j+1, data.get(j));
            } 
            data.set(j + 1, key); 
        }  
        return data; 
	}

	private ArrayList<String> insertion(boolean test, ArrayList<String> data) {
		int n = data.size(); 
        for (int i=1; i<n; ++i) 
        { 
            String key = data.get(i); 
            int j = i-1; 
  
            while (j>=0 && Integer.parseInt(data.get(j)) > Integer.parseInt(key)) 
            { 
            	data.set(j+1, data.get(j));
            } 
            data.set(j + 1, key); 
        }  
        return data; 
	}

	private int[] merge(int[] data) {
		int length = data.length;
		int mid = (int) length/2;
		
		if (length < 2) {
			return data;
		}
		
		int[] ar1 = new int[mid];
		for (int i = 0; i < mid; i++) {
			ar1[i] = data[i];
		}
		int[] ar2 = new int[length - mid];
		for (int i = mid; i < length; i++) {
			ar2[i-mid] = data[i];
		}
		
		ar1 = merge(ar1);
		ar2 = merge(ar2);
		
		int i = 0;
		int j = 0;
		int k = 0;
	    while (i < mid && j < (length-mid)) {
	        if (ar1[i] <= ar2[j]) {
	        	data[k++] = ar1[i++];
	        }
	        else {
	        	data[k++] = ar2[j++];
	        }
	    }
	    while (i < mid) {
	    	data[k++] = ar1[i++];
	    }
	    while (j < (length-mid)) {
	    	data[k++] = ar2[j++];
	    }
	    return data; 
	}
	
	private String[] merge(String[] data) {
		int length = data.length;
		int mid = (int) length/2;
		
		if (length < 2) {
			return data;
		}
		
		String[] ar1 = new String[mid];
		for (int i = 0; i < mid; i++) {
			ar1[i] = data[i];
		}
		String[] ar2 = new String[length - mid];
		for (int i = mid; i < length; i++) {
			ar2[i-mid] = data[i];
		}
		
		ar1 = merge(ar1);
		ar2 = merge(ar2);
		
		int i = 0;
		int j = 0;
		int k = 0;
	    while (i < mid && j < (length-mid)) {
	        if (Integer.parseInt(ar1[i]) <= Integer.parseInt(ar2[j])) {
	        	data[k++] = ar1[i++];
	        }
	        else {
	        	data[k++] = ar2[j++];
	        }
	    }
	    while (i < mid) {
	    	data[k++] = ar1[i++];
	    }
	    while (j < (length-mid)) {
	    	data[k++] = ar2[j++];
	    }
	    return data; 
	}
	
	private ArrayList<Integer> merge(ArrayList<Integer> data) {
		int length = data.size();
		int mid = (int) length/2;
		
		if (length < 2) {
			return data;
		}
		
		int[] ar1 = new int[mid];
		for (int i = 0; i < mid; i++) {
			ar1[i] = data.get(i);
		}
		int[] ar2 = new int[length - mid];
		for (int i = mid; i < length; i++) {
			ar2[i-mid] = data.get(i);
		}
		
		ar1 = merge(ar1);
		ar2 = merge(ar2);
		
		int i = 0;
		int j = 0;
		int k = 0;
	    while (i < mid && j < (length-mid)) {
	        if (ar1[i] <= ar2[j]) {
	        	data.set(k++, ar1[i++]);
	        }
	        else {
	        	data.set(k++, ar2[j++]); 
	        }
	    }
	    while (i < mid) {
	    	data.set(k++, ar1[i++]);
	    }
	    while (j < (length-mid)) {
	    	data.set(k++, ar2[j++]);
	    }
	    return data; 
	}
	
	private ArrayList<String> merge(boolean test, ArrayList<String> data) {
		int length = data.size();
		int mid = (int) length/2;
		
		if (length < 2) {
			return data;
		}
		
		ArrayList<String> ar1 = new ArrayList<String>(mid);
		for (int i = 0; i < mid; i++) {
			ar1.set(i, data.get(i));
		}
		ArrayList<String> ar2 = new ArrayList<String>(length - mid); 
		for (int i = mid; i < length; i++) {
			ar2.set(i-mid, data.get(i));
		}
		
		ar1 = merge(false, ar1);
		ar2 = merge(false, ar2);
		
		int i = 0;
		int j = 0;
		int k = 0;
	    while (i < mid && j < (length-mid)) {
	        if (Integer.parseInt(ar1.get(i)) <= Integer.parseInt(ar2.get(j))) {
	        	data.set(k++, ar1.get(i++));
	        }
	        else {
	        	data.set(k++, ar2.get(j++)); 
	        }
	    }
	    while (i < mid) {
	    	data.set(k++, ar1.get(i++));
	    }
	    while (j < (length-mid)) {
	    	data.set(k++, ar2.get(j++));
	    }
	    return data; 
	}

	private int linear(int[] data, int x) { 
		data = bubble(data); 
		int n = data.length; 
	    for(int i = 0; i < n; i++) 
	    { 
	        if(data[i] == x) 
	            return i; 
	    } 
	    return -1; 
	}
	
	private int linear(String[] data, int x) { 
		data = bubble(data); 
		int n = data.length; 
	    for(int i = 0; i < n; i++) 
	    { 
	        if(Integer.parseInt(data[i]) == x) 
	            return i; 
	    } 
	    return -1; 
	}
	
	private int linear(ArrayList<Integer> data, int x) { 
		data = bubble(data); 
		int n = data.size(); 
	    for(int i = 0; i < n; i++) 
	    { 
	        if(data.get(i) == x) 
	            return i; 
	    } 
	    return -1; 
	}
	
	private int linear(boolean test, ArrayList<String> data, int x) { 
		int n = data.size(); 
	    for(int i = 0; i < n; i++) 
	    { 
	        if(Integer.parseInt(data.get(i)) == x) 
	            return i; 
	    } 
	    return -1; 
	}
	
	private int binary(int[] data, int x) {
		data = bubble(data);
		int start = 0;
		int end = data.length - 1;	
		int position = -1;
		while (start <= end) {
			position = (int) ((end + start) / 2);
			if (data[position] > x) {
				end = position - 1;
			} else if (data[position] < x) {
				start = position + 1; 
			} else {
				return position;
			}
		}
		return -1;
	}
	
	private int binary(String[] data, int x) {
		data = bubble(data);
		int start = 0;
		int end = data.length - 1;	
		int position = -1;
		while (start <= end) {
			position = (int) ((end + start) / 2);
			if (Integer.parseInt(data[position]) > x) {
				end = position - 1;
			} else if (Integer.parseInt(data[position]) < x) {
				start = position + 1; 
			} else {
				return position;
			}
		}
		return -1;
	}
	
	private int binary(ArrayList<Integer> data, int x) {
		data = bubble(data);
		int start = 0;
		int end = data.size() - 1;	
		int position = -1;
		while (start <= end) {
			position = (int) ((end + start) / 2);
			if (data.get(position) > x) {
				end = position - 1;
			} else if (data.get(position) < x) {
				start = position + 1; 
			} else {
				return position;
			}
		}
		return -1;
	}
	
	private int binary(boolean test, ArrayList<String> data, int x) {
		int start = 0;
		int end = data.size() - 1;	
		int position = -1;
		while (start <= end) {
			position = (int) ((end + start) / 2);
			if (Integer.parseInt(data.get(position)) > x) {
				end = position - 1;
			} else if (Integer.parseInt(data.get(position)) < x) {
				start = position + 1; 
			} else {
				return position;
			}
		}
		return -1;
	}
}