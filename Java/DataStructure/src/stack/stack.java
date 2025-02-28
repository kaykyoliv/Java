package stack;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {

		// *******************************************************

		// stack = LIFO data structure. Last-In First-Out
		// stores objects into a sort of "vertical tower"
		// push() to add objects to the top
		// pop() to remove objects from the top

		// *******************************************************

		Stack<String> stack = new Stack<String>();

		// System.out.println(stack.empty());

		stack.push("Crossfire");
		stack.push("Minecraft");
		stack.push("Transformice");
		stack.push("DDTank");
		stack.push("GTA V");

		// String myFavGame = stack.pop();
		// System.out.println(stack.peek());
		// System.out.println(stack.search("Fallout76"));
		System.out.println(stack);

	}

}
