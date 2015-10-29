package com.myretail.functional.util

import com.myretail.CaseStudyApplication
import com.myretail.util.LoadBatchData;

import org.springframework.boot.test.SpringApplicationContextLoader

import spock.lang.Specification;

@Slf4j
@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = CaseStudyApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port=0")
@ActiveProfiles("nocache")
class AtpFunctionalTest extends Specification {
	
	void "setupSpec" () {
		cleanupSpec()
		
	}
	
	void "cleanupSpec" () {
		
	}
	
	
}
