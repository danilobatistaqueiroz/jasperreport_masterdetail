package com.labs.report;

import java.io.File;
import java.util.List;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class GenerateReport 
{
	private String path;
	
	private String pathToReportPackage;
	
	public GenerateReport() {
		this.path = this.getClass().getClassLoader().getResource("").getPath();
		this.pathToReportPackage = this.path + "com/labs/jasper/";
		System.out.println(path);
	}
	
	
	@SuppressWarnings("rawtypes")
	public void generate(List data, String reportName) throws Exception	
	{
		JasperReport report = JasperCompileManager.compileReport(this.getPathToReportPackage() + reportName + ".jrxml");

		JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(data));
		
		File filePath = new File("F:/java/jasperreports/" + reportName + ".pdf");
		System.out.println("generating:"+filePath);

		JasperExportManager.exportReportToPdfFile(print, filePath.getAbsolutePath());		
	}

	public String getPathToReportPackage() {
		return this.pathToReportPackage;
	}
	
	public String getPath() {
		return this.path;
	}
}