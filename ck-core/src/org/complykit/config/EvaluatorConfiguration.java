package org.complykit.config;

import java.util.ArrayList;
import java.util.List;

/**
 * I set this up as a separate class so we could support IoC frameworks
 *
 * Created 12-dec-2010
 * @author michael
 *
 */
public class EvaluatorConfiguration {
	protected List<RuleLocation> ruleLocations;

    public List<RuleLocation> getRuleLocations() {
        return ruleLocations;
    }

}
