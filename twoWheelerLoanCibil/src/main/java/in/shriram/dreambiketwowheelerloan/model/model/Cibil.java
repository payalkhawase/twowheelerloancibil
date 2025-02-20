package in.shriram.dreambiketwowheelerloan.model.model;

import java.util.Date;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
public class Cibil {

	@Id  
	private int cibilId; 
	@Min(value=300,message = "Cibil score greater than 300")
	@Max(value=900,message = "Cibil score less than 900")
	private int cibilScore;
	private Date cibilscoredDateTime;
	@NotBlank(message = "Status should not be blank")
	@NotEmpty(message = "Status should not be empty")
	private String status;
	//{Excellent,VeryGood,Good};
	@NotBlank(message = "Cibil remark should not be blank")
	@NotEmpty(message = "Cibil remark should not be empty")
	@NotNull(message = "Cibil remark should not be null")
	private String cibilRemark;

}
