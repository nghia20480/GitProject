import java.util.ArrayList;

public  class Product {
   private String tenSanPham;
   private int maSanPham;
   private int giaSanPham;

    public Product(String tenSanPham, int maSanPham, int giaSanPham) {
        this.tenSanPham = tenSanPham;
        this.maSanPham = maSanPham;
        this.giaSanPham = giaSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(int giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    @Override
    public String toString() {
        return "Product{" +
                "tenSanPham='" + tenSanPham + '\'' +
                ", maSanPham=" + maSanPham +
                ", giaSanPham=" + giaSanPham +
                '}';
    }
}
