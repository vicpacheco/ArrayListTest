import java.io.IOException;

public class findArray {
	public static void main(String[] args) throws IOException 
	{
		int[] input = {1,2,3,4,15,9,7,5};
		int [] output = new int[8];
		int s = 26;
		int s1 = 0;
		find(input, s1, 1, s, output);
			
	}

	public static void find(int[] A, int currSum, int index, int sum,
			int[] solution) {
		int total =0;
		if (currSum == sum) {
			System.out.println("\nSum found");
			for (int i = 0; i < solution.length; i++) {
				if (solution[i] == 1) {
					System.out.print("  " + A[i]);
					total += A[i];
				}		
			}
			System.out.print(" = " + total);

		} else if (index == A.length) {
			return;
		} else {
			solution[index] = 1;// select the element
			currSum += A[index];
			find(A, currSum, index + 1, sum, solution);

			solution[index] = 0;// do not select the element
			currSum -= A[index];
			find(A, currSum, index + 1, sum, solution);
		}
		return;
	}
}
