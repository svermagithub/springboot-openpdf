package com.pdf.example;


import com.pdf.example.response.IncomeAndEmploymentResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.http.ResponseEntity.status;



@RestController
public class Controller {

   @GetMapping("/incomeEmployment")
    public ResponseEntity<IncomeAndEmploymentResponse> returnObjectInBrowser(HttpServletResponse response) throws IOException, ParseException {
       IncomeAndEmploymentResponse incomeAndEmploymentRequest =null ;/* TestData.getIncomeAndEmploymentRequest();*/
        return  status(HttpStatus.FOUND).body(incomeAndEmploymentRequest);
    }

    private void addBytesToIncomeEmploymentResponse(IncomeAndEmploymentResponse incomeAndEmploymentResponse) throws Exception {

        // This section is to create pdf using ITEXT Library .

        ByteArrayOutputStream out = new ByteArrayOutputStream();

       /* Rectangle pageSize = new Rectangle(PageSize.LETTER);
        Document document = new Document(pageSize);

        document.setMargins(70, 50, 72, 20);
        PdfWriter writer = PdfWriter.getInstance(document, out);
        document.open();
        PdfContentByte cb = writer.getDirectContent();
        ItextPdfCreator pdfCreator = new ItextPdfCreator();
        pdfCreator.writePDF(incomeAndEmploymentResponse,document,cb);
        document.close();
        out.close();
        incomeAndEmploymentResponse.setPdfBytes(out.toByteArray());
*/
    }
}