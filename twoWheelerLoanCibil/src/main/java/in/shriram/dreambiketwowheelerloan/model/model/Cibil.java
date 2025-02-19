package in.shriram.dreambiketwowheelerloan.model.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cibil {

	private int cibilId;
	private int cibilScore;
	private Date cibilscoredDateTime;
	private String status;
	private String cibilRemark;
}
