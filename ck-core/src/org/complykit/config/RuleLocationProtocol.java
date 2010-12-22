/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.complykit.config;

/**
 * So, eventually I want to add more sophisticated and interesting types, but
 * I think for now HTTP and FILE will be good enough.
 *
 * Frankly, however, I'm not 100% sure I need this class. Couldn't I just do
 * the same thing with a string that specifies the protocol??? What's the point
 * of this class?
 *
 * Date-created: 21-dec-2010
 * @author michael
 * @since 0.1
 */
public enum RuleLocationProtocol {
    FILE, HTTP
}
