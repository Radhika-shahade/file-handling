package org.example.file_handling.file_handling.util;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.opencsv.CSVReader;
import java.io.FileOutputStream;
import java.io.FileReader;
public class PdfConverter {

    public static void convertCSVToPDF(String inputCSVFilePath, String outputPDFFilePath) {
        try {
            CSVReader reader = new CSVReader(new FileReader(inputCSVFilePath));
            String[] nextLine;
            Document pdf = new Document();
            PdfWriter.getInstance(pdf, new FileOutputStream(outputPDFFilePath));
            pdf.open();
            PdfPTable table = new PdfPTable(6);
            PdfPCell tableCell;

            while ((nextLine = reader.readNext()) != null) {
                for (String value : nextLine) {
                    tableCell = new PdfPCell(new Paragraph(value));
                    table.addCell(tableCell);
                }
            }
            pdf.add(table);
            pdf.close();
            System.out.println("Conversion completed successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





