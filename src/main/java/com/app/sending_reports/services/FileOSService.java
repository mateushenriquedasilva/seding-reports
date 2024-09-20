package com.app.sending_reports.services;

import com.app.sending_reports.config.OSClientConfiguration;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Service
public class FileOSService {
    String bucketName = "YOUR-BUCKET-NAME";
    String namespace = "YOUR-NAME-SPACE";

    @Autowired
    private OSClientConfiguration osClientConfiguration;

    public String getReportFileContent(String filename) {
        // Design Patterns - Builder
        GetObjectRequest objectRequest = GetObjectRequest.builder()
                .namespaceName(namespace)
                .bucketName(bucketName)
                .objectName(filename)
                .build();

        try {
            //manipulating the file
            GetObjectResponse getObjectResponse = osClientConfiguration.getObjectStorage()
                    .getObject(objectRequest);
            InputStream inputStream = getObjectResponse.getInputStream();

            String constent = new BufferedReader(new InputStreamReader(inputStream))
                    .lines().collect(Collectors.joining());

            return constent;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}


