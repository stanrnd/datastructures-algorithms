package com.stanrnd.tutorial;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(8);
		tree.insert(4);
		tree.insert(12);
		tree.insert(6);
		tree.insert(10);
		tree.insert(1);
		tree.insert(13);
		tree.insert(7);
		tree.insert(5);
		tree.insert(3);
		
		tree.converToSumTree();
		
		System.out.println(tree.find(6));
		
		System.out.println(tree.preorder());
		
		System.out.println(tree.inorder());
		
		System.out.println(tree.postorder());
		
		
	}

}
