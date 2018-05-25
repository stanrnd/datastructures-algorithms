package com.stanrnd.tutorial;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	
	private int data;
	
	private TreeNode left;
	
	private TreeNode right;

	public TreeNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public TreeNode getRight() {
		return right;
	}
	
	public TreeNode find(int data) {
		if(this.data == data) {
			return this;
		} else if(this.left != null && this.data > data) {
			return this.left.find(data);
		} else if(this.right != null && this.data < data) {
			return this.right.find(data);
		} else {
			return null;
		}
	}
	
	private void preorder(List<Integer> list) {
		list.add(this.data);
		if(this.left != null) {
			this.left.preorder(list);
		}
		if(this.right != null) {
			this.right.preorder(list);
		}
	}
	
	public List<Integer> preorder() {
		List<Integer> list = new ArrayList<>();
		this.preorder(list);
		return list;
	}
	
	private void inorder(List<Integer> list) {
		if(this.left != null) {
			this.left.inorder(list);
		}
		list.add(this.data);
		if(this.right != null) {
			this.right.inorder(list);
		}
	}
	
	public List<Integer> inorder() {
		List<Integer> list = new ArrayList<>();
		this.inorder(list);
		return list;
	}
	
	private void postorder(List<Integer> list) {
		if(this.left != null) {
			this.left.postorder(list);
		}
		if(this.right != null) {
			this.right.postorder(list);
		}
		list.add(this.data);
	}
	
	public List<Integer> postorder() {
		List<Integer> list = new ArrayList<>();
		this.postorder(list);
		return list;
	}

	public void insert(int data) {
		if(data < this.data) {
			if(this.left != null) {
				left.insert(data);
			} else {
				this.left = new TreeNode(data);
			}
		} else {
			if(this.right != null) {
				this.right.insert(data);
			} else {
				this.right = new TreeNode(data);
			}
		}
	}
	
	public int sum() {
		this.data += (this.left == null ? 0 : this.left.sum()) + (this.right == null ? 0 : this.right.sum());
		if(this.left == null && this.right == null) {
			this.data = 0;
		}
		return this.data;
	}
	
	public void findHighestNoOfBends(boolean isLeft) {
		if(isLeft) {
			if(this.right != null) {
				this.right.findHighestNoOfBends(false);
			}
		} else {
			if(this.left != null) {
				this.left.findHighestNoOfBends(true);
			}
		}
		System.out.println(this.data);
	}
	
	
	@Override
	public String toString() {
		List<Integer> list = new ArrayList<>();
		this.inorder(list);
		return list.toString();
	}
	
}
