package com.inner;

public class Aa {

	private static int num2 =0;
	
	private int num ;
	
	//��Ա�ڲ���
	public class Ba{
		
		public void showBa(){
			num++;
			System.out.println("---------Ba");
		}
	}
	
    private class Ca{
		
		public void showBa(){
			System.out.println("---------Ca");
		}
	}
	
    public Ca getCa(){
    	
    	return new Ca();
    }
    
    // ��̬Ƕ����
    static class Da{
		
		public static void showBa(){
			//num++;
			num2++;
			System.out.println("---------Da");
		}
	}

	public void showAa(){
		System.out.println("----------Aa");
	}
	
	public static void main(String[] args) {
		Aa.Ca  c1 = new Aa().getCa();
	}
}
