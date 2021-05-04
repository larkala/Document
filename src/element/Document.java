package element;

import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class Document implements Element<ArrayList<Element>>{

	private ArrayList<Element> document = new ArrayList<>();

	@Override
	public ArrayList<Element> getContent() {
		return document;
	}

	@Override
	public void print(){
		System.out.println("#### DOCUMENT START ####");
		for(Element e: document) {
			e.print();
			System.out.println();
		}

		System.out.println("#### DOCUMENT END ####");
	}
	
	public Element get(int i) {
		return document.get(i);
	}

	public void add(Element e) {
		document.add(e);
	}
	
	
}
