package com.suhrid;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by suhrid on 10/27/16.
 */
@Service
public class SimpleMailSenderTask {

    @Scheduled(initialDelay=5000, fixedRate=7000)
    public void sendMail() {
        System.out.println("Sending mail at: " + new Date());
    }
}
