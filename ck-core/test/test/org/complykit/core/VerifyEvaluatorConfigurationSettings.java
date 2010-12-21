package test.org.complykit.core;

import org.complykit.Evaluator;
import org.complykit.assess.Assessment;

import junit.framework.TestCase;

public class VerifyEvaluatorConfigurationSettings extends TestCase {
	public void testDefaultStatelessSettings() {
		Evaluator eval=new Evaluator();
		Assessment assess=eval.assess(null);
		assertTrue(assess.getEvaluatorConfiguration().isStateless());
	}
}
