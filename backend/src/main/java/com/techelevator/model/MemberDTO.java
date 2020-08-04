package com.techelevator.model;

public class MemberDTO {

    private int memberId;
    private String memberName;
    private boolean isParent;
    private int timeReading;
    private int familyId;


    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public boolean isParent() {
        return isParent;
    }

    public void setParent(boolean parent) {
        isParent = parent;
    }

    public int getTimeReading() {
        return timeReading;
    }

    public void setTimeReading(int timeReading) {
        this.timeReading = timeReading;
    }

    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

}
