package javamethods;

public class classmethod {
	static int x, y, z;

	public void sum() {
		int a = 5;
		int b = 3;
		int c = a + b;
		System.out.println(c);
	}

	public float divide() {
		float e = 23;
		float f = 85;
		float g = e / f;

		return g;
	}

	public int subtract() {
		int i = 23;
		int j = 85;
		int k = j - i;

		return k;
	}

	public void multiply() {
		x = 5;
		y = 6;
		z = x * y;

	}

	public static void main(String[] args) {

		classmethod cd = new classmethod();

		cd.sum();

		cd.divide();
		int e = cd.subtract();
		System.out.println(e);

		cd.divide();
		float s = cd.divide();
		System.out.println(s);

		cd.multiply();
		System.out.println(z);

	}

}
