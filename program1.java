class program1{
	public static void main (String[] args){
		int num[][]=new int[3][3];
		System.out.println("Hi");
		System.out.println(num.length);
		//System.out.println(num[i].length);
		num[0][2]=19;
		num[0]=new int[5];
		num[1]=new int[2];
		
		System.out.println("Hiiii");
	//	System.out.println(num[i].length);
		System.out.println(num.length);
		for(int i=0;i<num.length;i++)
		{
		System.out.println(num[i].length);
			for(int j=0;j<num[i].length;j++){
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}
}


// quetion 7
// 13/3/24
