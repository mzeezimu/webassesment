package zimu.mzee.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class HospitalAdmission {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String contactNumber;
    @Column
    private boolean medAidMember;
    @Column
    private Date admissionDate;
    @Column
    private long membershipNumber;
    @Column
    private String doctor;

    public HospitalAdmission() {
    }

    public HospitalAdmission(String name, String contactNumber, boolean medAidMember, Date admissionDate, String doctor) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.medAidMember = medAidMember;
        this.admissionDate = admissionDate;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }
    public String getDoctor() {
        return doctor;
    }

    public long getMembershipNumber() {
        return membershipNumber;
    }


    public void setId(int id) {this.id = id; }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setMedAidMember(boolean medAidMember) {
        this.medAidMember = medAidMember;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public boolean isMedAidMember() {
        return medAidMember;
    }

    public void setMembershipNumber(long membershipNumber) {
        this.membershipNumber = membershipNumber;
    }
}
