// 오픈 챌린지 실습
import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		String boy = scanner.next();
		System.out.println("철수 >> " + boy);
		
		String girl = scanner.next();
		System.out.println("영희 >> " + girl);
		
		scanner.close();
		
		// GPT 작성
		if (boy.equals(girl)) {
            System.out.println("비겼습니다.");
        } else if (
            (boy.equals("가위") && girl.equals("보")) ||
            (boy.equals("바위") && girl.equals("가위")) ||
            (boy.equals("보") && girl.equals("바위"))
        ) {
            System.out.println("철수가 이겼습니다.");
        } else {
            System.out.println("영희가 이겼습니다.");
        }
		
		/*
		if(boy == girl) {
			System.out.println("비겼습니다.");
		}
		else {
			if(boy.equals("가위")) {
				if(girl.equals("바위")) {
					System.out.println("영희가 이겼습니다.");
				} else if (girl.equals("보")) {
					System.out.println("철수가 이겼습니다.");
				}
			} else if(boy.equals("바위")) {
				if(girl.equals("보")) {
					System.out.println("영희가 이겼습니다.");
				} else if (girl.equals("가위")) {
					System.out.println("철수가 이겼습니다.");
				}
			} else {
				if(girl.equals("가위")) {
					System.out.println("영희가 이겼습니다.");
				} else if (girl.equals("바위")) {
					System.out.println("철수가 이겼습니다.");
				}
			}
		}
		*/
	}
}
