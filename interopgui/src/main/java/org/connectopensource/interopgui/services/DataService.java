/**
 * 
 */
package org.connectopensource.interopgui.services;

import java.util.List;

import org.connectopensource.interopgui.dataobject.OrganizationInfo;
import org.connectopensource.interopgui.dataobject.PatientInfo;

/**
 * @author msw
 *
 */
public interface DataService {
    
    /**
     * @param org
     * @return the id of the newly saved record.
     */
    public Long saveData(OrganizationInfo org);
    
    /**
     * @return list of all Organization Info
     */
    public List<OrganizationInfo> getData();
    
    /**
     * @param homeCommunityId
     * @return list of organization info matching a home community.
     */
    public List<OrganizationInfo> getDataByHCID(String homeCommunityId);
    
    /**
     * @param Id
     * @return list of organization info matching an id.
     */
    public OrganizationInfo getData(String id);
    
    /**
     * @param org
     * @return the id of the newly saved record.
     */
    public PatientInfo addPatient(PatientInfo patient, String orgId);

}
