package prob02;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import prob02.dao.BookDAO;
import prob02.vo.BookVO;


public class BookShop {

	public static void main(String[] args) {
		displayBookInfo();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요: ");
		long no = scanner.nextLong();
		scanner.close();
		
		System.out.println();
		
		rent(no);
		displayBookInfo();
	}
	
	private static void rent(long no) {
		new BookDAO().updateStatus(no, "대여중");
	}
	
	public static void displayBookInfo() {
		System.out.println("***** 도서 정보 출력하기 *****");
		
		List<BookVO> list = new BookDAO().getList();
		for (BookVO vo : list) {
			System.out.println(
				"책 번호: " + vo.getNo() +
				", 책 제목: " + vo.getTitle() +
				", 저자: " + vo.getAuthorName() +
				", 대여 유무: " + vo.getStatus()
			);
		}
	}
}
