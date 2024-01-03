package org.example.file_handling.file_handling.util;
import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.opencsv.CSVReader;
import java.io.FileOutputStream;
import java.io.FileReader;
public class PdfConverter {
    public static void main(String[] args) {
        try {
            String inputCSVFile = "src/main/resources/car_file/car.csv";
            CSVReader reader = new CSVReader(new FileReader(inputCSVFile));
            String[] nextLine;
            int lnNum = 0;
            Document pdf = new Document();
            PdfWriter.getInstance(pdf, new FileOutputStream("src/main/resources/car.pdf"));
            pdf.open();
            PdfPTable table = new PdfPTable(6);
            PdfPCell tableCell;
            while ((nextLine = reader.readNext()) != null) {
                lnNum++;
                tableCell = new PdfPCell(new Phrase(nextLine[0]));
                table.addCell(tableCell);
                tableCell = new PdfPCell(new Phrase(nextLine[1]));
                table.addCell(tableCell);
                tableCell = new PdfPCell(new Phrase(nextLine[2]));
                table.addCell(tableCell);
                tableCell = new PdfPCell(new Phrase(nextLine[3]));
                table.addCell(tableCell);
                tableCell = new PdfPCell(new Phrase(nextLine[4]));
                table.addCell(tableCell);
                tableCell = new PdfPCell(new Phrase(nextLine[5]));
                table.addCell(tableCell);
            }
            pdf.add(table);
            pdf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



