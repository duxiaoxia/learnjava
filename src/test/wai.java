package test;

public class wai {
    
	int i=1;
	
	class nei
	{
		int i =5;
		int ii=6;
		
		public void myVoid()
		{
			System.out.println("�ⲿ��"+ wai.this.i);
		}
	}
	
	public void myVoid()
	{
		nei n = new nei();
		System.out.println("�ڲ�����: "+ n.i);
	}
}
