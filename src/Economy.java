// Клас Economy, що реалізує Reportable для звітів про економіку
class Economy extends DataInput implements Reportable {
    private double taxRate;  // Ставка податку
    private double annualIncome;

    @Override
    public void input() {
        System.out.print("Введіть % податку (наприклад, 0.17 для 17%): ");
        this.taxRate = scanner.nextDouble();
        System.out.print("Введіть загальний дохід населення: ");
        this.annualIncome = scanner.nextDouble();
    }

    public double calculateTax() {
        return annualIncome * taxRate;
    }

    public void distributeTax(double taxRevenue) {
        System.out.println("Податкові надходження: " + taxRevenue);
        System.out.println("Армія: " + (taxRevenue * 0.4));         // 40% на армію
        System.out.println("Пенсії: " + (taxRevenue * 0.3));        // 30% на пенсії
        System.out.println("Розвиток: " + (taxRevenue * 0.3));      // 30% на розвиток
    }

    @Override
    public void displayReport() {
        double taxRevenue = calculateTax();
        distributeTax(taxRevenue);
    }
}
