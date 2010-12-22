/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.complykit.config;

/**
 * Date created: 21-dec-2010
 * @author michael
 * @since 0.1
 */
public class RuleLocation {
    private RuleLocationProtocol protocol;
    private String path;
    
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RuleLocationProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(RuleLocationProtocol protocol) {
        this.protocol = protocol;
    }

}
