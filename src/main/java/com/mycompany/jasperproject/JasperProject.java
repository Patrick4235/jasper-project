/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jasperproject;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author estudiante
 */
public class JasperProject {

    public static void main(String[] args) {
        try{
            JasperReport jasperReport = null;
            JasperPrint jasperPrint = null;
            JasperDesign jasperDesign = null;
            Map parameters = new HashMap();
            jasperDesign = JRXmlLoader.load("C:\\Users\\estudiante\\Documents\\NetBeansProjects\\JasperProject\\src\\main\\java\\ListaPersona.jrxml");
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, 
                    new JRBeanCollectionDataSource(Datos.generaDatosPersona()));
            JasperExportManager.exportReportToPdfFile(jasperPrint, "target/ListaPersona.pdf");
            JasperViewer.viewReport(jasperPrint); 
        
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
}
