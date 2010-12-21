package org.complykit.assess;

import org.complykit.EvaluatorConfiguration;

public class Assessment {
	/*
	 * I think this might be handy for testing and for clients to know
	 * how their assessment was run.
	 */
	private EvaluatorConfiguration evaluatorConfiguration=null;

	public EvaluatorConfiguration getEvaluatorConfiguration() {
		return evaluatorConfiguration;
	}

	public void setEvaluatorConfiguration(
			EvaluatorConfiguration evaluatorConfiguration) {
		this.evaluatorConfiguration = evaluatorConfiguration;
	}
	
	
}
