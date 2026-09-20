package com.irctc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PNRController {

    @GetMapping("pnrCheck")
    public String checkPNRStatus(
            @RequestParam("pnrNumber") String pnrNo,
            Model model) {

        System.out.println(
            "PNRController.checkPNRStatus()....received PNR from user is "
            + pnrNo
        );

        // Send PNR number to JSP
        model.addAttribute("pnrNumber", pnrNo);

        // Sample data
        model.addAttribute("trainNumber", "12345");
        model.addAttribute("trainName", "Rajdhani Express");
        model.addAttribute("journeyDate", "25 Aug 2026");

        model.addAttribute("fromStation", "NDLS");
        model.addAttribute("fromStationName", "New Delhi");

        model.addAttribute("toStation", "HWH");
        model.addAttribute("toStationName", "Howrah");

        model.addAttribute("passengerName", "Rahul Kumar");

        model.addAttribute("bookingStatus", "WL-52");
        model.addAttribute("currentStatus", "WL-49");

        return "pnr-status";
    }
}