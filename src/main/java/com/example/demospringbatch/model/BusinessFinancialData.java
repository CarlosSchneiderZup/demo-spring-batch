package com.example.demospringbatch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusinessFinancialData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String seriesReference;
    private String period;
    private String dataValue;
    private String suppressed;
    private String status;
    private String units;
    private String magnitude;
    private String subject;
    private String groups;
    private String seriesTitle1;
    private String seriesTitle2;
    private String seriesTitle3;
    private String seriesTitle4;
    private String seriesTitle5;


    @Deprecated
    public BusinessFinancialData() {

    }

    public BusinessFinancialData(String seriesReference, String period, String dataValue, String suppressed, String status, String units, String magnitude, String subject, String groups, String seriesTitle1, String seriesTitle2, String seriesTitle3, String seriesTitle4, String seriesTitle5) {
        this.seriesReference = seriesReference;
        this.period = period;
        this.dataValue = dataValue;
        this.suppressed = suppressed;
        this.status = status;
        this.units = units;
        this.magnitude = magnitude;
        this.subject = subject;
        this.groups = groups;
        this.seriesTitle1 = seriesTitle1;
        this.seriesTitle2 = seriesTitle2;
        this.seriesTitle3 = seriesTitle3;
        this.seriesTitle4 = seriesTitle4;
        this.seriesTitle5 = seriesTitle5;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeriesReference() {
        return seriesReference;
    }

    public void setSeriesReference(String seriesReference) {
        this.seriesReference = seriesReference;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getSuppressed() {
        return suppressed;
    }

    public void setSuppressed(String suppressed) {
        this.suppressed = suppressed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getSeriesTitle1() {
        return seriesTitle1;
    }

    public void setSeriesTitle1(String seriesTitle1) {
        this.seriesTitle1 = seriesTitle1;
    }

    public String getSeriesTitle2() {
        return seriesTitle2;
    }

    public void setSeriesTitle2(String seriesTitle2) {
        this.seriesTitle2 = seriesTitle2;
    }

    public String getSeriesTitle3() {
        return seriesTitle3;
    }

    public void setSeriesTitle3(String seriesTitle3) {
        this.seriesTitle3 = seriesTitle3;
    }

    public String getSeriesTitle4() {
        return seriesTitle4;
    }

    public void setSeriesTitle4(String seriesTitle4) {
        this.seriesTitle4 = seriesTitle4;
    }

    public String getSeriesTitle5() {
        return seriesTitle5;
    }

    public void setSeriesTitle5(String seriesTitle5) {
        this.seriesTitle5 = seriesTitle5;
    }
}