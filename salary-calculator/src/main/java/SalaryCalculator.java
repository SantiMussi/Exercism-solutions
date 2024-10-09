public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean moreThanFive = daysSkipped >= 5;
        return moreThanFive ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        boolean moreThanTwenty = productsSold >= 20;
        return moreThanTwenty ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double result = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        boolean moreThan2000 = result > 2000;
        return moreThan2000 ? 2000 : result;
    } 
}
