package org.complykit;

import java.util.Collection;

import org.complykit.assess.Assessment;
import org.complykit.core.DefaultEvaluatorConfiguration;

/**
 * Yeah, I'm kind of modeling right in the code for now. Just back off.
 * 
 * Created 12-dec-2010
 * @author michael
 *
 */
public class Evaluator {
	
	/*
	 * I want to be able to run an evaluator without the client having
	 * to know too much about whether it's going to be stateless or 
	 * stateful session, or really having to do much at all (unless
	 * they want to)
	 */
	private EvaluatorConfiguration config=null;
	
	/*
	 * For running in a stateful mode
	 */
	private Collection workingFacts=null;
	/*
	 * For running in a stateful mode
	 */
	private Assessment workingAssessment=null;
	/*
	 * Just need to make sure we're able to instantiate without a config.
	 */
	public Evaluator() { 
		this.config=new DefaultEvaluatorConfiguration();
	}
	
	public Evaluator(EvaluatorConfiguration config) {
		this.config=config;
	}
	
	/*
	 * It probably could be this simple, couldn't it??
	 */
	public Assessment assess(Collection facts) {
		if (this.config.isStateless()) 
			//TODO: think through how this would work out in a server container
			return runStatelessAssessment(facts); 
		else
			return runStatefulAssessment(facts);
	}
	

	/*
	 * Maybe not the best idea to plug all the implementation
	 * stuff right into this class... maybe too complicated 
	 * when trying to run in a container??
	 */
	private Assessment runStatelessAssessment(Collection facts) {
		Assessment result=new Assessment();
		result.setEvaluatorConfiguration(config);
		return result;
	}
	
	/*
	 * Maybe not the best idea to plug all the implementation
	 * stuff right into this class... maybe too complicated 
	 * when trying to run in a container??
	 */
	private Assessment runStatefulAssessment(Collection facts) {
		Assessment result=new Assessment();
		result.setEvaluatorConfiguration(config);
		return result;
	}
	
}
