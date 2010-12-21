package test.com.complykit.demos.wagehour;

import com.complykit.demos.wagehour.*;

import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.eclipse.jdt.internal.eval.Evaluator;

import junit.framework.TestCase;

public class TestCase01 extends TestCase {

	private KnowledgeBase kbase=null;
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void verifyBasicRecordKeepingRawData() {
		Evaluator eval=new Evaluator();
		Employee employee=new Employee();
		employee.setDob(null);
		
	}

}
