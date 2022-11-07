package WeightConverter;

public class WeghtConvert {
	
	int kiloWeight;
	int poundWeight;
	
	public int kiloToPound(int kilo) {
		try {
			poundWeight = kilo * 2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
		return poundWeight;
	}
	
	public int poundToKilo(int pound) {
		kiloWeight = pound / 2 ;
		
		return kiloWeight;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeghtConvert k = new WeghtConvert();
		System.out.println(k.kiloToPound(50));
		System.out.println(k.poundToKilo(110));
		
	}
}