package Practice;

public class Electric {

	public static int calculateBill(int units) {
		int price = 10;
		int total = 0, sum = 0;
		if (units <= 100) {
			total = units * price;
			return total;
		}
		int loops = units / 100;
		for (int i = 0; i < loops; i++) {
			int remainder = units - 100;
			units = remainder;
			sum = 100 * price;
			price += 5;
			total += sum;
			if (units <= 100 || price == 25) {
				sum = remainder * price;
				total += sum;
				return total;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		int units = 500;
		int result = calculateBill(units);
		System.out.println(result);
	}
}
