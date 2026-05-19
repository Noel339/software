
public class Human {
    private String name;
    private double height;
    private double weight;

    // コンストラクタ
    public Human(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // ゲッターとセッター
    public String getName() {
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

    // 表示
    public void info() {
        System.out.println("名前: " + name + ", 身長: " + height + "cm, 体重: " + weight + "kg");
    }

}