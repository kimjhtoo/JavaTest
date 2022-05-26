import java.util.Scanner;

public class Ex09_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str, strRep, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = s.nextLine();

        strRep = str.replace(" ", "$"); //공백을 $로 채우기
        strSub = str.substring(3, 8); // 원하는 갯수를 가져올수 있다. (인덱스 기반)
        strAry = str.split(" "); // 공백을 기준으로 분리하기

        System.out.println("입력 문자열 ==> " + str);
        System.out.println("바뀐 문자열 ==> " + strRep);
        System.out.println("일부 문자열 ==> " + strSub);

        for (int i = 0; i < strAry.length; i++) {
            System.out.println("분리한 문자열" + i + "==>" + strAry[i]);

            String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\"" +
                    "\"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729;" +
                    ".NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

            /* Access_log 서버 로그 샘플
            String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

            if (log.startsWith("111.222")) {

                int ipLastPos = log.indexOf(" ");
                System.out.println("ipLastPos : " + ipLastPos);
                System.out.println("IP : "+ log.substring(0, ipLastPos));

// System.out.println("111.222로 시작하는 IP가 호출한 로그입니다.");
            }
    */
        }
    }
}