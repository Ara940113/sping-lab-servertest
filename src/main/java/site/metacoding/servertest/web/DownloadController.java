package site.metacoding.servertest.web;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import site.metacoding.servertest.domain.download.Download;
import site.metacoding.servertest.domain.download.DownloadRepository;

@RequiredArgsConstructor
@Controller
public class DownloadController {

    private final DownloadRepository downloadRepository;

    // 2. 다운로드 메서드 만들기
    // 1). URI로 다운로드
    @GetMapping("/download")
    public String download(Model model) {
        RestTemplate rt = new RestTemplate();
        Download[] d = rt.getForObject(
                "http://3.38.254.72:5000/api/hospital?sidoCdNm=부산&sgguCdNm=부산사하구",
                Download[].class);
        List<Download> list = Arrays.asList(d);

        // 2) DB에 saveAll() + model에 담기

        downloadRepository.saveAll(list);
        model.addAttribute("downloads", downloadRepository.findAll());

        return "list";
    }

    @GetMapping("downloadForm")
    public String downloadForm() {
        return "downloadForm";
    }

}
