package templates;

import element.Document;
import element.List;
import element.Paragraph;
import element.Title;

public class ProjectReportBuilder implements DocumentBuilder{

	Document projectreport = new Document();
	private Title reportTitle = new Title("Project Report");
	private Title introductionTitle = new Title("Introduction");
	private Paragraph introduction = new Paragraph("not set");
	private Title resultTitle = new Title("Result");
	private Paragraph result = new Paragraph("not set");
	private Title referenceTitle = new Title("References");
	private List references = new List();
	
	public ProjectReportBuilder withTitle(String reportTitle) {
		this.reportTitle = new Title(reportTitle);
		return this;
	}


	public ProjectReportBuilder withIntroductionTitle(String introductionTitle) {
		this.introductionTitle = new Title(introductionTitle);
		return this;
	}

	public ProjectReportBuilder withIntroduction(String introduction) {
		this.introduction = new Paragraph(introduction);
		return this;
	}

	public ProjectReportBuilder withResultTitle(String resultTitle) {
		this.resultTitle = new Title(resultTitle);
		return this;
	}

	public ProjectReportBuilder withResult(String result) {
		this.result = new Paragraph(result);
		return this;
	}

	public ProjectReportBuilder withReferenceTitle(String referenceTitle) {
		this.referenceTitle = new Title(referenceTitle);
		return this;
	}

	public ProjectReportBuilder addReference(String reference) {
		this.references.add(new Paragraph(reference));
		return this;
	}

	@Override
	public void build() {
		projectreport.add(reportTitle);
		projectreport.add(introductionTitle);
		projectreport.add(introduction);
		projectreport.add(resultTitle);
		projectreport.add(result);
		projectreport.add(referenceTitle);
		projectreport.add(references);
	}
	
	@Override
	public Document getResult() {
		return projectreport;
	}

}
