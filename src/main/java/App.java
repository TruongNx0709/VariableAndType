public class App {
    public static void main (String[] args){
        String str;
        str = "One Mount Group";
        System.out.println(str);
        tinhNamSinh();
        nhap2SoAvaB();
        tinhTienVaThue();
        tinhDIemThi();
    }
    public static void tinhNamSinh(){
        int namSinhA = 1988;
        int namSinhB = 2019;
        int namSinhC = 1954;
        int namHienTai = 2021;
        int sotuoiA = namHienTai - namSinhA;
        int sotuoiB = namHienTai - namSinhB;
        int sotuoiC = namHienTai - namSinhC;
        System.out.println("Bài 1 : Tính năm sinh");
        System.out.println(sotuoiA +" Tuổi");
        System.out.println(sotuoiB +" Tuổi");
        System.out.println(sotuoiC +" Tuổi");
        System.out.println("-------------------------------------");
    }
    public static void nhap2SoAvaB(){
        int soMot = 3300;
        int soHai = 2200;
        int tongHaiSo = soMot + soHai;
        int hieuHaiSo = soMot - soHai;
        int tinhHaiSo = soMot * soHai;
        int thuongHaiSo = soMot / soHai;
        System.out.println("Bài 2 : Tính tong hieu 2 so");
        System.out.println("Tổng 2 số : "+tongHaiSo);
        System.out.println("Hiệu 2 số : "+hieuHaiSo);
        System.out.println("Thương 2 số : "+thuongHaiSo);
        System.out.println("Tính 2 số : "+tinhHaiSo);
        System.out.println("-------------------------------------");
    }
    public static void tinhTienVaThue(){
        int soLuong = 33;
        int donGia = 2200;
        int tongTien = soLuong * donGia;
        int tienThue = 10*tongTien/100;
        System.out.println("Bài 3 : Tính tiền và thuế");
        System.out.println("Tổng tiền : "+tongTien);
        System.out.println("Tiền thuế giá trị gia tăng : "+tienThue);
        System.out.println("-------------------------------------");
    }
    public static void tinhDIemThi(){
        int diemToan = 8;
        int diemHoa = 9;
        int diemLy = 7;
        int heSo = 2;
        int diemTrungBinh = ((diemToan * heSo) + diemHoa + diemLy)/4;
        System.out.println("Bài 4 : Tính điểm trung bình");
        System.out.println("Điểm trung bình : "+diemTrungBinh);
        System.out.println("-------------------------------------");
    }
}
