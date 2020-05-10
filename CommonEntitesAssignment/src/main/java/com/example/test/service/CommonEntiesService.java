package com.example.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.test.exception.RecordNotFoundException;
import com.example.test.model.ErrorMssg;
import com.example.test.model.UomConversionDated;
import com.example.test.repositry.DatedConversionToUomRepositry;
import com.example.test.repositry.DatedMainUomConversionDatedRepositry;
import com.example.test.repositry.UomConversionDatedRepositry;

@Service
public class CommonEntiesService {

	@Autowired
	UomConversionDatedRepositry uomRepositry;
	@Autowired
	DatedMainUomConversionDatedRepositry dmcdRepositry;
	@Autowired
	DatedConversionToUomRepositry dctuRepositry;

	public UomConversionDated addAllRecords(UomConversionDated dated) {
		return uomRepositry.save(dated);
	}

	public List<UomConversionDated> findAllRecords() {
		return uomRepositry.findAll();
	}

	public UomConversionDated fetchById(int id) throws RecordNotFoundException {
		return uomRepositry.findById(id).orElseThrow(
				() -> new RecordNotFoundException("record not found of the given id : "+id));
	}

	public String deleteId(int id) throws RecordNotFoundException {
		String records = uomRepositry.findById(id).map(uom -> {
			uomRepositry.delete(uom);
			return "Delete Successfully!";
		}).orElseThrow(
				() -> new RecordNotFoundException("record not present of the given id : "+id));
		return records;
	}

	public UomConversionDated updateId(int id, UomConversionDated updateDetails) throws RecordNotFoundException {
		UomConversionDated update = fetchById(id);
		update.setUomIdTo(updateDetails.getUomIdTo());
		update.setFromDate(updateDetails.getFromDate());
		update.setCustomeMethodId(updateDetails.getCustomeMethodId());
		update.setConversationFactories(updateDetails.getConversationFactories());
		update.setDecimalScale(updateDetails.getDecimalScale());
		update.setRoundingMode(updateDetails.getRoundingMode());
		update.setDmucd(updateDetails.getDmucd());
		update.setDctu(updateDetails.getDctu());
		return addAllRecords(update);

	}

}
