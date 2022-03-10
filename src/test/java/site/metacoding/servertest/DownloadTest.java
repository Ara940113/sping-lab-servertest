package site.metacoding.servertest;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import site.metacoding.servertest.domain.download.Download;

public class DownloadTest {
    @Test
    public void download() {
        RestTemplate rt = new RestTemplate();
        Download[] d = rt.getForObject(
                "http://3.38.254.72:5000/api/hospital?sidoCdNm=부산&sgguCdNm=부산사하구",
                Download[].class);
        List<Download> list = Arrays.asList(d);

        System.out.println(list.get(0));

        // 2) DB에 saveAll() + model에 담기
        // return "list";
    }
}
