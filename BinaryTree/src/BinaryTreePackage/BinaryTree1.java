package BinaryTreePackage;
import java.util.Scanner;
public class BinaryTree1 {
	int arr[], numberElements, i;
	Scanner sc = new Scanner(System.in);
	public int[] insertValues() {
		System.out.println("Enter the number of nodes in binary tree");
		numberElements = sc.nextInt();
		arr = new int[numberElements + 1];
		System.out.println("Enter the nodes of the tree");
		for (i=1;i<=numberElements;i++)  {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public int[] insertElement(int tree[],int ele) {
		int newTree[] = new int[tree.length + 1];
		int i;
		for (i=1;i<tree.length;i++) {
			newTree[i] = tree[i];
		}
		newTree[i] = ele;
		return newTree;
	}
	
	public int[] deleteElement(int tree[],int ele) {
		int deletePos = -1;
		int rightMostLeaf = tree.length - 1;
		for (int i=1; i < tree.length; i++) {
			if (tree[i] == ele)
				deletePos = i;
			if (tree[i] == 0) {
				rightMostLeaf = i - 1;
				break;
			}
		}
		if (deletePos != -1) {
			tree[deletePos] = tree[rightMostLeaf];
			tree[rightMostLeaf] = 0;
		}
		return tree;
	}

	public void printTree(int[] tree) {
		System.out.println("Elements of tree are as follows:");
		for (int i=1;i<tree.length;i++) {
			System.out.print(tree[i] + " ");
		}
		System.out.println();
	}
	
public static void main(String[] args) {
	BinaryTree1 tree = new BinaryTree1();
	int[] treeArray = tree.insertValues();
	tree.printTree(treeArray);
	
	treeArray = tree.insertElement(treeArray, 55);
	tree.printTree(treeArray);
	
	treeArray = tree.deleteElement(treeArray, 70);
	tree.printTree(treeArray);
}
}
