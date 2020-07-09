package one;

public class Time extends Thread {
  Checkerboard a;
  UI b;
  Time(Checkerboard a, UI b){
    this.a = a;
    this.b = b;
  }

  public void run() {
    for (int i = 1; i > 0; i++) {
      a.Transfer();
      b.Draw_color(a.GetRow(), a.GetColumn()); 
      try {
        this.sleep(1000);
        System.out.println("ิÝอฃมห1000");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.print("ok");
  }
}
