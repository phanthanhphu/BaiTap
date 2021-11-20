package test2;

public class circle {
   public final float PI = 3.14f;
   private float banKinh;
   
   public void SetbanKinh(float banKinh) {
	   this.banKinh = banKinh;
	   
   }
   
   public float tinhChuVi() {
	   return 2 * PI * banKinh;
	   
   }
   
   public float tinhDienTich() {
	   return PI * banKinh * banKinh;
   }
   
   
}
