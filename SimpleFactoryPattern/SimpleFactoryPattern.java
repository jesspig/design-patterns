package SimpleFactoryPattern;

/*
 * 根据不同的参数创建不同的类
 * 被创建的类都属于同个父类的子类
 */
public class SimpleFactoryPattern {
  static Product createProduct(String key) {
    switch (key) {
      case "A":
        return new ProductA();
      case "B":
        return new ProductB();
      default:
        return new ProductDefault();
    }
  }

  public static void main(String[] args) {
    Product Product = SimpleFactoryPattern.createProduct("B");
    Product.print();
  }
}
