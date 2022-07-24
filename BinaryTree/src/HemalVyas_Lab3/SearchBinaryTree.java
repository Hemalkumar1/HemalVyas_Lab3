package HemalVyas_Lab3;

import java.util.Stack;

public class SearchBinaryTree {
	
	public static class Node{
		int data;
		Node left;
		Node right;

		Node(int data){
			this.data = data;
		}
	}
	public class SumOfPair {

		static boolean findPair(Node root, int sum, Stack<Integer> stack)
		{
			if (root == null)
				return false;
			
			if (stack.contains(sum - root.data)) {
				System.out.println("Pair is found ("
						+ (sum - root.data) + ", " 
						+ root.data + ")");
				return true;
			}
			else
				stack.add(root.data);
			
			if (findPair(root.left, sum, stack))
				return true;
			return findPair(root.right, sum, stack);
		}

		public static void printNoPair(Node root, int sum)
		{
			Stack<Integer> stack = new Stack<Integer>();
			if (!findPair(root, sum, stack))
				System.out.println("Pair does not exist");
		}
	}
		public static void main(String[] args) {
			
			Node root = new Node(40);
			root.left = new Node(20);
			root.left.left = new Node(10);
			root.left.right = new Node(30);
			root.right = new Node(60);
			root.right.right = new Node(70);
			root.right.left = new Node(50);
			
			SumOfPair.printNoPair(root, 130);
			SumOfPair.printNoPair(root, 100);
			SumOfPair.printNoPair(root, 190);
			SumOfPair.printNoPair(root, 90);
		}
	}
