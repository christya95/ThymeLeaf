package ca.sheridancollege.christya.beans;

import java.io.Serializable;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course implements Serializable {
	
	private Long id;
	private String prefix;
	private String code;
	private String name;
	

}
