public class Company {
    String name;
    double balance;
    Company findMaxBalanceCompany (Person[] companyA, Person[] companyB){
        Company company1 = companyA[0].company;
        company1.balance = 0;
        Company company2 = companyB[0].company;
        company2.balance = 0;
        for (int i = 0; i < companyA.length; i++) {
            company1.balance += companyA[i].balance;
            company2.balance += companyB[i].balance;
        }
        if (company1.balance > company2.balance){
            return company1;
        }else {
            return company2;
        }
    }
}
