
public class Human {
    private String name;
    private double height;
    private double weight;

    //  コンストラクタ
    public Human(String name, double height, double weight)  {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    //  ゲッターとセッター
    public String getName()  {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // BMI
    public double calculateBMI() {
        double heightMeters = height / 100.0;
        return weight / (heightMeters * heightMeters);
    }

    // infoメソッドにBMIの表示を追加
    public void info() {
        System.out.println("名前: " + name + ", 身長: " + height + "cm, 体重: " + weight + "kg, BMI: "
                + String.format("%.1f", calculateBMI()));
    }

}