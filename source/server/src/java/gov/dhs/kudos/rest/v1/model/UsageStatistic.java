/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.dhs.kudos.rest.v1.model;

import java.sql.Timestamp;

/**
 *
 * @author tdickerson
 */
@SuppressWarnings("serial")
public class UsageStatistic extends BaseEntity
{
    private String uri;
    private String user;
    
    public UsageStatistic(String uri, String user)
    {
        this.uri = uri;
        this.user = user;
    }

    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }
}
