//������� ����� ��������� �������, ������� ��������� ����� ����� ������. ���� ���� ����� � ������� ��� - ������� 0
class NullArray{
	public static void main (String[]args){
		
		int[]myArr = {6,0,5,5,10,0,1};
		
		// ������������� ���������� ����� 1 (������ ������� � ������� ������ 0)
		int firstNullPosition = 0;
		//������������� ���������� ����� 2 (������ ������� � ������� ������ 0)
		int secondNullPosition = 0;
		
		//����� ���� (��� ������� ����)
		for (int i = 0;i<myArr.length;i++){
			// ���� ������� ������� ������� = 0
			if (myArr[i]==0){
				//�� ������ ��� � ����������(��������� 1-� ����)
				firstNullPosition = i;
			break;
			}
			
		}			
		System.out.println("������ ���� �� ������� - "+ firstNullPosition);
		
		/*//����� ����(��� ������� ����)
		for (int i = firstNullPosition;i<myArr.length;i++){
			//���� ������� ������� ������� = 0 {
			if (myArr[i]==0){
				//�� ������ ��� �� ������ ����������(��������� 2-� ����)
				secondNullPosition = i;
			}
		
		}
		 System.out.println("������ ���� �� ������� - "+ secondNullPosition );
		/*
		����� �������� � ������������ ������� ���� � ������� ������ ���������� �����. 
		*/
	}
}