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
	@Min(300)
	@Max(900)
	private int cibilScore;
	@NotEmpty
	private Date cibilscoredDateTime;
	@NotBlank
	@NotEmpty
	private String status;
	@NotBlank
	@NotEmpty
	@NotNull
	private String cibilRemark;
}
