package com.app.sending_reports.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ScheduleReportService {
    @Autowired
    private FileOSService fileOSService;

    @Autowired
    private EmailService emailService;

    private final List<String> emailList = List.of("name@example.com");

    @Scheduled(fixedRate = 30000)
    public void sendReport() {

        try {
            String report = fileOSService.getReportFileContent("sending-reports.html");

            for (String email: emailList) {
                emailService.sendReport(report, email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
