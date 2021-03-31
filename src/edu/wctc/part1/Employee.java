package edu.wctc.part1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document Encapsulation Checklist if
 * needed.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    public boolean metWithHr;
    public boolean metDeptStaff;
    public boolean reviewedDeptPolicies;
    public boolean movedIn;
    public String cubeId;
    public LocalDate orientationDate;

    public Employee(String firstName, String lastName, String ssn, boolean metWithHr, boolean metDeptStaff, boolean reviewedDeptPolicies, boolean movedIn, String cubeId, LocalDate orientationDate) {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.metWithHr = metWithHr;
        this.metDeptStaff = metDeptStaff;
        this.reviewedDeptPolicies = reviewedDeptPolicies;
        this.movedIn = movedIn;
        setCubeId(cubeId);
        setOrientationDate(orientationDate);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName != "" || firstName != null) {
            this.firstName = firstName;
        }
        else
            throw new IllegalArgumentException("Name is null");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName != "" || lastName != null) {
            this.lastName = lastName;
        }
        else
            throw new IllegalArgumentException("Name is null");

    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if(ssn != "" || ssn != null || ssn.length() < 9) {
            this.ssn = ssn;
        }
        else
            throw new IllegalArgumentException("ssn is null");
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        if(cubeId != "" || cubeId != null){
            this.cubeId = cubeId;
        }
        else
            throw new IllegalArgumentException("CubeID is null");
    }

    public LocalDate getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(LocalDate orientationDate) {
        if(orientationDate != null){
            this.orientationDate = orientationDate;
        }
        else
            throw new IllegalArgumentException("orientation date is null");
    }
}
