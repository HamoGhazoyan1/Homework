public class Person {
    String name;
    double balance;
    Company company = new Company();
    void sendMoney (Person otherPerson, double sum){
        balance -= sum;
        otherPerson.balance += sum;
    }
    Person findMaxBalancePerson (Person[] companyA, Person[] companyB){
        Person maxBalancePerson = new Person();
        maxBalancePerson.balance = 0;
        for (int i = 0; i < companyA.length; i++) {
            if(companyA[i].balance > maxBalancePerson.balance){
                maxBalancePerson = companyA[i];
            }
            if(companyB[i].balance > maxBalancePerson.balance){
                maxBalancePerson = companyB[i];
            }
        }

        return maxBalancePerson;
    }

}
