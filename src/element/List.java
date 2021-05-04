package element;

import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class List implements Element<ArrayList<Element>>{

	private ArrayList<Element> list = new ArrayList<>();
	
	@Override
	public ArrayList<Element> getContent() {
		return list;
	}
	
	@Override
	public void print(){
		System.out.println("<list>");
		for(Element e: list)
			System.out.println("• "+ e.getContent());
		System.out.println("</list>");
	}

	public void add(Element e) {
		list.add(e);
	}
	
	public Element get(int i) {
		return list.get(i);
	}
	
}
