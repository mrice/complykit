package org.complykit;

import java.util.List;

/**
 * I set this up as a separate class so we could support IoC frameworks
 *
 * Created 12-dec-2010
 * @author michael
 *
 */
public class EvaluatorConfiguration {
	private boolean stateless=true;
	private List<String> rules=null;
	public boolean isStateless() {
		return stateless;
	}
	public void setStateless(boolean stateless) {
		this.stateless = stateless;
	}
	public List<String> getRules() {
		return rules;
	}
	public void setRules(List<String> rules) {
		this.rules = rules;
	}
	
	
	
}
