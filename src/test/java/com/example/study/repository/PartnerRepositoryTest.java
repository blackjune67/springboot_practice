package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Partner;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class PartnerRepositoryTest extends StudyApplicationTests {

    @Autowired
    private PartnerRepository partnerRepository;


    @Test
    public void create() {
        String name = "파트너01";
        String status = "RESISTERED";
        String address = "서울시 강남구";
        String callCenter = "070-6969-7474";
        String partnerNumber = "010-1234-5678";
        String businessNumber = "1234567890123";
        String ceoName = "고길동";
        LocalDateTime registredAt = LocalDateTime.now();
        LocalDateTime createAt = LocalDateTime.now();
        String createBy = "AdminServer";

        Partner partner = new Partner();
        partner.setName(name);
        partner.setStatus(status);
        partner.setAddress(address);
        partner.setCallCenter(callCenter);
        partner.setPartnerNumber(partnerNumber);
        partner.setBusinessNumber(businessNumber);
        partner.setCeoName(ceoName);
        partner.setRegisteredAt(registredAt);
        partner.setCreatedAt(createAt);
        partner.setCreatedBy(createBy); //생성을 누가했는지에 대한 지정

        Partner newPartner = partnerRepository.save(partner);

        Assert.assertNotNull(newPartner); //notNull 을 통해서 insert 되는지

        Assert.assertEquals(newPartner.getCeoName(), ceoName); // insert가 정상적으로 되었다면 대상과 비교해서 TEST
    }
}
