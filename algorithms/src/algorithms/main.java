package algorithms;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="Elma";
		String[] productNames = {"Elma","Armut","Üzüm"};
		String[] productNames2 = new String[4];
		
		for(int i =0; i<productNames2.length-1;i++) 
		{
			productNames2[i]=productNames[i];
			
		}
		productNames=productNames2;
		
		
		
		productNames[3]="Kavun";
		System.out.println(productNames[3]);
		
		
	}

}
