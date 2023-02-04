package com.promineotech.trekbikes.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Trek {
	private String color;
	private String drivetrain;
	private String frameset;
	private String handlebar;
	private String saddle;
	private String tire;
}
