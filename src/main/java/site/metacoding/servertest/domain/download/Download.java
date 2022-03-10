package site.metacoding.servertest.domain.download;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Download {

    // 1. 데이터 베이스 테이블 만들기

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;

    private Integer id;

    private String addr;

    private String mgtStaDd;

    private String pcrPsblYn;

    private String ratPsblYn;

    private String recuClCd;

    private String sgguCdNm;

    private String sidoCdNm;

    private String yadmNm;

    private String ykihoEnc;

    private String xposWgs84;

    private String yposWgs84;

    private String xpos;

    private String ypos;

}
