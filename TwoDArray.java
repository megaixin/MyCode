/*C������ ��������� ������ �� 6 ����� �� 7 �������� � ������ �� ��������� ����� ����� �� ������� [0;9]. 
������� ������ �� �����. ������������� ������ ����� �������, ����� �� ������ ����� � ������ ������ ����� �� ���������� �������.
��� ���� �������� ������ ������� ������, � ����� ������ ������������ �������� � ������ ����� ������. 
������� ��������� ��������� ������ �� ����� (�.�. ����� ��������� ������ ���� ������������, � ����� ������������� �� �������� ������ ������).
������� ��������������� ������ �� �����.*/
class TwoDArray{
	public static void main (String[]args){
		//C������ ��������� ������ �� 6 ����� �� 7 �������� � ������ �� ��������� ����� ����� �� ������� [0;9]. 
		int [][] myTwoDArr = new int[6][7];//������ - 6 ������� - 7
		
		for(int i = 0;i<6;i++){
			for(int j =0;j<7;j++){
				myTwoDArr[i][j] = (int)(Math.random()*10);
			}
		
		}
		
		int myMaxValOfArray = myTwoDArr[0][0];
		//������� ���� ���������� ������
		for(int i = 0;i< myTwoDArr.length;i++){
				
			//���������� ���� ���������� �������
			for(int j = 0;j< myTwoDArr.length;j++){
				//���� ������������ �������� ������ �������� �������� �������� 
				if(myMaxValOfArray < myTwoDArr[i][j]){
					//������������ ��������� ���������� ������� ��������
					myMaxValOfArray = myTwoDArr[i][j];
				}	
				//myMaxValOfArray = myTwoDArr[i][0];
				//myTwoDArr[i][0] = myMaxValOfArray;
				System.out.println(myTwoDArr[i][j]);
			}
			System.out.println();
			
			
		}
		System.out.print(myMaxValOfArray+" ");
		
	}
	
}
