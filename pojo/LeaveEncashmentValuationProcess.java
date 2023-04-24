public class LeaveEncashmentValuationProcess {
    private int numberOfLives;
    private int retirementAge;
    private double valuationInterestRate;
    private int maximumPLCreditedEachYear;
    private int maximumEncashablePL;
    private double salaryEscalation;
    private double targetValuation;

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public int getRetirementAge() {
        return retirementAge;
    }

    public void setRetirementAge(int retirementAge) {
        this.retirementAge = retirementAge;
    }

    public double getValuationInterestRate() {
        return valuationInterestRate;
    }

    public void setValuationInterestRate(double valuationInterestRate) {
        this.valuationInterestRate = valuationInterestRate;
    }

    public int getMaximumPLCreditedEachYear() {
        return maximumPLCreditedEachYear;
    }

    public void setMaximumPLCreditedEachYear(int maximumPLCreditedEachYear) {
        this.maximumPLCreditedEachYear = maximumPLCreditedEachYear;
    }

    public int getMaximumEncashablePL() {
        return maximumEncashablePL;
    }

    public void setMaximumEncashablePL(int maximumEncashablePL) {
        this.maximumEncashablePL = maximumEncashablePL;
    }

    public double getSalaryEscalation() {
        return salaryEscalation;
    }

    public void setSalaryEscalation(double salaryEscalation) {
        this.salaryEscalation = salaryEscalation;
    }

    public double getTargetValuation() {
        return targetValuation;
    }

    public void setTargetValuation(double targetValuation) {
        this.targetValuation = targetValuation;
    }

    // Method to calculate valuation for both Past Service Benefits and Current Service Benefits
    public void calculateValuation(){
        // logic to calculate based on variables
    }

    // Method to allow user to change values of variables
    public void changeVariables(){
        // logic to allow user to change variables
    }

    // Method to perform valuation exercise once a year
    public void performValuation(){
        // logic to perform once a year
    }

    // Method to perform valuation exercise once in a quarter
    public void performValuationQuarterly(){
        // logic to perform once in a quarter
    }

    // Method to generate reports
    public void generateReports(){
        // logic to generate reports
    }

}