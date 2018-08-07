public class NumberObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberObject num = new NumberObject();
		num.parseLong("r1024");
		num.parseLong("1024");
		num.printOtherBase(1024);
	}
	
	public long parseLong(String data) {
		long temp = -1;
		try {
			temp = Long.parseLong(data);
			System.out.println(temp);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(data + " is not a number");
			return -1;
		}
		return temp;
	}
	
	public void printOtherBase(long value) {
		System.out.println("Original :" + value);
		System.out.println("Binary   :" + Long.toBinaryString(value));
		System.out.println("Hex      :" + Long.toHexString(value));
		System.out.println("Octal    :" + Long.toOctalString(value));
	}
}
