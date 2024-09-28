package com.eand.edms;

import com.eand.edms.client.CDMSWS;
import com.eand.edms.client.CDMSWSService;
import com.eand.edms.client.StreamDownloadRequest;
import com.eand.edms.client.StreamDownloadResponse;

public class EDMSClientMain {
    public static void main(String[] args) {
        // Initialize the service
        CDMSWSService service = new CDMSWSService();
        CDMSWS port = service.getCDMSPort();

        // Create the request object
        StreamDownloadRequest request = new StreamDownloadRequest();
        request.setDlKey("edms");
        request.setDocNumber("623667600"); // Replace with the actual SR Number
        request.setRemarks("EID"); // Constant remark
        request.setDownload(true);
        request.setPassword("ws2012ebill"); // Password
        request.setUsername("ebilluser"); // Username

        // Call the service
        StreamDownloadResponse response = port.downloadEDMSDocument(request);

        // Process the response
        if (response != null) {
            System.out.println("Account No: " + response.getAccountNo());
            System.out.println("Document Stream: " + response.getDocStream());
            // Handle other fields as necessary
        } else {
            System.out.println("No response received.");
        }
    }
}

