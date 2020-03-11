public class Main {
    public static void main(String[] args) {
        Company company1 = new Company();
        company1.name = "A";
        Company company2 = new Company();
        company2.name = "B";
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        Person p6 = new Person();
        p1.name = "person1";
        p1.balance = 100;
        p1.company = company1;
        p2.name = "person2";
        p2.balance = 600;
        p2.company = company1;
        p3.name = "person3";
        p3.balance = 300;
        p3.company = company1;
        p4.name = "person4";
        p4.balance = 400;
        p4.company = company2;
        p5.name = "person5";
        p5.balance = 500;
        p5.company = company2;
        p6.name = "person6";
        p6.balance = 200;
        p6.company = company2;
        p1.sendMoney(p2, 50);
        p2.sendMoney(p3, 60);
        p3.sendMoney(p4, 30);
        p4.sendMoney(p5, 20);
        p5.sendMoney(p6, 70);
        p6.sendMoney(p1, 10);
        Person[] companyA = new Person[]{p1, p2, p3};
        Person[] companyB = new Person[]{p4, p5, p6};
        Company[] companies = new Company[]{company1, company2};
        Person maxBalancePerson = new Person();
        maxBalancePerson = maxBalancePerson.findMaxBalancePerson(companyA, companyB);
        Company maxBalanceCompany = new Company();
        maxBalanceCompany = maxBalanceCompany.findMaxBalanceCompany(companyA, companyB);
        System.out.println("A person with most balance is: "+maxBalancePerson.name);
        System.out.println("A company with most balance is: "+maxBalanceCompany.name);
    }
}
