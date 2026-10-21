import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo Scanner để đọc dữ liệu từ bàn phím (System.in)
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập chuỗi ký tự
        System.out.print("Nhập họ và tên: ");
        String name = scanner.nextLine();

        // 2. Nhập số nguyên
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine().trim());

        // 3. Nhập số thực
        System.out.print("Nhập điểm trung bình (GPA): ");
        double gpa = Double.parseDouble(scanner.nextLine().trim());

        // 4. Nhập sở thích
        System.out.print("Nhập sở thích của bạn: ");
        String hobby = scanner.nextLine();

        // In kết quả ra màn hình
        System.out.println("\n===============================");
        System.out.println("       THÔNG TIN CỦA BẠN       ");
        System.out.println("===============================");
        System.out.println("Họ và tên : " + name);
        System.out.println("Tuổi      : " + age);
        System.out.println("Điểm GPA  : " + gpa);
        System.out.println("Sở thích  : " + hobby);
        System.out.println("===============================");

        // Đóng scanner sau khi dùng xong
        scanner.close();
    }
}
