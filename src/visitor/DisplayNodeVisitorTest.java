package visitor;

import java.util.ArrayList;
import java.util.List;

public class DisplayNodeVisitorTest {
	public static void main(String[] args) {
		List<Node> nodelists = new ArrayList<Node>();
		Root root = new Root("Topic", "NONE");
		Node nodeA = new Node(root, "a", "right");
		Node nodeA1 = new Node(nodeA, "a1", "right");
		Node nodeAA1 = new Node(nodeA1, "aa1", "right");
		Node nodeR = new Node(root, "r", "left");
		Node nodeR1 = new Node(nodeR, "r1", "left");

		nodelists.add(nodeA);
		nodelists.add(nodeA1);
		nodelists.add(nodeAA1);
		nodelists.add(nodeR);
		nodelists.add(nodeR1);

		System.out.println(root.getName() + ":");
		int rnum = 0;
		int lnum = 0;
		Node checkNode = null;
		String output = "";
		String nodename = "";
		System.out.println("Right nodes:");
		for (int i = 0; i < nodelists.size(); i++) {
			checkNode = nodelists.get(i);
			if (checkNode.getSide().equals("right")) {
				rnum++;
				if (checkNode.getRoot().getName().equals("Topic")) {
					nodename = checkNode.getName();
				}
			}
		}
		output = rnum + " " + nodename + " nodes";
		System.out.println(output);

		System.out.println("Left nodes:");
		for (int i = 0; i < nodelists.size(); i++) {
			checkNode = nodelists.get(i);
			if (checkNode.getSide().equals("left")) {
				lnum++;
				if (checkNode.getRoot().getName().equals("Topic")) {
					nodename = checkNode.getName();
				}
			}
		}
		output = lnum + " " + nodename + " nodes";
		System.out.println(output);

	}

}
