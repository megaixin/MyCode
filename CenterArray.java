//Написать метод, который заполнит массив произвольного размера числами по возрастанию, начинаz с центра массива, 
//например, [5,4,3,2,1,0,1,2,3,4,5]
class CenterArray {
	public static void main (String[]args){
	
		int [] arr = new int [10];
		for (int i = 0;i<arr.length/2;i++){
		
			//arr[arr.length/2] = 0;

			 arr[arr.length/2+i] = i;
			 arr[arr.length/2-i] = i;
			
			//arr[arr.length/1+1] = 1;
			//arr[arr.length/1-1] = 1;
		}
		

		
		
		writeArrayOnConsole(arr);
		
		/*
		к примеру нам дан массив из 9 чисел который надо заполнить числами по возрастанию начиная от центра.
		прежде всего надо отыскать точку отсчета в массиве от которой начнут заполняться все остальные ячейки.
		как отыскать центр массива? поделить его длинну пополам.
		[0,0,0,0,0,0,0,0,0]
		[0,0,0,1,0,1,0,0,0]
		[0,0,2,1,0,1,2,0,0]
		[0,3,2,1,0,1,2,3,0]
		[4,3,2,1,0,1,2,3,4]
	
		myArr.length/2; 
		то есть в методе int i = myArr.length/2;
		начиная с центра, первое число ноль, а дальше по возрастанию по обе стороны.
		
		*/
		
		
	}

	
	
	
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
}