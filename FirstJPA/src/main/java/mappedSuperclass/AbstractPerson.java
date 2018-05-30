package mappedSuperclass;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractPerson {
	protected boolean drivingLicence;

	public boolean getDrivingLicence() {
		return drivingLicence;
	}

	public void setDrivingLicence(boolean drivingLicence) {
		this.drivingLicence = drivingLicence;
	}



}
