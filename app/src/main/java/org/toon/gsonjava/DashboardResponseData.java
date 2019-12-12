package org.toon.gsonjava;

public class DashboardResponseData {
    private DashboardDataDTO dashboardDataCount;

    @Override
    public String toString() {
        return "DashboardResponseData{" +
                "dashboardDataCount=" + dashboardDataCount +
                '}';
    }

    public DashboardDataDTO getDashboardDataCount() {
        return dashboardDataCount;
    }

    public void setDashboardDataCount(DashboardDataDTO dashboardDataCount) {
        this.dashboardDataCount = dashboardDataCount;
    }

    public DashboardResponseData(DashboardDataDTO dashboardDataCount) {
        this.dashboardDataCount = dashboardDataCount;
    }
}