package com.stanrnd.tutorial;

import java.util.List;

public class BinaryTree {
	
	private TreeNode root;
	
	public void insert(int data) {
		if(this.root == null) {
			this.root = new TreeNode(data);
		} else {
			this.root.insert(data);
		}
		
	}
	
	public List<Integer> preorder() {
		return root.preorder();
	}
	
	public List<Integer> inorder() {
		return root.inorder();
	}
	
	public List<Integer> postorder() {
		return root.postorder();
	}
	
	public TreeNode find(int x) {
		return root.find(x);
	}
	
	public void converToSumTree() {
		root.sum();
	}
	
	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		return buffer.toString();
	}
	
}

