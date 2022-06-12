package jjfactory.petclinic.business.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@NoArgsConstructor
@Getter
@Embeddable
public class Address {

    private Integer postcode;   // 우편번호
    private String roadAddress; // 도로명 주소
    private String detailAddress;   // 상세 주소
    private String extraAddress;    // 참고사항

    @Builder
    public Address(Integer postcode, String roadAddress, String detailAddress, String extraAddress) {
        this.postcode = postcode;
        this.roadAddress = roadAddress;
        this.detailAddress = detailAddress;
        this.extraAddress = extraAddress;
    }
}
