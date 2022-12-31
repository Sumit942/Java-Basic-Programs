package com.demo.algorithms;

public class BinarySearchTree {

	public static class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int data) {

		Node newNode = new Node(data);

		if (root == null) {

			root = newNode;
		} else {

			Node current = root, parent = null;

			while (true) {

				parent = current;

				if (newNode.data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public void print(Node node) {

		if (node == null)
			return;
		
		if (node.left != null)
			print(node.left);
		System.out.println(node.data + " ");
		
		if (node.right != null)
			print(node.right);
	}

}

class MainApp {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(1);
		bst.insert(31);
		bst.insert(10);
		bst.insert(11);
		bst.insert(41);
		bst.insert(10);
		bst.insert(12);
		bst.insert(20);

		bst.print(bst.root);
	}
}