package zingmp3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class CrawlSongExample {
    public static void main(String[] args) {
        try{
            // Sử dụng lớp URL của gói java.net để khởi tạo đường dẫn thư viện nhạc muốn lấy danh sách bài hát
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

            // Mở stream và đưa nó vào InputStreamReader...
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();

            // close scanner...
            scanner.close();

            // Xóa tất cả các new line trong content lấy được...
            content = content.replaceAll("\\n+", "");

            // Lọc nội dung content lấy được trong tag a chứa class name_song và in ra danh sách tên bài hát lấy được theo điều kiện lọc
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()){
                System.out.println(m.group(1));
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
