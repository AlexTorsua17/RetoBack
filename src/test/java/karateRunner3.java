import com.intuit.karate.junit5.Karate;

public class karateRunner3 {
    @Karate.Test
    Karate testSample() {
        return Karate.run("classpath:karateTest.feature");
    }
}
