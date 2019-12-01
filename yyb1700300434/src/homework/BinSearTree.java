package homework;

import java.util.LinkedList;
import java.util.Scanner;

public class BinSearTree {
	
	public class BinSearTreeNode {
		int data;
		BinSearTreeNode left;
		BinSearTreeNode right;
	}
	
	BinSearTreeNode create() {
		Scanner sc = new Scanner(System.in);
		int data;
		BinSearTreeNode node = new BinSearTreeNode();
		data = sc.nextInt();
		if(data == 0) {
			node = null;
		}else {
			node.data = data;
			node.left = create();
			node.right = create();
		}
		return node;
	}
	
	void inOrder(BinSearTreeNode node) {
		LinkedList<BinSearTreeNode> linkStack = new LinkedList<>();
		BinSearTreeNode bt;
		bt = node;
		if(bt == null)
			return;
		linkStack.addFirst(node);
		bt = bt.left;
		while(bt != null ||!linkStack.isEmpty()) {
			while(bt != null) {
				linkStack.addFirst(bt);
				bt = bt.left;
			}
			bt = linkStack.getFirst();
			linkStack.removeFirst();
			System.out.print(bt.data + " ");
			bt = bt.right;
		}
		System.out.println();
	}
	
	//查找方法要为插入方法做准备，所以如果节点不存在，返回其父节点，便于插入
	BinSearTreeNode find(BinSearTreeNode node, int data) {
		BinSearTreeNode bst,parent;
		bst = node;
		parent = node;
		while(bst != null) {
			parent = bst;
			if(bst.data == data) {
				System.out.println("此节点存在");
				return null;
			}
			if(bst.data > data)
				bst = bst.left;
			else
				bst = bst.right;
			
		}
		return parent;
	}
	
	int insert(BinSearTreeNode node, int data) {
		BinSearTree bst = new BinSearTree();
		BinSearTreeNode temp,inode = null;
		temp = bst.find(node, data);
		if(temp == null) {
			return 0;
		}else {
			inode = new BinSearTreeNode();
			inode.data = data;
			inode.left = null;
			inode.right = null;
		}
		
		if(data > temp.data)
			temp.right = inode;
		else
			temp.left = inode;
		return 1;
	}
	
	int delete(BinSearTreeNode node, int data) {
		BinSearTreeNode parent,maxp1,p = new BinSearTreeNode();
		p.data = node.data;
		p.left = node.left;
		p.right = node.right;
		parent = null;
		while(p != null) {
			if(p.data == data)
				break;
			parent = p;
			if(p.data > data) {
				p = p.left;
			}else {
				p = p.right;
			}
		}
		if(p == null) {
			System.out.println("节点不存在");
			return 0;
		}
		if(p.left == null) {
			if(parent == null) {
				node.data = p.right.data;
				node.left = p.right.left;
				node.right = p.right.right;
			}
			else if(parent.left == p)
				parent.left = p.right;
			else
				parent.right = p.right;
		}
		if(p.left != null) {
			maxp1 = p.left;
			while(maxp1.right != null) {
				maxp1 = maxp1.right;
			}
			maxp1.right = p.right;
			if(parent == null) {
				node.data = p.left.data;
				node.left = p.left.left;
				node.right = p.left.right;
			}else if(parent.left == p) {
				parent.left = p.left;
			}else
				parent.right = p.left;
		}
		return 1;
	}
	
}
