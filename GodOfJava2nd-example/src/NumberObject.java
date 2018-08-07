
public class NumberObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberObject num = new NumberObject();
		String data = "r1024";
		if(num.parseLong(data)==-1) {
			System.out.println(data + " is not a number");
		} else {
			System.out.println(data);
		}
		
		num.printOtherBase(1024);
	}
	
	public long parseLong(String data) {
		long temp = 0;
		try {
			temp = Long.parseLong(data);
		} catch (NumberFormatException e) {
			// TODO: handle exception
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
