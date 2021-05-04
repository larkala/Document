package element;

public class Title implements Element<String>{ 

	private String content;
	
	public Title(String content) {
		this.content = content;
	}

	@Override
	public String getContent() {
		return content;
	}

	@Override
	public void print() {
		System.out.println("<t>" + content + "</t>");
	}
	
	public void editContent(String content) {
		this.content = content;
	}

}
