// Клас Population, що реалізує Reportable для звітів про населення
class Population extends DataInput implements Reportable {
    private int totalPopulation; // Загальна кількість населення
    private int urbanPopulation; // Кількість міського населення
    private double area;         // Площа країни

    @Override
    public void input() {
        System.out.print("Введіть загальну кількість населення: ");
        this.totalPopulation = scanner.nextInt();
        System.out.print("Введіть кількість міського населення: ");
        this.urbanPopulation = scanner.nextInt();
        System.out.print("Введіть площу країни (кв. км): ");
        this.area = scanner.nextDouble();
    }

    public double calculateDensity() {
        return totalPopulation / area;
    }

    public void updatePopulation() {
        System.out.print("Введіть кількість народжених: ");
        int born = scanner.nextInt();
        System.out.print("Введіть кількість померлих: ");
        int died = scanner.nextInt();

        totalPopulation += born - died;
        System.out.println("Оновлена кількість населення: " + totalPopulation);
    }

    @Override
    public void displayReport() {
        System.out.println("Загальна кількість населення: " + totalPopulation);
        System.out.println("Кількість міського населення: " + urbanPopulation);
        System.out.println("Густота населення: " + calculateDensity() + " осіб/кв. км");
    }
}