/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.reporte;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
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
    public void generarReportePlacas(List<Placa> placas) {
        Document doc = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("ReporteTramites.pdf"));
            writer.setPageEvent(new PageNumberEvent());

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Trámites", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell(createCell("Fecha", true));
            tabla.addCell(createCell("Costo", true));
            tabla.addCell(createCell("Tramite", true));
            tabla.addCell(createCell("Persona", true));

            for (Placa placa : placas) {
                Calendar fechaExpedicionCalendar = placa.getFechaExpedicion();
                Date fechaExpedicion = (fechaExpedicionCalendar != null) ? fechaExpedicionCalendar.getTime() : null;
                String fechaExpedicionString = (fechaExpedicion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaExpedicion) : "NoDate";

                tabla.addCell(createCell(fechaExpedicionString, false));
                tabla.addCell(createCell(String.valueOf(placa.getCosto()), false));
                tabla.addCell(createCell("Expedición de Placas", false));
                String nombreCompleto = placa.getPersona().getNombre() + " " + placa.getPersona().getApellidoPaterno();
                tabla.addCell(createCell(nombreCompleto, false));
            }

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

    private PdfPCell createCell(String content, boolean header) {
        PdfPCell cell = new PdfPCell(new Phrase(content));
        if (header) {
            cell.setBackgroundColor(new BaseColor(122, 194,225));
        } else {
            cell.setBackgroundColor(new BaseColor(205, 232, 244));
        }

        return cell;
    }

    @Override
    public void generarReporteLicencias(List<Licencia> licencias) {
        Document doc = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("ReporteTramites.pdf"));
            writer.setPageEvent(new PageNumberEvent());

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Trámites", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell(createCell("Fecha", true));
            tabla.addCell(createCell("Costo", true));
            tabla.addCell(createCell("Trámite", true));
            tabla.addCell(createCell("Vigencia", true));
            tabla.addCell(createCell("Persona", true));

            for (Licencia licencia : licencias) {
                Calendar fechaExpedicionCalendar = licencia.getFechaExpedicion();
                Date fechaExpedicion = (fechaExpedicionCalendar != null) ? fechaExpedicionCalendar.getTime() : null;
                String fechaExpedicionString = (fechaExpedicion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaExpedicion) : "NoDate";
                Calendar fechaVigenciaCalendar = licencia.getVigencia();
                Date fechaVigencia = (fechaVigenciaCalendar != null) ? fechaVigenciaCalendar.getTime() : null;
                String fechaVigenciaString = (fechaVigencia != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaVigencia) : "NoDate";

                tabla.addCell(createCell(fechaExpedicionString, false));
                tabla.addCell(createCell(String.valueOf(licencia.getCosto()), false));
                tabla.addCell(createCell("Expedición de Licencias", false));
                tabla.addCell(createCell(fechaVigenciaString, false));
                String nombreCompleto = licencia.getPersona().getNombre() + " " + licencia.getPersona().getApellidoPaterno();
                tabla.addCell(createCell(nombreCompleto, false));
            }

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
        }
    }

    private static class PageNumberEvent extends PdfPageEventHelper {

        @Override
        public void onEndPage(PdfWriter writer, Document document) {
            PdfContentByte cb = writer.getDirectContent();
            Phrase footer = new Phrase("Página " + writer.getPageNumber(), new Font(Font.FontFamily.HELVETICA, 12));
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    footer,
                    document.right() - 50,
                    document.bottom() - 10, 0);
        }
    }

    @Override
    public void generarReporteTramites(List<Tramite> tramites) {
        Document doc = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("ReporteTramites.pdf"));
            writer.setPageEvent(new PageNumberEvent());

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Trámites", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell(createCell("Fecha", true));
            tabla.addCell(createCell("Costo", true));
            tabla.addCell(createCell("Estado", true));
            tabla.addCell(createCell("Persona", true));
            tabla.addCell(createCell("Tramite", true));

            for (Tramite tramite : tramites) {
                Calendar fechaExpedicionCalendar = tramite.getFechaExpedicion();
                Date fechaExpedicion = (fechaExpedicionCalendar != null) ? fechaExpedicionCalendar.getTime() : null;
                String fechaExpedicionString = (fechaExpedicion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaExpedicion) : "NoDate";

                tabla.addCell(createCell(fechaExpedicionString, false));
                tabla.addCell(createCell(String.valueOf(tramite.getCosto()), false));
                tabla.addCell(createCell(String.valueOf(tramite.getEstado()), false));
                String nombreCompleto = tramite.getPersona().getNombre() + " " + tramite.getPersona().getApellidoPaterno();
                tabla.addCell(createCell(nombreCompleto, false));
                tabla.addCell(createCell(tramite.getDecriminatorValue(), false));
            }

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
    public List<Licencia> buscarLicencias(Date fechaInicio, Date fechaFin, String nombre) {
        return this.reporteDAO.buscarLicencias(fechaInicio, fechaFin, nombre);
    }

    @Override
    public List<Placa> buscarPlacas(Date fechaInicio, Date fechaFin, String nombre) {
        return this.reporteDAO.buscarPlacas(fechaInicio, fechaFin, nombre);
    }
}
