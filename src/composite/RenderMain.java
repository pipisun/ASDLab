package composite;

import java.util.Enumeration;

public class RenderMain {
	public static void main(String[] args) {

		ComponentRender root = null;
		String name = "<HTML>";
		root = new CompositeRender(name);
		ComponentRender leaf1 = new LeafRender("<HEAD><TITLE>Your Title Here</TITLE></HEAD>");
		ComponentRender leaf2 = new CompositeRender("<BODY>");
		ComponentRender leaf21 = new LeafRender("<CENTER><IMG SRC=\"clouds.jpg\"></CENTER>");
		ComponentRender leaf22 = new LeafRender("<a href=\"http://somegreatsite.com\">Link Name</a>");
		ComponentRender leaf23 = new LeafRender("<H1>This is a Header</H1>");
		ComponentRender leaf24 = new LeafRender("<H2>This is a Medium Header</H2>");
		ComponentRender leaf25 = new LeafRender("<B>This is a new paragraph!</B>");
		ComponentRender leaf26 = new LeafRender("<B><I>This is a new sentence without a paragraph break, in bold italics.</I></B>");
		ComponentRender leaf3 = new LeafRender("</BODY>");
		ComponentRender leaf4 = new LeafRender("</HTML>");
		
		// Create a tree
		root.addChildren(leaf1);
		leaf2.addChildren(leaf21);
		leaf2.addChildren(leaf22);
		leaf2.addChildren(leaf23);
		leaf2.addChildren(leaf24);
		leaf2.addChildren(leaf25);
		leaf2.addChildren(leaf26);
		root.addChildren(leaf2);
		root.addChildren(leaf3);
		root.addChildren(leaf4);
		
		// remove a tree node
//		root.removeChildren(leaf22);
		
		// get a tree node list
		root.printNode();
		printAllChildren(root);
	}
	
	private static void printAllChildren(ComponentRender root) {
		Enumeration<ComponentRender> e = root.getChildren();
		while(e.hasMoreElements()) {
			ComponentRender cr = e.nextElement();
			if(cr instanceof LeafRender) {
				cr.printNode();
			}
			if(cr instanceof CompositeRender) {
				cr.printNode();
				if(cr.getChildren() != null) {
					Enumeration<ComponentRender> e2 = cr.getChildren();
					while(e2.hasMoreElements()) {
						ComponentRender cr2 = e2.nextElement();
						cr2.printNode();
					}
				}
			}
		}
	}
}
