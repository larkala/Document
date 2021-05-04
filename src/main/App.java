package main;

import element.Document;
import element.Element;
import element.List;
import factory.ElementFactory;
import templates.ProjectReportBuilder;
import templates.ProjectReportDirector;

public class App {
	
	public static void main(String[] args) {
		ProjectReportBuilder builder = new ProjectReportBuilder();
		ProjectReportDirector director = new ProjectReportDirector(builder);
		
		director.direct();
		Document myReport = builder.getResult();
		
		myReport.print();
	}
}
