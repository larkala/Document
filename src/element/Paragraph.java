package element;

public class Paragraph implements Element<String>{

	private String content;
	
	public Paragraph(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

	@Override
	public void print() {
		System.out.println("<p>" + content + "</p>");
	}

	public void editContent(String content) {
		this.content = content;
	}


}
