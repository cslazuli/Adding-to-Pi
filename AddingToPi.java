
public class AddingToPi {

	public static void main(String[] args) {
		double j = 0;
		double valueNearPi = 0;
		int posNeg = 1;
		
		while ((valueNearPi - 3.1415926) < 0.00001 || (valueNearPi - 3.1415926) > -0.00001) {
			valueNearPi = valueNearPi + (4 * ( posNeg * (1 / ( (2 * j) + 1 ) ) ));
			System.out.println(valueNearPi);
			
			j++;
			posNeg = (posNeg * -1);
			
		}


	}

}
