package org.toon.gsonjava;

public class DashboardCountDTO {
    private String entityName;
    private String entityValue;

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityValue() {
        return entityValue;
    }

    public void setEntityValue(String entityValue) {
        this.entityValue = entityValue;
    }

    @Override
    public String toString() {
        return "DashboardCountDTO{" +
                "entityName='" + entityName + '\'' +
                ", entityValue='" + entityValue + '\'' +
                '}';
    }

    public DashboardCountDTO(String entityName, String entityValue) {
        this.entityName = entityName;
        this.entityValue = entityValue;
    }
}