package org.complykit.core;

import java.util.ArrayList;
import org.complykit.config.EvaluatorConfiguration;
import org.complykit.config.RuleLocation;
/**
 * Yes, could have done it with config files, but I think this makes
 * it really, really easy to get up and running fast.
 * 
 * I'm also not really sure whether this class really adds anything
 * or if I should just tuck all the default configuration stuff into
 * the EvaluatorConfiguration class.... Somehow this *feels* right,
 * in that it might make it easier for us to do a little more advanced
 * processing in the default.
 * 
 * Created 12-dec-2010
 * @author michael
 *
 */
public class DefaultEvaluatorConfiguration extends EvaluatorConfiguration {

    public DefaultEvaluatorConfiguration() {
        super();
        this.ruleLocations=new ArrayList<RuleLocation>();
    }

}
