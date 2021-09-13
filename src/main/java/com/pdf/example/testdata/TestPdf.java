package com.pdf.example.testdata;

import com.google.gson.Gson;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.pdf.example.ItextPdfCreator;
import com.pdf.example.response.CommonUtils;
import com.pdf.example.response.IncomeAndEmploymentResponse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.URL;
import java.util.Date;

public class TestPdf {

    public static void main(String[] args) {


            testPDFWrite();
     // System.out.println("Sum "+ CommonUtils.formatTenure(CommonUtils.sumOfTenure("P11Y9M14D", "P11Y9M25D")));

    }

    public static IncomeAndEmploymentResponse createSampleTestData() throws FileNotFoundException {

        Gson gson = new Gson();

       URL fileUrl = Thread.currentThread().getContextClassLoader().getResource("testdata.json");

        BufferedReader br = new BufferedReader(
                new FileReader(fileUrl.getFile()));

        IncomeAndEmploymentResponse incomeAndEmploymentResponse = gson.fromJson(br,
                IncomeAndEmploymentResponse.class);

        return incomeAndEmploymentResponse;
    }

    public static void testPDFWrite(){

        Rectangle pageSize = new Rectangle(PageSize.LETTER);
        Document document = new Document(pageSize);
        String FILE = "F:/Test/PdfReport_" + new Date().getTime() + ".pdf";
        PdfContentByte cb = null;
        try {
            FileOutputStream fos = new FileOutputStream(FILE);
           // document.setMargins(70, 50, 72, 20);
            PdfWriter writer = PdfWriter.getInstance(document, fos);
            document.open();
            cb = writer.getDirectContent();
            //IncomeAndEmploymentResponse incomeAndEmploymentResponse = createSampleTestData(); //TestData.getIncomeAndEmploymentResponse();
            IncomeAndEmploymentResponse incomeAndEmploymentResponse = TestData3.getIncomeAndEmploymentResponse();

            new ItextPdfCreator().writePDF(incomeAndEmploymentResponse, document, cb);
            document.close();
            fos.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
