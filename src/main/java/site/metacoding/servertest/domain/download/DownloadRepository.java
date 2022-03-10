package site.metacoding.servertest.domain.download;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // 사실 안붙여도 됨. 부모 클래스에 정의되어 있음.
public interface DownloadRepository extends JpaRepository<Download, Integer> {

}
