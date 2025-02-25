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
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int cibilId; 
	private int cibilScore;
	private Date cibilscoredDateTime;
	private String status;
	private String cibilRemark;

}
  