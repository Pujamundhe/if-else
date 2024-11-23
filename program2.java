import java.util.*;
class program2{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("anter size");
		int size= sc.nextInt();
		System.out.print("enter the  array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
	         int max=0;
		for(int i=0;i<size;i++){
			

			if(arr[i]>max){
				 max =arr[i];
			}
		}
		System.out.print(arr[i]);
	}
}



