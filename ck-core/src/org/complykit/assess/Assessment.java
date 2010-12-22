package org.complykit.assess;

import java.util.ArrayList;
import java.util.List;
import org.complykit.config.EvaluatorConfiguration;

/**
 * Date created: 2010-dec-18
 * @author michael
 * @since 0.1
 */
public class Assessment {
	/*
	 * I think it might be a good idea for the Assessment to store and then
     * expose details about the Evaluator's configuration. You never know when
     * a client needs details about how the evaluation was executed.
	 */
	private EvaluatorConfiguration evaluatorConfiguration=null;

    /*
     * An ArrayList of issues
     */
    //TODO: decide whether ArrayList is really want you want
    private List<Issue> issues=new ArrayList<Issue>();

    /*
     * An ArrayList of risks
     */
    //TODO: decide whether ArrayList is really want you want
    private List<Risk> risks=new ArrayList<Risk>();

	public EvaluatorConfiguration getEvaluatorConfiguration() {
		return evaluatorConfiguration;
	}

	public void setEvaluatorConfiguration(
			EvaluatorConfiguration evaluatorConfiguration) {
		this.evaluatorConfiguration = evaluatorConfiguration;
	}

    /**
     * For now, we'll just let clients touch the List object directly
     * @since 0.1
     * @return a list of Issue
     */
	public List getIssues() {
        return this.issues;
    }

    /**
     * For now, we'll just let clients touch the List object directly
     * @since 0.1
     * @return a list of Risk
     */
    public List getRisks() {
        return this.risks;
    }
}
