package kr.co.ezenac.string;

public class TextBlockTest {
	public static void main(String[] args) {
		String textBlock = """	
				태풍이 옵니다.
				비가 오늘 계속 온다고 합니다.
						내일도...
				기온이 내려갑니다.
				""";
		
		System.out.println(textBlock);
		//입력한 그대로 인식하고 출력
		
		System.out.println(getTextBlockofHtml());
	}
	public static String getTextBlockofHtml() {
		return """
				<html>
					<body>
						<span>Good Bye typhoon!</span>
					<body>
				</html>
				""";
	}
}
