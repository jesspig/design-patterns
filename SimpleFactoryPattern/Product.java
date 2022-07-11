package SimpleFactoryPattern;

abstract class Product {
  abstract void print();
}

class ProductA extends Product {

  @Override
  void print() {
    System.out.println("ProductA");
  }

}

class ProductB extends Product {
  @Override
  void print() {
    System.out.println("ProductB");

  }
}

class ProductDefault extends Product {
  @Override
  void print() {
    System.out.println("ProductDefault");
  }
}