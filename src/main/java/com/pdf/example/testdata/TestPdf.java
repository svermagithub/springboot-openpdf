package com.pdf.example.testdata;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.pdf.example.ItextPdfCreator;
import com.pdf.example.response.IncomeAndEmploymentResponse;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestPdf {

    public static void main(String[] args) {
        Document document = new Document();
        String FILE = "F:/Test/PdfReport.pdf";
        PdfContentByte cb = null;
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            cb = writer.getDirectContent();
            IncomeAndEmploymentResponse data = TestData.getIncomeAndEmploymentResponse();

            new ItextPdfCreator().writePDF(data, document, cb);

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
