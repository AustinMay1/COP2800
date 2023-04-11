package org.example;

public class HealthInsurancePolicy {
    private int policyNumber;
    private String policyProvider;
    private String memberName;
    private int age;
    private char sex;
    private String dependents;
    private String memberState;

    public HealthInsurancePolicy(int policyNumber, String policyProvider, String memberName, int age, char sex, String dependents, String memberState) {
        setPolicyNumber(policyNumber);
        setPolicyProvider(policyProvider);
        setMemberName(memberName);
        setAge(age);
        setSex(sex);
        setDependents(dependents);
        setMemberState(memberState);
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyProvider() {
        return policyProvider;
    }

    public void setPolicyProvider(String policyProvider) {
        this.policyProvider = policyProvider;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        switch(sex) {
            case 'M':
                this.sex = 'M';
                break;
            case 'F':
                this.sex = 'F';
                break;
            default:
                System.out.println("Please provide a valid sex (M/F)");
                break;
        }
    }

    public String getDependents() {
        return dependents;
    }

    public void setDependents(String dependents) {
        this.dependents = dependents;
    }

    public String getMemberState() {
        return memberState;
    }

    public void setMemberState(String memberState) {
        this.memberState = memberState;
    }

    public boolean MandatoryInsuranceState() {
        boolean mandatoryState;

        switch (getMemberState()) {
            case "CA": case "MA": case "RI": case "NJ": case "VT":
                mandatoryState = true;
                break;
            default:
                mandatoryState = false;
                break;
        }
        return mandatoryState;
    }
}
