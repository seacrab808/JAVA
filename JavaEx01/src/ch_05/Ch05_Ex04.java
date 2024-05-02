package ch_05;

class Point4 {
   private int x, y;
   public Point4(int x, int y) {
      this.x = x;
      this.y = y;
   }
   public int getX() {
      return x;
   }
   public int getY() {
      return y;
   }
   
   protected void move(int x, int y) {
      this.x = x;
      this.y = y;
   }
}

class ColorPoint4 extends Point4 {
   private String color;
   
   public void setColor(String color) {
      this.color = color;
   }
   
   public ColorPoint4(int x, int y, String color) {
      super(x, y);
      this.color = color;
   }
   
   public void setPoint(int x, int y) {
      move(x, y);
   }
   
   public void show() {
      System.out.println(color + " 색으로 (" + getX() + "," + getY() + ")");
   }
}

public class Ch05_Ex04 {
   public static void main(String[] args) {
      ColorPoint4 cp = new ColorPoint4(5, 5, "YELLOW");
      cp.setPoint(10, 20);
      cp.setColor("GREEN");
      cp.show();
   }
}