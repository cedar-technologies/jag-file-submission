package ca.bc.gov.open.jagefilingapi.submission;

import ca.bc.gov.open.jagefilingapi.submission.service.SubmissionService;
import ca.bc.gov.open.jagefilingapi.submission.service.SubmissionServiceImpl;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.cache.CacheManager;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ConfigTest {

    private SubmissionConfig sut;

    @Mock
    CacheManager cacheManagerMock;

    @BeforeAll
    public void setUp() {

        MockitoAnnotations.initMocks(this);

        sut = new SubmissionConfig();
    }

    @Test
    @DisplayName("CASE 2: returns the SubmissionService")
    public void testGetSubmissionService()  {

        SubmissionService actual = sut.submissionService();
        Assertions.assertEquals(SubmissionServiceImpl.class, actual.getClass());

    }

}
