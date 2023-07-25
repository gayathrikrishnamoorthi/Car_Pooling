package gayathri;

import java.util.Scanner;

public class Car {

	    static boolean possibleOrNot(int[][] A, int capacity) {
	        int maxEnd = 0;
	        for (int i = 0; i < A.length; i++) {
	            maxEnd = Math.max(maxEnd, A[i][2]);
	        }
	        
	        int[] passengers = new int[maxEnd];
	        for (int i = 0; i < A.length; i++) {
	            for (int j = A[i][1]; j < A[i][2]; j++) {
	                passengers[j] += A[i][0];
	                if (passengers[j] > capacity) {
	                    return false;
	                }
	            }
	        }
	        
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int m = scanner.nextInt();
	        int[][] A = new int[n][m];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                A[i][j] = scanner.nextInt();
	            }
	        }
	        int capacity = scanner.nextInt();
	        boolean check = possibleOrNot(A, capacity);
	        System.out.println(check);
	    
	}

}
