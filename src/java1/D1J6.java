package java1;
public class D1J6 {
    private String name;
    private String headOfficeAdd;
    private String chairmanName;
    private int branchCount;
    private double fdIntRate;
    private double personalLoanIntRate;
    private double homeLoanIntRate;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getHeadOfficeAddress()
    {
        return headOfficeAdd;
    }

    public void setHeadOfficeAddress(String headOfficeAdd)
    {
        this.headOfficeAdd = headOfficeAdd;
    }

    public String getChairmanName()
    {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName)
    {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount()
    {
        return branchCount;
    }

    public void setBranchCount(int branchCount)
    {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate()
    {
        return fdIntRate;
    }

    public void setFdInterestRate(double fdIntRate)
    {
        this.fdIntRate = fdIntRate;
    }

    public double getPersonalLoanInterestRate()
    {
        return personalLoanIntRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanIntRate)
    {
        this.personalLoanIntRate = personalLoanIntRate;
    }

    public double getHomeLoanInterestRate()
    {
        return homeLoanIntRate;
    }

    public void setHomeLoanInterestRate(double homeLoanIntRate)
    {
        this.homeLoanIntRate = homeLoanIntRate;
    }

    // Override toString
    @Override
    public String toString() {
        return "\nBank Name: " + name +
                "\nHead Office Address: " + headOfficeAdd +
                "\nChairman Name: " + chairmanName +
                "\nBranch Count: " + branchCount +
                "\nFD Interest Rate: " + fdIntRate + "%" +
                "\nPersonal Loan Interest Rate: " + personalLoanIntRate + "%" +
                "\nHome Loan Interest Rate: " + homeLoanIntRate + "%";
    }

        public static void main(String[] args)
        {
            SBI sbi = new SBI();
            BOI boi = new BOI();
            ICICI icici = new ICICI();

            System.out.println(sbi);
            System.out.println(boi);
            System.out.println(icici);
        }

}


class BOI extends D1J6 {
    public BOI() {
        setName("BOI");
        setHeadOfficeAddress("Jammu, India");
        setChairmanName("Ayush Gupta");
        setBranchCount(5100);
        setFdInterestRate(6.25);
        setPersonalLoanInterestRate(11.5);
        setHomeLoanInterestRate(8.85);
    }
}

class SBI extends D1J6 {
    public SBI() {
        setName("SBI");
        setHeadOfficeAddress("Budaun, India");
        setChairmanName("Azzam khan");
        setBranchCount(1234);
        setFdInterestRate(10.5);
        setPersonalLoanInterestRate(6.98);
        setHomeLoanInterestRate(8.75);
    }
}

class ICICI extends D1J6 {
    public ICICI() {
        setName("ICICI");
        setHeadOfficeAddress("Jaipur, Rajasthan");
        setChairmanName("Satwik Sharma");
        setBranchCount(5339);
        setFdInterestRate(7.0);
        setPersonalLoanInterestRate(12.0);
        setHomeLoanInterestRate(9.0);
    }
}
