package org.example.file_handling.file_handling.util;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class CsvToPdf {
    public static void main(String[] args) {
        generatePdf("src/main/resources/newPdf.pdf", "Hello, this is a simple PDF created using iText.");
    }
    private static void generatePdf(String filePath, String content) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Add content to PDF
            document.add(new Paragraph(content));

            System.out.println("PDF created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document != null && document.isOpen()) {
                document.close();
            }
        }
    }
//    public static void main(String[] args) throws FileNotFoundException {
//        String path = "src/main/resources/generated.pdf";
//        PdfWriter pdfWriter = new PdfWriter(path);
//        PdfDocu pdfDocument = new PdfDocument(pdfWriter);
//        pdfDocument.setDefaultPageSize(PageSize.A4);
//        Document document = new Document(pdfDocument);
//        document.add(new Paragraph("Hello I am radhika"));
//        document.close();
//    }
}
