import java.util.*;
class TwoDToOneD{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter row and columns of the array respectively : ");
		int row = input.nextInt();
		int columns = input.nextInt();
		int arr[][] =new int[row][columns];
		for(int i=0;i<row;i++){
			for(int j=0;j<columns;j++){
				arr[i][j]=input.nextInt();
			}
		}
		int result[]=new int[columns*row];
		int idx =0;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<columns;j++){
				result[idx] =arr[i][j];
				idx++;
			}
		}
		System.out.println("resulting 1D array : ");
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}
		