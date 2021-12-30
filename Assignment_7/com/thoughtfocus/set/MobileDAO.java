package com.thoughtfocus.set;

import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.thoughtfocus.exception.AddException;
import com.thoughtfocus.exception.DeleteByMobileIdException;
import com.thoughtfocus.exception.UpdateBySerialNumberExcxeption;

public class MobileDAO extends Mobile {
	LinkedHashSet<MobileDTO> mobileDto = new LinkedHashSet<>();

	@Override
	public boolean add(MobileDTO dto) {
		if (dto.getMobileId() != 0 && dto.getSerialNumber() != 0) {
			mobileDto.add(dto);
			return true;
		}
		AddException addException = new AddException();
		throw addException;
	}

	@Override
	public void getAll() {
		if (!mobileDto.isEmpty()) {
			mobileDto.forEach(eachMobile -> System.out.println(eachMobile));
		} else {
			System.out.println("Mobiles are not available");
		}

	}

	@Override
	public void getAllByBrandName(String brandName) {
		if (!mobileDto.isEmpty()) {
			Iterator<MobileDTO> iterator = mobileDto.iterator();
			while (iterator.hasNext()) {
				MobileDTO mobile = iterator.next();
				if (mobile.getBrandName().equals(brandName)) {
					System.out.println(mobile);
				}
			}
		} else {
			System.out.println("Mobiles are finished so no match found");
		}

	}

	@Override
	public MobileDTO deleteByMobileID(long mobileId) {
		Iterator<MobileDTO> iterator = mobileDto.iterator();
		while (iterator.hasNext()) {
			MobileDTO mobile = iterator.next();
			if (mobile.getMobileId() == mobileId) {
				mobileDto.remove(mobile);
				return mobile;
			}
		}
		DeleteByMobileIdException deleteException = new DeleteByMobileIdException();
		throw deleteException;
	}

	@Override
	public MobileDTO updateBySerialNumber(long oldSerailNumber, long newSerailNumber) {

		Iterator iterator = (Iterator) mobileDto.iterator();
		while (iterator.next()) {
			MobileDTO mobile = iterator.next();
			if (mobile.getSerialNumber() == oldSerailNumber) {
				mobile.setSerialNumber(newSerailNumber);
				return mobile;
			}
		}
		UpdateBySerialNumberExcxeption updateException = new UpdateBySerialNumberExcxeption();
		throw updateException;
	}

	

}
