import java.util.Scanner;

public class BTT2 {
    public static void main(String[] args) {
        // Khởi tạo Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Nhap ho va ten:");
        String hoTen = scanner.nextLine();

        // In kết quả ra màn hình
        System.out.println("Ho va ten cua ban la:" + hoTen);

        // Đóng scanner
        scanner.close();
    }
}
