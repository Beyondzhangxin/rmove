package cn.com.aiidc.rmove.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Zhangx on 2017/11/18 at 15:46.
 */
@Entity
@Table(name = "OVER_POLLUTION_DATA", schema = "EPUSER", catalog = "")
public class OverPollutionData
{
    private String testNo;
    private Byte licenseType;
    private Long pm;
    private Long nox;
    private Long co;
    private Long ydz;
    private Long hc;
    private Time testDate;
    private Long testPointId;
    private VehicleInfo vehicle;

    @Id
    @Column(name = "TEST_NO", nullable = false, length = 50)
    public String getTestNo()
    {
        return testNo;
    }

    public void setTestNo(String testNo)
    {
        this.testNo = testNo;
    }

    @Basic
    @Column(name = "LICENSE_TYPE", nullable = true, precision = 0)
    public Byte getLicenseType()
    {
        return licenseType;
    }

    public void setLicenseType(Byte licenseType)
    {
        this.licenseType = licenseType;
    }

    @Basic
    @Column(name = "PM", nullable = true, precision = 0)
    public Long getPm()
    {
        return pm;
    }

    public void setPm(Long pm)
    {
        this.pm = pm;
    }

    @Basic
    @Column(name = "NOX", nullable = true, precision = 0)
    public Long getNox()
    {
        return nox;
    }

    public void setNox(Long nox)
    {
        this.nox = nox;
    }

    @Basic
    @Column(name = "CO", nullable = true, precision = 1)
    public Long getCo()
    {
        return co;
    }

    public void setCo(Long co)
    {
        this.co = co;
    }

    @Basic
    @Column(name = "YDZ", nullable = true, precision = 0)
    public Long getYdz()
    {
        return ydz;
    }

    public void setYdz(Long ydz)
    {
        this.ydz = ydz;
    }

    @Basic
    @Column(name = "HC", nullable = true, precision = 0)
    public Long getHc()
    {
        return hc;
    }

    public void setHc(Long hc)
    {
        this.hc = hc;
    }

    @Basic
    @Column(name = "TEST_DATE", nullable = true)
    public Time getTestDate()
    {
        return testDate;
    }

    public void setTestDate(Time testDate)
    {
        this.testDate = testDate;
    }

    @Basic
    @Column(name = "TEST_POINT_ID", nullable = true, precision = 0)
    public Long getTestPointId()
    {
        return testPointId;
    }

    public void setTestPointId(Long testPointId)
    {
        this.testPointId = testPointId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OverPollutionData that = (OverPollutionData) o;

        if (testNo != null ? !testNo.equals(that.testNo) : that.testNo != null) return false;
        if (licenseType != null ? !licenseType.equals(that.licenseType) : that.licenseType != null) return false;
        if (pm != null ? !pm.equals(that.pm) : that.pm != null) return false;
        if (nox != null ? !nox.equals(that.nox) : that.nox != null) return false;
        if (co != null ? !co.equals(that.co) : that.co != null) return false;
        if (ydz != null ? !ydz.equals(that.ydz) : that.ydz != null) return false;
        if (hc != null ? !hc.equals(that.hc) : that.hc != null) return false;
        if (testDate != null ? !testDate.equals(that.testDate) : that.testDate != null) return false;
        if (testPointId != null ? !testPointId.equals(that.testPointId) : that.testPointId != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = testNo != null ? testNo.hashCode() : 0;
        result = 31 * result + (licenseType != null ? licenseType.hashCode() : 0);
        result = 31 * result + (pm != null ? pm.hashCode() : 0);
        result = 31 * result + (nox != null ? nox.hashCode() : 0);
        result = 31 * result + (co != null ? co.hashCode() : 0);
        result = 31 * result + (ydz != null ? ydz.hashCode() : 0);
        result = 31 * result + (hc != null ? hc.hashCode() : 0);
        result = 31 * result + (testDate != null ? testDate.hashCode() : 0);
        result = 31 * result + (testPointId != null ? testPointId.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "LICENSE", referencedColumnName = "LICENSE")
    public VehicleInfo getVehicle()
    {
        return vehicle;
    }

    public void setVehicle(VehicleInfo vehicle)
    {
        this.vehicle = vehicle;
    }
}
