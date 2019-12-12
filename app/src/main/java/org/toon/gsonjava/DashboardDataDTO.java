package org.toon.gsonjava;

import java.util.List;

public class DashboardDataDTO {
    private List<DashboardCountDTO> section1;
    private List<DashboardCountDTO> section2;
    private List<DashboardCountDTO> section3;
    private List<DashboardCountDTO> section4;

    public List<DashboardCountDTO> getSection1() {
        return section1;
    }

    public void setSection1(List<DashboardCountDTO> section1) {
        this.section1 = section1;
    }

    public List<DashboardCountDTO> getSection2() {
        return section2;
    }

    public void setSection2(List<DashboardCountDTO> section2) {
        this.section2 = section2;
    }

    public List<DashboardCountDTO> getSection3() {
        return section3;
    }

    public void setSection3(List<DashboardCountDTO> section3) {
        this.section3 = section3;
    }

    public List<DashboardCountDTO> getSection4() {
        return section4;
    }

    public void setSection4(List<DashboardCountDTO> section4) {
        this.section4 = section4;
    }

    @Override
    public String toString() {
        return "DashboardDataDTO{" +
                "section1=" + section1 +
                ", section2=" + section2 +
                ", section3=" + section3 +
                ", section4=" + section4 +
                '}';
    }

    public DashboardDataDTO(List<DashboardCountDTO> section1, List<DashboardCountDTO> section2, List<DashboardCountDTO> section3, List<DashboardCountDTO> section4) {
        this.section1 = section1;
        this.section2 = section2;
        this.section3 = section3;
        this.section4 = section4;
    }
}