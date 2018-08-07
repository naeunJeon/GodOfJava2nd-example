package chapter02;

public class UseStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseStringMethods use = new UseStringMethods();
		String str = "The String class represents charater strings.";
		
		use.findString(str, "string");
		use.findAnyCaseString(str, "string");
		use.countChar(str, 's');
		use.printContainWords(str, "ss");
	}
	
	public void findString(String str, String findStr){
		int idx = str.indexOf(findStr);
		System.out.println("String is appeared at " + idx);
	}
	
	public void findAnyCaseString(String str, String findStr) {
		str = str.toLowerCase();
		int idx = str.indexOf(findStr);
		System.out.println("String is appeared at " + idx);
	}
	
	public void countChar(String str, char c) {
		char[] charArr = str.toCharArray();
		int count = 0;
		for(char tempChar : charArr) {
			if(tempChar == c) {
				count ++;
			}
		}
		System.out.println("Char 's' count is " + count);
	}
	
	public void printContainWords(String str, String findStr) {
		String[] words = str.split(" ");
		String word = "";
		for(String tempStr : words) {
			if(tempStr.contains("ss")) {
				word = tempStr;
			}
		}
		System.out.println(word + " contains ss");
	}
}

















