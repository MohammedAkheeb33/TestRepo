package taxCalculator;

public class taxCal {

	public static void main(String[] args) {

		int amount = 1640000;
		int tatalSal = amount;
		int totalTax = 0;
		int taxSlab = 5;
		//asdas
		amount = amount - 250000;

		int taxCount = 5;
		int taxCal = 1;
		while (amount >= 250000 && taxSlab > 0) {
			amount = amount - 250000;
			totalTax = totalTax + ((250000 * taxCount) / 100);
			System.out.println(((250000 * taxCount) / 100));
			taxSlab = taxSlab - 1;
			taxCount = taxCount + 5;

		}
		if (amount < 250000 && taxSlab < 5) {
			totalTax = totalTax + ((amount * taxCount) / 100);
			System.out.println(((amount * taxCount) / 100));
			amount = amount - amount;

		}

		if (taxSlab == 0 && amount > 0) {
			totalTax = totalTax + ((amount * 30) / 100);
			System.out.println(((amount * 30) / 100));
			amount = amount - amount;

		}
		System.out.println("Total Tax amount " + totalTax);
		System.out.println("Total Tax Free Amount " + (tatalSal - totalTax));

		System.out.println("Total Sal monthly " + (tatalSal - totalTax) / 12);

	}

}
