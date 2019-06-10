package zimu.mzee.demo.api;

import zimu.mzee.demo.entities.HospitalAdmission;

import java.util.List;

public interface HospitalAdmissionDao {

    public List<HospitalAdmission> getHospitalAdmissions();
}
