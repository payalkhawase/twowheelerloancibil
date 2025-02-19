package in.shriram.dreambiketwowheelerloan.model.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cibil {
	@Id
	private int cibilId;
	private int cibilScore;
	private Date cibilscoredDateTime;
	private String status;
	private String cibilRemark;
}
