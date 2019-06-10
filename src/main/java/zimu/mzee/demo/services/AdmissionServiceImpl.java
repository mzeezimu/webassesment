package zimu.mzee.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import zimu.mzee.demo.api.AdmissionService;
import zimu.mzee.demo.api.HospitalAdmissionDao;

import java.util.List;

public class AdmissionServiceImpl implements AdmissionService {
    @Autowired
    private HospitalAdmissionDao hospitalAdmissionDao;

    public List getHospitalAdmissions() {
        return hospitalAdmissionDao.getHospitalAdmissions();
    }
}
