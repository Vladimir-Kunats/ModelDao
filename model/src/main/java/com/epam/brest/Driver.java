package com.epam.brest;

import java.time.Instant;
import java.util.Objects;

public class Driver {
    private Integer driverId;
    private String firstName;
    private String lastName;
    private String driverLicence;
    private Instant workDate;

    public Driver() {
    }

    public Driver(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    public Driver(String firstName, String lastName, String driverLicence, Instant workDate) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.driverLicence = driverLicence;
        this.workDate = workDate;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    public Instant getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Instant workDate) {
        this.workDate = workDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverId.equals(driver.driverId) && firstName.equals(driver.firstName) && lastName.equals(driver.lastName) && driverLicence.equals(driver.driverLicence) && workDate.equals(driver.workDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverId, firstName, lastName, driverLicence, workDate);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", driverLicence='" + driverLicence + '\'' +
                ", workDate=" + workDate +
                '}';
    }
}
