package org.example;

public class HealthInsurancePolicyTest {
    public static void main(String[] args) {
        HealthInsurancePolicy policy_1 = new HealthInsurancePolicy(123456, "Health United", "Johnny Rocket", 33, 'M', "Jane Rocket, Joey Rocket", "FL");
        policyInMandatoryInsuranceState(policy_1);

        System.out.println("\n------------");

        HealthInsurancePolicy policy_2 = new HealthInsurancePolicy(654321, "Unltd Health", "Mary Joseph", 28, 'F', "Jacob Joseph", "VT");
        policyInMandatoryInsuranceState(policy_2);

        System.out.println("\n------------");

        HealthInsurancePolicy policy_3 = new HealthInsurancePolicy(456123, "Health Ltd", "Peter Parker", 19, 'M', "None", "NY");
        policyInMandatoryInsuranceState(policy_3);
    }

    public static void policyInMandatoryInsuranceState(HealthInsurancePolicy policy) {
        System.out.println("The health insurance policy: ");
        System.out.printf("Policy #: %d\nPolicy Provider: %s\nPolicy Member: %s\nMember Age: %d\nMember Sex: %c\nMember Dependants: %s\nMember State: %s\n",
                policy.getPolicyNumber(), policy.getPolicyProvider(), policy.getMemberName(), policy.getAge(), policy.getSex(), policy.getDependents(),
                policy.getMemberState());
        System.out.printf("%s is %s mandatory insurance policy state.", policy.getMemberState(), policy.MandatoryInsuranceState() ? "a" : "not a");
    }
}