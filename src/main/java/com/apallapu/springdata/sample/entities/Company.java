package com.apallapu.springdata.sample.entities;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Company {

	@Id
	private String id;

	@Field
	private String name;

	@Field
	private String companyId;

	@Field
	private List<Area> areas = new ArrayList<>();

	@Field
	private List<String> phoneNumbers = new ArrayList<>();

}
