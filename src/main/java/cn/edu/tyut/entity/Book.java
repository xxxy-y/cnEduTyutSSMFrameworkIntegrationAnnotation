package cn.edu.tyut.entity;

/**
 * @Author 羊羊
 * @ClassName Book
 * @SubmitTime 周三
 * @DATE 2023/12/13
 * @Time 20:49
 * @Package_Name cn.edu.tyut.entity
 */
public class Book {
    private String name;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
