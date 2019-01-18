package prob02.test;

import java.util.List;

import prob02.dao.BookDAO;
import prob02.vo.BookVO;

public class BookDAOTest {

	public static void main(String[] args) {
//		insertTest("트와일라잇", 1);
//		insertTest("뉴문", 1);
//		insertTest("이클립스", 1);
//		insertTest("브레이킹 던", 1);
//		insertTest("아리랑", 2);
//		insertTest("젊은그들", 3);
//		insertTest("아프니까 청춘이다", 4);
//		insertTest("귀천", 5);
//		insertTest("태백산맥", 6);
//		insertTest("풀하우스", 7);
		
		getListTest();
	}
	
	public static void insertTest(String title, long authorNo) {
		BookVO vo = new BookVO();
		vo.setTitle(title);
		vo.setAuthorNo(authorNo);
		
		new BookDAO().insert(vo);
	}
	
	public static void getListTest() {
		List<BookVO> list = new BookDAO().getList();
		for (BookVO vo : list) {
			System.out.println(vo);
		}
	}
	
	

}
