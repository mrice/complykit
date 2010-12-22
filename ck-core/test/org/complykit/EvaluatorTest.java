/*
 * Autogen'd comments
 */
package org.complykit;

import java.util.Collection;
import org.complykit.assess.Assessment;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Date created: 2010-dec-21 (shortest day of the year)
 * @author michael
 * @since 0.1
 */
public class EvaluatorTest {

    public EvaluatorTest() { }

    @BeforeClass
    public static void setUpClass() throws Exception {  }

    @AfterClass
    public static void tearDownClass() throws Exception {  }

    @Before
    public void setUp() {  }

    @After
    public void tearDown() {  }

    /**
     * This is possibly the most basic, simple test the system could possibly
     * run. It is somewhat valuable in that I actually do think the system
     * should not freak out if someone passes a null set of facts. There might
     * be instances where the rules files do some processing with no facts
     * passed at all.
     * This test also validates that an Assessment comes back with a non-null
     * set of Issues and Risks
     */
    @Test
    public void testAssessWithNullFactsAndNoConfig() {
        Collection facts = null;
        Evaluator evaluator = new Evaluator();
        Assessment assessment = evaluator.assess(facts);
        assertTrue(assessment.getIssues()!=null);
        assertTrue(assessment.getRisks()!=null);
    }

}