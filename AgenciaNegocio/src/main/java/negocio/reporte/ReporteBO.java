/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.reporte;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import conexion.ConexionDAO;
import conexion.IConexionDAO;
import daos.reporte.IReporteDAO;
import daos.reporte.ReporteDAO;
import entidadesJPA.Licencia;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class ReporteBO implements IReporte {
    IConexionDAO conexionDAO = new ConexionDAO();
    IReporteDAO reporteDAO = new ReporteDAO(conexionDAO);
    
    public ReporteBO(IConexionDAO conexionDAO) {
        this.conexionDAO = conexionDAO;
    }
    
    @Override
    public List<Tramite> obtenerReportePorNombre(String nombre) {
        return this.reporteDAO.obtenerReportePorNombre(nombre);
    }
    
    @Override
    public List<Tramite> obtenerReportePorFechas(Date inicio, Date fin) {
        return this.reporteDAO.obtenerReportePorFechas(inicio, fin);
    }
    
    @Override
     public List<Placa> obtenerTodasLasPlacas() {
         return this.reporteDAO.obtenerTodasLasPlacas();
     }
     
    @Override
     public List<Licencia> obtenerTodasLasLicencias() {
         return this.reporteDAO.obtenerTodasLasLicencias();
     }
     
    @Override
     public List<Tramite> obtenerTodosLosTramites() {
         return this.reporteDAO.obtenerTodosLosTramites();
     }
     
    @Override
     public void generarReportePlacas(List<Placa> placas) {
     Document doc = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream("ReporteTramites.pdf"));

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Trámites", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("Fecha");
            tabla.addCell("Costo");
            tabla.addCell("Tramite");
            tabla.addCell("Persona");

            for (Placa placa : placas) {
                Calendar fechaExpedicionCalendar = placa.getFechaExpedicion();
                Date fechaExpedicion = (fechaExpedicionCalendar != null) ? fechaExpedicionCalendar.getTime() : null;
                String fechaExpedicionString = (fechaExpedicion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaExpedicion) : "NoDate";

                tabla.addCell(fechaExpedicionString);
                tabla.addCell(String.valueOf(placa.getCosto()));
                tabla.addCell("Expedición de Placas");
                String nombreCompleto = placa.getPersona().getNombre() + " " + placa.getPersona().getApellidoPaterno();
                tabla.addCell(nombreCompleto);
            }

            Phrase piePagina = new Phrase("AGENCIA FISCAL - Página 1");
            PdfPCell celda = new PdfPCell(piePagina);
            celda.setHorizontalAlignment(Element.ALIGN_CENTER);
            celda.setBorder(Rectangle.NO_BORDER);
            celda.setColspan(4);
            tabla.addCell(celda);

            doc.open();
            doc.add(titulo);
            doc.add(Chunk.NEWLINE);
            doc.add(fecha);
            doc.add(Chunk.NEWLINE);
            doc.add(Chunk.NEWLINE);
            doc.add(tabla);
            doc.close();

            JOptionPane.showMessageDialog(null, "PDF exportado! ruta: AgenciaPresentacion ", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
     }
     
    @Override
     public void generarReporteLicencias(List<Licencia> licencias) {
     Document doc = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream("ReporteTramites.pdf"));

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Trámites", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Fecha");
            tabla.addCell("Costo");
            tabla.addCell("Tramite");
            tabla.addCell("Vigencia");
            tabla.addCell("Persona");

            for (Licencia licencia : licencias) {
                Calendar fechaExpedicionCalendar = licencia.getFechaExpedicion();
                Date fechaExpedicion = (fechaExpedicionCalendar != null) ? fechaExpedicionCalendar.getTime() : null;
                String fechaExpedicionString = (fechaExpedicion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaExpedicion) : "NoDate";
                Calendar fechaVigenciaCalendar = licencia.getVigencia();
                Date fechaVigencia = (fechaVigenciaCalendar != null) ? fechaVigenciaCalendar.getTime() : null;
                String fechaVigenciaString = (fechaVigencia != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaVigencia) : "NoDate";
                
                tabla.addCell(fechaExpedicionString);
                tabla.addCell(String.valueOf(licencia.getCosto()));
                tabla.addCell("Expedición de Licencias");
                tabla.addCell(fechaVigenciaString);
                String nombreCompleto = licencia.getPersona().getNombre() + " " + licencia.getPersona().getApellidoPaterno();
                tabla.addCell(nombreCompleto);
            }

            Phrase piePagina = new Phrase("AGENCIA FISCAL - Página 1");
            PdfPCell celda = new PdfPCell(piePagina);
            celda.setHorizontalAlignment(Element.ALIGN_CENTER);
            celda.setBorder(Rectangle.NO_BORDER);
            celda.setColspan(4);
            tabla.addCell(celda);

            doc.open();
            doc.add(titulo);
            doc.add(Chunk.NEWLINE);
            doc.add(fecha);
            doc.add(Chunk.NEWLINE);
            doc.add(Chunk.NEWLINE);
            doc.add(tabla);
            doc.close();

            JOptionPane.showMessageDialog(null, "PDF exportado! ruta: AgenciaPresentacion ", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
     }
     
    @Override
     public void generarReporteTramites(List<Tramite> tramites) {
     Document doc = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream("ReporteTramites.pdf"));

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Trámites", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Fecha");
            tabla.addCell("Costo");
            tabla.addCell("Estado");
            tabla.addCell("Persona");
            tabla.addCell("Tramite");

            for (Tramite tramite : tramites) {
                Calendar fechaExpedicionCalendar = tramite.getFechaExpedicion();
                Date fechaExpedicion = (fechaExpedicionCalendar != null) ? fechaExpedicionCalendar.getTime() : null;
                String fechaExpedicionString = (fechaExpedicion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaExpedicion) : "NoDate";
                
                tabla.addCell(fechaExpedicionString);
                tabla.addCell(String.valueOf(tramite.getCosto()));
                tabla.addCell(String.valueOf(tramite.getEstado()));
                String nombreCompleto = tramite.getPersona().getNombre() + " " + tramite.getPersona().getApellidoPaterno();
                tabla.addCell(nombreCompleto);
                tabla.addCell(tramite.getDecriminatorValue());
            }

            Phrase piePagina = new Phrase("AGENCIA FISCAL - Página 1");
            PdfPCell celda = new PdfPCell(piePagina);
            celda.setHorizontalAlignment(Element.ALIGN_CENTER);
            celda.setBorder(Rectangle.NO_BORDER);
            celda.setColspan(4);
            tabla.addCell(celda);

            doc.open();
            doc.add(titulo);
            doc.add(Chunk.NEWLINE);
            doc.add(fecha);
            doc.add(Chunk.NEWLINE);
            doc.add(Chunk.NEWLINE);
            doc.add(tabla);
            doc.close();

            JOptionPane.showMessageDialog(null, "PDF exportado! ruta: AgenciaPresentacion ", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
     }
     
    @Override
     public List<Tramite> buscarTramites(Date fechaInicio, Date fechaFin, String nombre) {
         return this.reporteDAO.buscarTramites(fechaInicio, fechaFin, nombre);
     }
     
    @Override
     public List<Licencia> buscarLicencias(Date fechaInicio, Date fechaFin, String nombre){
         return this.reporteDAO.buscarLicencias(fechaInicio, fechaFin, nombre);
     }
     
    @Override
     public List<Placa> buscarPlacas(Date fechaInicio, Date fechaFin, String nombre) {
         return this.reporteDAO.buscarPlacas(fechaInicio, fechaFin, nombre);
     }
}
