package com.elevate.lms;

public class Books {

    private int id;
    private String name;
    private boolean isIssued;
    private User issuedBy;

    public Books(int id, String name) {
        this.id = id;
        this.name = name;
        this.isIssued = false;
        this.issuedBy = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean isIssued) {
         this.isIssued = isIssued;
    }

    public User getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(User issuedBy) {
        this.issuedBy = issuedBy;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isIssued=" + isIssued +
                ", issuedBy='" + issuedBy + '\'' +
                '}';
    }
}
