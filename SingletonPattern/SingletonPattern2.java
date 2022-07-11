package SingletonPattern;

/*
 * 调用时实例化
 */
public class SingletonPattern2 {
  private static SingletonPattern2 singleton;

  public static SingletonPattern2 getSingleton() {
    if (singleton == null) {
      singleton = new SingletonPattern2();
    }
    return singleton;
  }

  public static void main(String[] args) {
    SingletonPattern2 s1 = SingletonPattern2.getSingleton();
    SingletonPattern2 s2 = SingletonPattern2.getSingleton();
    System.out.println(s1.equals(s2));
  }
}
