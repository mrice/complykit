/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.complykit.config;

import org.complykit.Evaluator;
import org.complykit.assess.Assessment;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michael
 */
public class EvaluatorConfigurationTest {

    public EvaluatorConfigurationTest() {  }

    @BeforeClass
    public static void setUpClass() throws Exception {   }

    @AfterClass
    public static void tearDownClass() throws Exception {   }

    /*
     * Probably use just one Evaluator for the whole test
     */
    private Evaluator evaluator = null;

    /*
     * Probably use just one Assessment for the whole test
     */
    private Assessment assessment = null;

    @Before
    public void setUp() {   
        this.evaluator = new Evaluator();
        this.assessment = evaluator.assess(null);
    }

    /**
     * Just remove any references
     */
    @After
    public void tearDown() {          
        this.evaluator = null;
        this.assessment = null;
    }

    /**
     * Very simple test to make sure the rule locations are not null
     */
    @Test
    public void testAssessmentConfigurationNotNull() {
        assertTrue(assessment.getEvaluatorConfiguration()!=null);
    }

    /**
     * Make sure the DefaultConfiguration sets rule locations to a non-null
     * value.
     */
    @Test
    public void testConfigurationRuleLocationsNotNull() {
        assertTrue(assessment.getEvaluatorConfiguration().getRuleLocations()!=null);
    }

    /**
     * Make sure the DefaultConfiguration does not preset any rule locations
     * either. Sounds trivial, but this could create all kinds of nasty bugs.
     */
    @Test
    public void testConfigurationRuleLocationCountZero() {
        assertTrue(assessment.getEvaluatorConfiguration().getRuleLocations().isEmpty());
    }

}