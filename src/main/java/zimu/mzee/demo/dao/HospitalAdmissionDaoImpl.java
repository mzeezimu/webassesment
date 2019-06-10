package zimu.mzee.demo.dao;

import java.util.List;
import javax.persistence.*;

import zimu.mzee.demo.api.HospitalAdmissionDao;
import zimu.mzee.demo.entities.HospitalAdmission;

public class HospitalAdmissionDaoImpl implements HospitalAdmissionDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<HospitalAdmission> getHospitalAdmissions() {

        Query query = entityManager.createQuery("from HospitalAdmission as model where model.id = :id", HospitalAdmission.class);

        return (List<HospitalAdmission>) query.getResultList();
    }






}
