package homework;

import java.util.LinkedList;
import java.util.Scanner;

public class BinTree {
	
	BinTreeNode createBinTree() {
		Scanner sc = new Scanner(System.in);
		String ch;
		BinTreeNode node;
		ch = sc.nextLine();
		if("@".equals(ch)) {
			node = null;
		}else {
			node = new BinTreeNode();
			node.data = ch;
			node.left = createBinTree();
			node.right = createBinTree();
		}
		return node;
	}
	
	void preOrder(BinTreeNode node) {
		LinkedList<BinTreeNode> linkStack = new LinkedList<>();
		linkStack.add(node);
		BinTreeNode temp;
		while(!linkStack.isEmpty()) {
			temp = linkStack.getFirst();
			linkStack.removeFirst();
			if(temp.right != null) {
				linkStack.addFirst(temp.right);
			}
			if(temp.left != null) {
				linkStack.addFirst(temp.left);
			}
			System.out.print(temp.data + "||");
		}
	}
	
	void inOrder(BinTreeNode node) {
		LinkedList<BinTreeNode> linkStack = new LinkedList<>();
		BinTreeNode bt;
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
			System.out.println(bt.data);
			bt = bt.right;
		}
	}
	
	BinTreeNode lastNode(BinTreeNode head) {
		BinTreeNode temp = head;
		while(temp.right != null || temp.left != null) {
			if(temp.right != null)
				temp = temp.right;
			else
				temp = temp.left;
		}
		return temp;
	}
	
	
}
