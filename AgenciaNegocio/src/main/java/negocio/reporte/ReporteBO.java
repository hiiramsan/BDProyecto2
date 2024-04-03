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
import dtos.LicenciaDTO;
import dtos.PlacaDTO;
import dtos.TramiteDTO;
import entidadesJPA.Licencia;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    public void generarReportePlacas(List<PlacaDTO> placas) {
        Document doc = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("ReportePlacas.pdf"));
            writer.setPageEvent(new PageNumberEvent());

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Placas", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell(createCell("Fecha", true));
            tabla.addCell(createCell("Costo", true));
            tabla.addCell(createCell("Trámite", true));
            tabla.addCell(createCell("Persona", true));

            for (PlacaDTO placa : placas) {

                String fechaExpedicionFormateada = (placa.getFechaExpedicion() != null) ? formatoFecha.format(placa.getFechaExpedicion().getTime()) : "NoDate";
                tabla.addCell(createCell(fechaExpedicionFormateada, false));

                tabla.addCell(createCell(String.valueOf(placa.getCosto()), false));
                tabla.addCell(createCell("Expedición de Placas", false));
                tabla.addCell(createCell(placa.getNombrePersona(), false));
            }

            doc.open();
            doc.add(titulo);
            doc.add(Chunk.NEWLINE);
            doc.add(fecha);
            doc.add(Chunk.NEWLINE);
            doc.add(Chunk.NEWLINE);
            doc.add(tabla);
            doc.close();

            JOptionPane.showMessageDialog(null, "PDF exportado! Ruta: ReportePlacas.pdf", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al generar el reporte de placas.");
        }
    }

    @Override
    public void generarReporteLicencias(List<LicenciaDTO> licencias) {
        Document doc = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("ReporteLicencias.pdf"));
            writer.setPageEvent(new PageNumberEvent());

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Licencias", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell(createCell("Fecha", true));
            tabla.addCell(createCell("Costo", true));
            tabla.addCell(createCell("Trámite", true));
            tabla.addCell(createCell("Persona", true));

            for (LicenciaDTO licencia : licencias) {

                String fechaExpedicionFormateada = (licencia.getFechaExpedicion() != null) ? formatoFecha.format(licencia.getFechaExpedicion().getTime()) : "NoDate";
                tabla.addCell(createCell(fechaExpedicionFormateada, false));

                tabla.addCell(createCell(String.valueOf(licencia.getCosto()), false));
                tabla.addCell(createCell("Expedición de Licencias", false));

      

                tabla.addCell(createCell(licencia.getNombrePersona(), false));
            }

            doc.open();
            doc.add(titulo);
            doc.add(Chunk.NEWLINE);
            doc.add(fecha);
            doc.add(Chunk.NEWLINE);
            doc.add(Chunk.NEWLINE);
            doc.add(tabla);
            doc.close();

            JOptionPane.showMessageDialog(null, "PDF exportado! Ruta: ReporteLicencias.pdf", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al generar el reporte de licencias.");
        }
    }

    @Override
    public void generarReporteTramites(List<TramiteDTO> tramites) {
        Document doc = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("ReporteTramites.pdf"));
            writer.setPageEvent(new PageNumberEvent());

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Trámites", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell(createCell("Fecha", true));
            tabla.addCell(createCell("Costo", true));
            tabla.addCell(createCell("Persona", true));
            tabla.addCell(createCell("Trámite", true));

            for (TramiteDTO tramite : tramites) {
                String fechaExpedicionFormateada = (tramite.getFechaExpedicion() != null) ? formatoFecha.format(tramite.getFechaExpedicion().getTime()) : "NoDate";
                tabla.addCell(createCell(fechaExpedicionFormateada, false));
                tabla.addCell(createCell(Double.toString(tramite.getCosto()), false));
                tabla.addCell(createCell(tramite.getNombrePersona(), false));
                tabla.addCell(createCell(tramite.getTipoTramite(), false));
            }

            doc.open();
            doc.add(titulo);
            doc.add(Chunk.NEWLINE);
            doc.add(fecha);
            doc.add(Chunk.NEWLINE);
            doc.add(Chunk.NEWLINE);
            doc.add(tabla);
            doc.close();

            JOptionPane.showMessageDialog(null, "PDF exportado! Ruta: ReporteTramites.pdf", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al generar el reporte de trámites.");
        }
    }

    @Override
    public List<TramiteDTO> buscarTramites(Date fechaInicio, Date fechaFin, String nombre) {
        List<Tramite> tramites = this.reporteDAO.buscarTramites(fechaInicio, fechaFin, nombre);
        List<TramiteDTO> tramitesDTO = new ArrayList<>();

        for (Tramite tramite : tramites) {
            TramiteDTO dto = new TramiteDTO();
            Date fechaExp = tramite.getFechaExpedicion().getTime();
            dto.setFechaExpedicion(fechaExp);
            dto.setCosto(tramite.getCosto());
            dto.setEstado(tramite.getEstado());
            String nombreCompleto = tramite.getPersona().getNombre()+ " " + tramite.getPersona().getApellidoPaterno();
            dto.setNombrePersona(nombreCompleto);
            dto.setTipoTramite(tramite.getDecriminatorValue());
            tramitesDTO.add(dto);
        }

        return tramitesDTO;
    }

    @Override
    public List<LicenciaDTO> buscarLicencias(Date fechaInicio, Date fechaFin, String nombre) {
        List<Licencia> licencias = this.reporteDAO.buscarLicencias(fechaInicio, fechaFin, nombre);
        List<LicenciaDTO> licenciasDTO = new ArrayList<>();

        for (Licencia licencia : licencias) {
            LicenciaDTO dto = new LicenciaDTO();
            dto.setFechaExpedicion(licencia.getFechaExpedicion());
            dto.setCosto(licencia.getCosto());
            dto.setFechaVigencia(licencia.getVigencia());
            String nombreCompleto = licencia.getPersona().getNombre() + " "+ licencia.getPersona().getApellidoPaterno();
            dto.setNombrePersona(nombreCompleto);

            licenciasDTO.add(dto);
        }

        return licenciasDTO;
    }

    @Override
    public List<PlacaDTO> buscarPlacas(Date fechaInicio, Date fechaFin, String nombre) {
        List<Placa> placas = this.reporteDAO.buscarPlacas(fechaInicio, fechaFin, nombre);
        List<PlacaDTO> placasDTO = new ArrayList<>();

        for (Placa placa : placas) {
            PlacaDTO dto = new PlacaDTO();
            dto.setFechaExpedicion(placa.getFechaExpedicion());
            dto.setCosto(placa.getCosto());
            String nombreCompleto = placa.getPersona().getNombre()+ " " + placa.getPersona().getApellidoPaterno();
            dto.setNombrePersona(nombreCompleto);
            dto.setClaveNumerica(placa.getNumeroAlfanumerico());

            placasDTO.add(dto);
        }

        return placasDTO;
    }

    private PdfPCell createCell(String content, boolean header) {
        PdfPCell cell = new PdfPCell(new Phrase(content));
        if (header) {
            cell.setBackgroundColor(new BaseColor(122, 194, 225));
        } else {
            cell.setBackgroundColor(new BaseColor(205, 232, 244));
        }

        return cell;
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
}
