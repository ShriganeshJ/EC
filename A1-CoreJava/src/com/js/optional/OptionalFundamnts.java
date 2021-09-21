package com.js.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalFundamnts {

	public static void main(String[] args) {
		// way to create optional
		Optional.empty();
		// Optional.of("non null value it thow excepitn");
		// Optional.ofNullable(null).orElse("nullvalue");
		// Optional.ofNullable(null).orElseThrow(()-> new
		// IllegalAccessError("Message"));

		List<Optional<String>> list = new ArrayList<>();

		list.add(Optional.empty());
		list.add(Optional.of("Str1"));
		list.add(Optional.of("Str2"));
		list.add(Optional.of("Str3"));
		list.add(Optional.of("Str4"));
		list.add(Optional.of("Str5"));
		list.add(Optional.ofNullable(null));
		list.add(Optional.ofNullable(null));

		// isPresent and get method

		List<String> collect = list.stream().filter(Optional::isPresent).map(obj -> obj.get())
				.collect(Collectors.toList());

		System.out.println(collect);

	}

	public class beans {

		public beans(String aggId, String customerName, String engNumber, String chassiesNumber) {
			super();
			this.aggId = aggId;
			this.customerName = customerName;
			this.engNumber = engNumber;
			this.chassiesNumber = chassiesNumber;
		}

		private String aggId;
		private String customerName;
		private String engNumber;
		private String chassiesNumber;

		public Optional<String> getAggId() {
			return Optional.ofNullable(aggId);
		}

		public void setAggId(String aggId) {
			this.aggId = aggId;
		}

		public Optional<String> getCustomerName() {
			return Optional.ofNullable(customerName);
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public Optional<String> getEngNumber() {
			return Optional.ofNullable(engNumber);
		}

		public void setEngNumber(String engNumber) {
			this.engNumber = engNumber;
		}

		public Optional<String> getChassiesNumber() {
			return Optional.ofNullable(chassiesNumber);
		}

		public void setChassiesNumber(String chassiesNumber) {
			this.chassiesNumber = chassiesNumber;
		}

	}

}
