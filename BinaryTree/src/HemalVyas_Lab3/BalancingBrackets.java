package HemalVyas_Lab3;

import java.util.Stack;

public class BalancingBrackets {
	static boolean findBalance(String inStr){
		boolean returnValue = false;
		
		Stack<Character> inStack = new Stack<>();
		
		for(int i=0; i < inStr.length(); i++) {
			char inChar = inStr.charAt(i);
			
			if(inChar == '(' || inChar == '[' || inChar == '{') {
				inStack.push(inChar);
				continue;
			}
			
			if(inStack.isEmpty()){
				returnValue = false;
				break;
			}
			if(inChar == ')') {
				char stackChar = inStack.pop();
				if(stackChar == '(')
					returnValue = true;
				else {
					returnValue= false;
					break;
				}
			}
			if(inChar == '}') {
				char stackChar = inStack.pop();
				if(stackChar == '{')
					returnValue = true;
				else {
					returnValue= false;
					break;
				}
			}
			if(inChar == ']') {
				char stackChar = inStack.pop();
				if(stackChar == '[')
					returnValue = true;
				else {
					returnValue= false;
					break;
				}
			}
		}
		return returnValue;
	}
	public static void main(String[] args) {
		String str = "([[{}]])";
		if(findBalance(str)) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		
		str = "([[{}]]))";
		if(findBalance(str)) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		
		str = "(2+[3-[4*{7+9}]])";
		if(findBalance(str)) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}