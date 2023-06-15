/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dkhau.mathutil.core;

/**
 *
 * @author Admin
 */
//class nay clone lai cai class huyen thoai java.util.Math
//voi cac ham noi tieng Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    public static final double PI = 3.1415;
    
    //class nay chua ham static, cham xai luon
    // tinh n giai thua n! = 1.2.3...n
    // quy uoc thiet ke ham nay nhu sau
    //0!=1!=1
    //ko co giai thua so am. neu dua so am, chui
    // giai thua tang nhanh 20! vua khop full kieu long
    // do do 21! ko dung kieu long dc, neu dua > 21, chui
    //chui: ko tra ve gia tri gi ca ma nem ra exception
    public static long getFactorial(int n){
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        
        if (n==0 || n == 1)
            return 1;
        
        long product = 1; //tích nhân dồn khởi động từ 1
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }
}

//TDD: TEST DRIVEN DEVELOPMENT phát triển phần mềm theo phong cách
//code đến đâu kiểm thử đến đó, viết code và viết test case/test run
//diễn ra song song, đan xen

//cứ có hàm là có test case
//viết ra các test case đủ bao quát các tình huống xài hàm
//test case: là bộ dữ liệu dùng để đưa vào app/ hàm để mô phỏng lai
//1 tình huống xài app/hàm. Nó có input data, giải thích cách dùng hàm/app
//và có giá trị trả về expected
//run(test run/test execution) để luận đúng sai

//DÂN DEV GIỐNG DÂN QC Ở CHỖ NÀY:
//ĐẦU PHẢI VIẾT/TẠO RA TEST CASE, ĐỀU PHẢI TIẾN HÀNH RUN/CHẠY TEST
//VÀ ĐỀU PHẢI ĐỌC KẾT QUẢ ĐÚNG SAI
//DEV KHÁC TESTER LÀ PHẢI VIẾT CODE LÀM APP!!!

//Test case ko viết tự do mà viết theo template
//Viết tự do: 0! ->1; 1!->1; 2!->2;3!->6
//Viết chuẩn lại test case (Xuất hiện trong đề thi PE, khóa luận T/N)
//Test case #1: mục tiêu test check getF() with n = 0
/*Steps-Procedures
    1.Given n=0;
    2.Call the getF(n) (getF(0))
Expected results: kết quả kì vọng
    getF(0) must return 1

Test case #2: mục tiêu test check getF() with n = 1
Steps-Procedures
    1.Given n=1;
    2.Call the getF(n) (getF(1))
Expected results: kết quả kì vọng
    getF(1) must return 1
*/