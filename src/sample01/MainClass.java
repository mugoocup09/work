package sample01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("헬로 자바");
	    
	    System.out.println("수정하였음 ! ");
	    // 한 줄 주석문 -> 컴파일 되지 않는다.
	    /* 
	     * 
	     * 범위 주석
	     * 
	     */
	    // 기능 : escape sequence
	    // \n (개행), \b (backspace), \" 따옴표를 문자열, \t(띄어쓰기), \\ 역슬러시 기입 
	    
	    System.out.print("world\n");
	    
	    System.out.println("헬로우\b");
	    
	    System.out.println("\"Hello world\"");
	    
	    System.out.println("Hello\tworld");
	    
	    System.out.println("\\Hello\\");
	    
	    System.out.println("Hello" + "world");
	    

	}

}
