import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestNetty {

    public static final Logger logger = LoggerFactory.getLogger("InfoLogger");

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        logger.info("Junit test start");
    }

    @Test
    public void test() throws Exception {
        Assert.assertTrue(true);
    }



    @AfterClass
    public static void endJunitTest() throws Exception {
        logger.info("Junit test start");
    }


}
