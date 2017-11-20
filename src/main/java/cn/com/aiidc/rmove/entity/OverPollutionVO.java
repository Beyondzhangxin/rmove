package cn.com.aiidc.rmove.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Zhangx on 2017/11/16 at 10:44.
 */
@Entity
public class OverPollutionVO implements Serializable
{
    private Integer num;
    @Id
    private String fuelTypeName;

    public Integer getNumber()
    {
        return num;
    }

    public void setNumber(Integer number)
    {
        this.num = number;
    }

    public String getFuelTypeName()
    {
        return fuelTypeName;
    }

    public void setFuelTypeName(String fuelTypeName)
    {
        this.fuelTypeName = fuelTypeName;
    }
}
