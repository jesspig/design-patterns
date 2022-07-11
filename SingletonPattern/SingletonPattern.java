package SingletonPattern;

/*
 * 调用前实例化
 */
public class SingletonPattern {
  private static SingletonPattern singleton = new SingletonPattern();

  public static SingletonPattern getSingleton() {
    return singleton;
  }

  public static void main(String[] args) {
    SingletonPattern s1 = SingletonPattern.getSingleton();
    SingletonPattern s2 = SingletonPattern.getSingleton();
    System.out.println(s1.equals(s2));
  }
}