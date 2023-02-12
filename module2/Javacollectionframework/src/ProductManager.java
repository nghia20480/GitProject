import java.util.ArrayList;

public class ProductManager  {
private ArrayList<Product> danhSach;

    public ProductManager() {
    }

    public ProductManager(ArrayList<Product> danhSach) {
        this.danhSach = danhSach;
    }
    public void themSanPham(Product sp){
        this.danhSach.add(sp);
    }
    public void inDanhSachSanPham(){

            
        }
    }


