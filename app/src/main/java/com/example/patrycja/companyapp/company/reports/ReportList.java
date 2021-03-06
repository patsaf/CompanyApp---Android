package com.example.patrycja.companyapp.company.reports;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReportList {

    private final List<Report> listOfReports;

    public ReportList() {
        listOfReports = new ArrayList<>();
    }

    public void add(Report report) {
        listOfReports.add(report);
        Collections.sort(listOfReports);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Report r : listOfReports) {
            output.append(new StringBuilder().append(r).append("\n").toString());
        }
        return output.toString();
    }
}
