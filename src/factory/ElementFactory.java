package factory;

import element.Element;
import element.List;
import element.Paragraph;
import element.Title;

public class ElementFactory {

	/**
	 * Creates and returns an element. If a list is selected as the element, the content will be added as the first element of the list as a paragraph.
	 * @param e ElementType. 
	 * @param content
	 * @return
	 */
	public static Element create(ElementType e, String content) {

		switch (e) {
		case TITLE:
			return new Title(content);
		case PARAGRAPH:
			return new Paragraph(content);
		case LIST:
			List li = new List();
			Paragraph p = new Paragraph(content);
			li.add(p);
			return li;
		//It's never going to reach this case since syntax won't allow it. But just in case!
		default:
			throw new RuntimeException("Please enter a valid ElementType. The following are valid ElementTypes: \n" + java.util.Arrays.asList(ElementType.values()));
		}

	}
}
