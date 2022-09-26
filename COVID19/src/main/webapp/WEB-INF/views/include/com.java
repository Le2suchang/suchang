import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import org.jsoup.select.Elements;

public class Main {
	private final static String address = "http://ncov.mohw.go.kr/";
	
	public static void main(String[] args) throws Exception {
		Document doc = Jsoup.connect(address).header("User-Agent", "Mozilla/5.0").get();
		
		String h3 = doc.select("h3").text(); //h1태그의 내용만을 추출
		String h4 = doc.select("h4").eq(1).text(); //1번째 인덱스에 위치한 h2태그의 내용만을 추출
		Elements contents = doc.select("p"); //p태그의 내용은 여러개이기 때문에 Elements객체에 우선 담는다.
		
		System.out.println(h3);
		System.out.println(h4);
		
		//idx = 현재 출력중인 라인이 몇번째 줄인지 나타냄
		int idx = 0;
		//foreach문을 이용하여 출력
		for(Element element : contents){
			if(0<idx && idx<5){
				//<p>태그의 내용만을 추출하기 위해 .text()메서드 사용
				System.out.println(element.text());
			}
			idx++;
		}
	}
}


/*import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Main {

	public static void main(String[] args) {
	

		try {
		    // 1. URL 선언
		    String connUrl = "naver.com";
		​
		    // 2. HTML 가져오기
		    Document doc = Jsoup.connect(connUrl).get();
		​
		    // 3. 가져온 HTML Document 를 확인하기
		    System.out.println(doc.toString());
		​
		} catch (IOException e) {
		    // Exp : Connection Fail
		    e.printStackTrace();
		}
	}
}*/