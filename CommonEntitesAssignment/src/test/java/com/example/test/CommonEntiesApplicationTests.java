package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.example.test.exception.RecordNotFoundException;
import com.example.test.model.DatedConversionToUom;
import com.example.test.model.DatedMainUomConversionDated;
import com.example.test.model.UomConversionDated;
import com.example.test.repositry.UomConversionDatedRepositry;
import com.example.test.service.CommonEntiesService;

//@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@SpringBootTest
//@RunWith(MockitoJUnitRunner.class)*
public class CommonEntiesApplicationTests {

	@Autowired
	private CommonEntiesService commonEntiesService;

	@MockBean
	private UomConversionDatedRepositry conversionDatedRepositry;

	public UomConversionDated getUom() {
		// given
		DatedConversionToUom datedConversionToUom = new DatedConversionToUom();
		datedConversionToUom.setUomTypeId(3);
		datedConversionToUom.setAbbrevation("date5");

		List<DatedConversionToUom> dctu = new ArrayList<>();
		dctu.add(datedConversionToUom);

		DatedMainUomConversionDated datedMainUomConversionDated = new DatedMainUomConversionDated();
		datedMainUomConversionDated.setMainId(5);
		datedMainUomConversionDated.setDescription("updated5");
		DatedMainUomConversionDated datedMainUomConversionDated1 = new DatedMainUomConversionDated();
		datedMainUomConversionDated1.setMainId(6);
		datedMainUomConversionDated1.setDescription("updated5");

		List<DatedMainUomConversionDated> dmcd = new ArrayList<>();
		dmcd.add(datedMainUomConversionDated);
		dmcd.add(datedMainUomConversionDated1);

		UomConversionDated entity = new UomConversionDated();
		entity.setUomID(4);
		entity.setUomIdTo("record5");
		entity.setRoundingMode("roundingMode");
		entity.setFromDate(new Date());
		entity.setDecimalScale(200l);
		entity.setCustomeMethodId("s-567");
		entity.setConversationFactories("conversationFactories");
		entity.setDctu(dctu);
		entity.setDmucd(dmcd);
		return entity;
	}

	@Test   //findallrecords
	public void findAllRecordsTest() {
		// when(conversionDatedRepositry.findAll()).thenReturn(Stream.of(getUom()).collect(Collectors.toList()));
		System.out.println(getUom());
		List<UomConversionDated> collect = Stream.of(getUom()).collect(Collectors.toList());
		System.out.println("list stream "+collect);
		List<UomConversionDated> findAll = conversionDatedRepositry.findAll();
		System.out.println("repositry : "+findAll);
		System.out.println("when method called --> "+when(conversionDatedRepositry.findAll()).thenReturn(Stream.of(getUom()).collect(Collectors.toList())));
        System.out.println("service find methos :" +commonEntiesService.findAllRecords().size());
		assertEquals(1, commonEntiesService.findAllRecords().size());

	}

	/*@Test   //delete
	public void deleteRecordTest() throws RecordNotFoundException {
		// when(conversionDatedRepositry.findAll()).thenReturn(Stream.of(getUom()).collect(Collectors.toList()));
		commonEntiesService.deleteId(getUom().getUomID());
		verify(conversionDatedRepositry, times(1)).deleteById(getUom().getUomID());

	}

	@Test
	public void findByIdTest() {
		// when(conversionDatedRepositry.findAll()).thenReturn(Stream.of(getUom()).collect(Collectors.toList()));
		when(conversionDatedRepositry.findById(4)).thenReturn(Stream.of(getUom()).collect(Collectors.toList()));

		assertEquals(1, commonEntiesService.fetchById(4));
	}

	@Test
	public void updateTest() throws RecordNotFoundException {
		// when(conversionDatedRepositry.findAll()).thenReturn(Stream.of(getUom()).collect(Collectors.toList()));
		when(conversionDatedRepositry.save(getUom())).thenReturn(getUom());

		assertEquals(getUom(), commonEntiesService.updateId(4, getUom()));

	}

	@Test
	public void createTest() throws RecordNotFoundException {
		// when(conversionDatedRepositry.findAll()).thenReturn(Stream.of(getUom()).collect(Collectors.toList()));
		when(conversionDatedRepositry.save(getUom())).thenReturn(getUom());

		assertEquals(getUom(), commonEntiesService.addAllRecords(getUom()));

	}*/
}
